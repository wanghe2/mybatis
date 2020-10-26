package com.wang.bean;

import java.io.Serializable;


/**
 * 用户详细信息类
 * @author Bo.Chen
 *
 */
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 6089427509570232347L;
	
	private Long id;
	private String personName;	//真实姓名
	private String gender;		//性别
	private String email;
	private String phone;		
	private String userUnit;	//所属单位
	private String adminUnit;	//管理单位
	private String remark;	//备注
	private User user;
	
	public UserInfo() {
		super();
	}
	
	public UserInfo(Long id) {
		super();
		this.id = id;
	}

	
	public UserInfo(User user) {
		super();
		this.user = user;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserUnit() {
		return userUnit;
	}

	public void setUserUnit(String userUnit) {
		this.userUnit = userUnit;
	}

	public String getAdminUnit() {
		return adminUnit;
	}

	public void setAdminUnit(String adminUnit) {
		this.adminUnit = adminUnit;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final UserInfo other = (UserInfo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}
