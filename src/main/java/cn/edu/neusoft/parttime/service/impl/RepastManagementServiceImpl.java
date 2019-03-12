/**
 * 
 */
package cn.edu.neusoft.parttime.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.neusoft.parttime.dao.RepastManagementMapper;
import cn.edu.neusoft.parttime.model.RepastManagement;
import cn.edu.neusoft.parttime.service.RepastManagementService;

/**
 *
 * cn.edu.neusoft.parttime.service.impl
 *
 */
@Service
@Transactional
public class RepastManagementServiceImpl implements RepastManagementService {
	
	@Autowired
	private RepastManagementMapper repastManagementMapper;

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectAll()
	 */
	@Override
	public List<RepastManagement> selectAll() {
		return repastManagementMapper.selectAll();
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return repastManagementMapper.deleteByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#insert(java.lang.Object)
	 */
	@Override
	public int insert(RepastManagement record) {
		return repastManagementMapper.insert(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#insertSelective(java.lang.Object)
	 */
	@Override
	public int insertSelective(RepastManagement record) {
		return repastManagementMapper.insertSelective(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public RepastManagement selectByPrimaryKey(Integer id) {
		return repastManagementMapper.selectByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#updateByPrimaryKeySelective(java.lang.Object)
	 */
	@Override
	public int updateByPrimaryKeySelective(RepastManagement record) {
		return repastManagementMapper.updateByPrimaryKeySelective(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#updateByPrimaryKey(java.lang.Object)
	 */
	@Override
	public int updateByPrimaryKey(RepastManagement record) {
		return repastManagementMapper.updateByPrimaryKey(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectLatest(java.lang.Integer)
	 */
	@Override
	public List<RepastManagement> selectLatest(int number) {
		return repastManagementMapper.selectLatest(number);
	}

}
