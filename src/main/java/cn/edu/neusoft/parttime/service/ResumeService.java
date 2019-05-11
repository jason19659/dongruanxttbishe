/**
 * 
 */
package cn.edu.neusoft.parttime.service;

import java.util.List;

import cn.edu.neusoft.parttime.model.Resume;

/**
 * @author <a href="mailto:jason19659@163.com">jason19659</a>
 *
 * cn.edu.neusoft.parttime.service
 *
 * 2019年5月12日
 */
public interface ResumeService {
	int deleteByPrimaryKey(Integer id);

	int insert(Resume record);

	int insertSelective(Resume record);

	Resume selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Resume record);

	int updateByPrimaryKey(Resume record);
	
	List<Resume> selectAll();
}
