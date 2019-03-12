/**
 * 
 */
package cn.edu.neusoft.parttime.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.neusoft.parttime.dao.TutorManagementMapper;
import cn.edu.neusoft.parttime.model.TutorManagement;
import cn.edu.neusoft.parttime.service.TutorManagementService;

/**
 *
 * cn.edu.neusoft.parttime.service.impl
 *
 */
@Service
@Transactional
public class TutorManagementServiceImpl implements TutorManagementService{
	
	@Autowired
	private TutorManagementMapper tutorManagementMapper;

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectAll()
	 */
	@Override
	public List<TutorManagement> selectAll() {
		return tutorManagementMapper.selectAll();
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return tutorManagementMapper.deleteByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#insert(java.lang.Object)
	 */
	@Override
	public int insert(TutorManagement record) {
		return tutorManagementMapper.insert(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#insertSelective(java.lang.Object)
	 */
	@Override
	public int insertSelective(TutorManagement record) {
		return tutorManagementMapper.insertSelective(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public TutorManagement selectByPrimaryKey(Integer id) {
		return tutorManagementMapper.selectByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#updateByPrimaryKeySelective(java.lang.Object)
	 */
	@Override
	public int updateByPrimaryKeySelective(TutorManagement record) {
		return tutorManagementMapper.updateByPrimaryKeySelective(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#updateByPrimaryKey(java.lang.Object)
	 */
	@Override
	public int updateByPrimaryKey(TutorManagement record) {
		return tutorManagementMapper.updateByPrimaryKey(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectLatest(java.lang.Integer)
	 */
	@Override
	public List<TutorManagement> selectLatest(int number) {
		return tutorManagementMapper.selectLatest(number);
	}

}
