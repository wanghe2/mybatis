package com.wang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import com.wang.bean.User;

public interface UserDao {
	public List<User> queryAll();
	
	public List<User> getUserAndRoles(String username);
	
	/**
	 * MyBatis的接口绑定(注解方式)
	 * @param userId
	 * @return
	 */
	@Select("select * from t_user where id =#{userId}")
	public  User findUser(String userId);
	
	/**
	 * 利用rowBounds(limit和offset)分页,其实是 是基于内存的分页（查出所有记录再按偏移量和limit取结果）
	 * ，在大数据量的情况下这样的分页效率会很低，一般情况下我们会使用mybaits的分页辅助工具(如pagehelper)来完成分页
	 * @param rowBounds
	 * @return
	 */
	public List<User> findPageUsers(RowBounds rowBounds);
	
	/**
	 * 分页插件的原理 也是拦截器
	 */
}
