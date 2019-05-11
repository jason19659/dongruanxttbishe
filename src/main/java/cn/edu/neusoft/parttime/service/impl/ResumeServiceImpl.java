/**
 * 
 */
package cn.edu.neusoft.parttime.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.neusoft.parttime.dao.ResumeMapper;
import cn.edu.neusoft.parttime.model.Resume;
import cn.edu.neusoft.parttime.service.ResumeService;

/**
 * @author <a href="mailto:jason19659@163.com">jason19659</a>
 *
 * cn.edu.neusoft.parttime.service
 *
 * 2019年5月12日
 */
@Service
public class ResumeServiceImpl implements ResumeService{
	@Autowired
	private ResumeMapper resumeMapper;

	/* 
	 * @see cn.edu.neusoft.parttime.service.ResumeService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return resumeMapper.deleteByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.ResumeService#insert(cn.edu.neusoft.parttime.model.Resume)
	 */
	@Override
	public int insert(Resume record) {
		return resumeMapper.insert(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.ResumeService#insertSelective(cn.edu.neusoft.parttime.model.Resume)
	 */
	@Override
	public int insertSelective(Resume record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.ResumeService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Resume selectByPrimaryKey(Integer id) {
		return resumeMapper.selectByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.ResumeService#updateByPrimaryKeySelective(cn.edu.neusoft.parttime.model.Resume)
	 */
	@Override
	public int updateByPrimaryKeySelective(Resume record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.ResumeService#updateByPrimaryKey(cn.edu.neusoft.parttime.model.Resume)
	 */
	@Override
	public int updateByPrimaryKey(Resume record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.ResumeService#selectAll()
	 */
	@Override
	public List<Resume> selectAll() {
		return resumeMapper.selectAll();
	}
}
