package cn.edu.neusoft.parttime.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class RepastManagement {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repast_management.id
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repast_management.name
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repast_management.phone
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repast_management.address
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repast_management.requirement
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	private String requirement;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repast_management.person_count
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	private Integer personCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repast_management.pub_date
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date pubDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repast_management.salary
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	private String salary;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repast_management.title
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	private String title;
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column repast_management.id
	 * @return  the value of repast_management.id
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column repast_management.id
	 * @param id  the value for repast_management.id
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column repast_management.name
	 * @return  the value of repast_management.name
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column repast_management.name
	 * @param name  the value for repast_management.name
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column repast_management.phone
	 * @return  the value of repast_management.phone
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column repast_management.phone
	 * @param phone  the value for repast_management.phone
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column repast_management.address
	 * @return  the value of repast_management.address
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column repast_management.address
	 * @param address  the value for repast_management.address
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column repast_management.requirement
	 * @return  the value of repast_management.requirement
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public String getRequirement() {
		return requirement;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column repast_management.requirement
	 * @param requirement  the value for repast_management.requirement
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column repast_management.person_count
	 * @return  the value of repast_management.person_count
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public Integer getPersonCount() {
		return personCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column repast_management.person_count
	 * @param personCount  the value for repast_management.person_count
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public void setPersonCount(Integer personCount) {
		this.personCount = personCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column repast_management.pub_date
	 * @return  the value of repast_management.pub_date
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public Date getPubDate() {
		return pubDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column repast_management.pub_date
	 * @param pubDate  the value for repast_management.pub_date
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column repast_management.salary
	 * @return  the value of repast_management.salary
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column repast_management.salary
	 * @param salary  the value for repast_management.salary
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column repast_management.title
	 * @return  the value of repast_management.title
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column repast_management.title
	 * @param title  the value for repast_management.title
	 * @mbg.generated  Tue Mar 12 16:43:29 CST 2019
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}