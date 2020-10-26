package com.wang.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

@ConditionalOnBean
public class Role {
	private Long id;
	
	private String rolename;
	
	private String detail;
	
	
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
