/**
 * 
 */
package cn.edu.neusoft.parttime.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import cn.edu.neusoft.parttime.dao.UserMapper;
import cn.edu.neusoft.parttime.model.User;
import cn.edu.neusoft.parttime.service.UserService;

/**
 * @author <a href="mailto:jason19659@163.com">jason19659</a>
 *
 * cn.edu.neusoft.parttime.service.impl
 *
 * 2019年3月8日
 */
@Service
@Transactional

public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	

	/* 
	 * @see cn.edu.neusoft.parttime.service.UserService#countAdmin()
	 */
	@Override
	public Integer countAdmin() {
		return userMapper.countAdmin();
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.UserService#selectAll()
	 */
	@Override
	public List<User> selectAll() {
		return userMapper.selectAll();
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.UserService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		User user = selectByPrimaryKey(id);
		if ("admin".equals(user.getRole())) {
			Integer countAdmin = countAdmin();
			if (countAdmin <= 1) {
				return 0;
			}
		}
		return userMapper.deleteByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.UserService#insert(cn.edu.neusoft.parttime.model.User)
	 */
	@Override
	public int insert(User record) {
		if (selectByUsername(record.getUsername()) != null) {
			return -1;
		}
		record.setRegDate(new Date());
		String md5Hex = DigestUtils.md5Hex(record.getPassword());
		record.setPassword(md5Hex);
		return userMapper.insert(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.UserService#insertSelective(cn.edu.neusoft.parttime.model.User)
	 */
	@Override
	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.UserService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.UserService#updateByPrimaryKeySelective(cn.edu.neusoft.parttime.model.User)
	 */
	@Override
	public int updateByPrimaryKeySelective(User record) {
		User user = selectByUsername(record.getUsername());
		if (user != null && user.getId() != record.getId()) {
			return -1;
		}
		if (!StringUtils.isEmpty(record.getPassword())) {
			record.setPassword(DigestUtils.md5Hex(record.getPassword()) );
		} else {
			record.setPassword(null);
		}
		return userMapper.updateByPrimaryKeySelective(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.UserService#updateByPrimaryKey(cn.edu.neusoft.parttime.model.User)
	 */
	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.UserService#selectByUsername(java.lang.String)
	 */
	@Override
	public User selectByUsername(String username) {
		return userMapper.selectByUsername(username);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public User login(String username, String password) {
		User selectByUsername = selectByUsername(username);
		String md5Password = DigestUtils.md5Hex(password);
		if (selectByUsername.getPassword().equals(md5Password) ) {
			return selectByUsername;
		}
		return null;
	}

}
