package com.wang.bean;

import java.util.Date;
import java.util.List;

public class User {
	
	private Long id;
	private String type;	//用户类型
	private UserInfo userInfo;
	private Date creatDate;
	private String password1;		//密码
	private String passwords;		//密码
	private String username;		//登录名
    private String password;		//密码
 	private List<Role> roles;	
    
    public User() {
		super();
	}
    
	public User(Long id) {
		super();
		this.id = id;
	}

		public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public UserInfo getUserInfo() {
		return userInfo;
	}

	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setUserInfo(UserInfo InfouserInfo) {
		this.userInfo = InfouserInfo;
	}

	public Date getCreatDate() {
		return creatDate;
	}


	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}

	public String getPassword1() {
		return password1;
	}


	public void setPassword2(String password1) {
		this.password1 = password1;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String toString() {
		return id+"	"+username+"  "+userInfo.getPersonName()+"	"+userInfo.getEmail()+"	"+userInfo.getPhone();
	}

	public String getRoledata() {
		StringBuilder role_info=new StringBuilder("			"+userInfo.getPersonName()+"  :	");
		for(Role role:roles) {
			role_info.append("      ").append(role.getDetail());
		}
		return role_info.toString();
	}
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
