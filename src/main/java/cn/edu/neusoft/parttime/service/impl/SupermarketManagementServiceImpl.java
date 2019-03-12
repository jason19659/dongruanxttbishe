/**
 * 
 */
package cn.edu.neusoft.parttime.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.neusoft.parttime.dao.SupermarketManagementMapper;
import cn.edu.neusoft.parttime.model.SupermarketManagement;
import cn.edu.neusoft.parttime.service.SupermarketManagementService;

/**
 *
 * cn.edu.neusoft.parttime.service.impl
 *
 */
@Service
@Transactional
public class SupermarketManagementServiceImpl implements SupermarketManagementService{
	
	@Autowired
	private SupermarketManagementMapper supermarketManagementMapper;

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectAll()
	 */
	@Override
	public List<SupermarketManagement> selectAll() {
		return supermarketManagementMapper.selectAll();
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return supermarketManagementMapper.deleteByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#insert(java.lang.Object)
	 */
	@Override
	public int insert(SupermarketManagement record) {
		return supermarketManagementMapper.insert(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#insertSelective(java.lang.Object)
	 */
	@Override
	public int insertSelective(SupermarketManagement record) {
		return supermarketManagementMapper.insertSelective(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public SupermarketManagement selectByPrimaryKey(Integer id) {
		return supermarketManagementMapper.selectByPrimaryKey(id);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#updateByPrimaryKeySelective(java.lang.Object)
	 */
	@Override
	public int updateByPrimaryKeySelective(SupermarketManagement record) {
		return supermarketManagementMapper.updateByPrimaryKeySelective(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#updateByPrimaryKey(java.lang.Object)
	 */
	@Override
	public int updateByPrimaryKey(SupermarketManagement record) {
		return supermarketManagementMapper.updateByPrimaryKey(record);
	}

	/* 
	 * @see cn.edu.neusoft.parttime.service.BaseManagementService#selectLatest(java.lang.Integer)
	 */
	@Override
	public List<SupermarketManagement> selectLatest(int number) {
		return supermarketManagementMapper.selectLatest(number);
	}

}
