/**
 * 
 */
package cn.edu.neusoft.parttime.service;

import java.util.List;

/**
 *
 *         cn.edu.neusoft.parttime.service
 *
 */
public interface BaseManagementService<T> {
	
	List<T> selectLatest(int number);
	
	List<T> selectAll();

	int deleteByPrimaryKey(Integer id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
}
