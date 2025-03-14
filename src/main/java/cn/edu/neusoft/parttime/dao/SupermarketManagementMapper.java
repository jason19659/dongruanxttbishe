package cn.edu.neusoft.parttime.dao;

import java.util.List;

import cn.edu.neusoft.parttime.model.FlyerManagement;
import cn.edu.neusoft.parttime.model.SupermarketManagement;

public interface SupermarketManagementMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supermarket_management
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	int deleteByPrimaryKey(Integer id);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supermarket_management
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	int insert(SupermarketManagement record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supermarket_management
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	int insertSelective(SupermarketManagement record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supermarket_management
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	SupermarketManagement selectByPrimaryKey(Integer id);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supermarket_management
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	int updateByPrimaryKeySelective(SupermarketManagement record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table supermarket_management
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	int updateByPrimaryKey(SupermarketManagement record);
	List<SupermarketManagement> selectLatest(int number);
	List<SupermarketManagement> selectAll();
}