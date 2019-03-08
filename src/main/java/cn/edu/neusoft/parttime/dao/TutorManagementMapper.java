package cn.edu.neusoft.parttime.dao;

import java.util.List;

import cn.edu.neusoft.parttime.model.TutorManagement;

public interface TutorManagementMapper {
	List<TutorManagement> selectAll();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tutor_management
     *
     * @mbg.generated Thu Mar 07 17:21:22 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tutor_management
     *
     * @mbg.generated Thu Mar 07 17:21:22 CST 2019
     */
    int insert(TutorManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tutor_management
     *
     * @mbg.generated Thu Mar 07 17:21:22 CST 2019
     */
    int insertSelective(TutorManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tutor_management
     *
     * @mbg.generated Thu Mar 07 17:21:22 CST 2019
     */
    TutorManagement selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tutor_management
     *
     * @mbg.generated Thu Mar 07 17:21:22 CST 2019
     */
    int updateByPrimaryKeySelective(TutorManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tutor_management
     *
     * @mbg.generated Thu Mar 07 17:21:22 CST 2019
     */
    int updateByPrimaryKey(TutorManagement record);
}