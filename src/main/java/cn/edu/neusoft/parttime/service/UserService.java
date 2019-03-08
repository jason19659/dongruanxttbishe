/**
 * 
 */
package cn.edu.neusoft.parttime.service;

import java.util.List;

import cn.edu.neusoft.parttime.model.User;

/**
 * @author <a href="mailto:jason19659@163.com">jason19659</a>
 *
 *         cn.edu.neusoft.parttime.service
 *
 *         2019年3月8日
 */
public interface UserService {
	Integer countAdmin();

	List<User> selectAll();

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
	
	User selectByUsername(String username);
}
