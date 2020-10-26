package com.wang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wang.bean.User;
import com.wang.dao.UserDao;
import com.wang.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	public List<User> queryAll() {
		List<User>users=userDao.queryAll();
		return users;
	}

	@Override
	public List<User> getUserAndRoles(String username) {
		List<User>users= userDao.getUserAndRoles(username);
		return users;
	}
	
	  /**
     * 多条件分页查询用户
     * @param userParam
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<User> queryByPage(User userParam,Integer pageNum,Integer pageSize) {
        //利用PageHelper分页查询 注意：这个一定要放查询语句的前一行,否则无法进行分页,因为它对紧随其后第一个sql语句有效
        PageHelper.startPage(pageNum, pageSize);//前一句 1
        List<User>users=userDao.queryAll();
        PageInfo<User> pageInfo = new PageInfo<User>(users);//后一句 2
        /**
         * 在执行mapper接口的前后各一条动作，缺一不可
         */
        return pageInfo;
    }
}
