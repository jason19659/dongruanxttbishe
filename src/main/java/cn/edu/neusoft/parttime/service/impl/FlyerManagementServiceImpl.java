/**
 * 
 */
package cn.edu.neusoft.parttime.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.neusoft.parttime.dao.FlyerManagementMapper;
import cn.edu.neusoft.parttime.model.FlyerManagement;
import cn.edu.neusoft.parttime.service.FlyerManagementService;

/**
 *
 * cn.edu.neusoft.parttime.service.impl
 *
 */
@Service
@Transactional
public class FlyerManagementServiceImpl implements FlyerManagementService {
	
	@Autowired
	private FlyerManagementMapper flyerManagementMapper;

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectAll()
	 */
	@Override
	public List<FlyerManagement> selectAll() {
		return flyerManagementMapper.selectAll();
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return flyerManagementMapper.deleteByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#insert(java.lang.Object)
	 */
	@Override
	public int insert(FlyerManagement record) {
		return flyerManagementMapper.insert(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#insertSelective(java.lang.Object)
	 */
	@Override
	public int insertSelective(FlyerManagement record) {
		return flyerManagementMapper.insertSelective(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public FlyerManagement selectByPrimaryKey(Integer id) {
		return flyerManagementMapper.selectByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#updateByPrimaryKeySelective(java.lang.Object)
	 */
	@Override
	public int updateByPrimaryKeySelective(FlyerManagement record) {
		return flyerManagementMapper.updateByPrimaryKeySelective(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#updateByPrimaryKey(java.lang.Object)
	 */
	@Override
	public int updateByPrimaryKey(FlyerManagement record) {
		return flyerManagementMapper.updateByPrimaryKey(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectLatest(java.lang.Integer)
	 */
	@Override
	public List<FlyerManagement> selectLatest(int number) {
		return flyerManagementMapper.selectLatest(number);
	}

}
