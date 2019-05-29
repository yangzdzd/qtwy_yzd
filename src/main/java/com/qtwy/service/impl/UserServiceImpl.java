package com.qtwy.service.impl;

import com.qtwy.dao.UserMapper;
import com.qtwy.entity.User;
import com.qtwy.entity.UserExample;
import com.qtwy.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional

public class UserServiceImpl implements IUserService {

	@Autowired
	public UserMapper userMapper;

	@Override
	public void save(User user) {
		userMapper.insert(user);
	}

	public List<User> findAll() {
		List<User> list = userMapper.findAll();
		return list;
	}

	// 根据id查询用户
	public User findById(Integer uid) {
		User user = userMapper.selectByPrimaryKey(uid);
		return user;
	}

	// 根据id进行删除
	public void deleteById(Integer uid) {
		userMapper.deleteByPrimaryKey(uid);
	}

	@Override
	public void updateUser(Integer uid, User user) {
		user.setUid(uid);
		userMapper.updateByPrimaryKey(user);
	}
	
	
	/**
	 * 根据名字和密码查询用户
	 * */
	public User getUserByNameAndPwd(String loginName, String loginPwd) {
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(loginName)) {
			criteria.andLoginNameEqualTo(loginName);
		}
		if (StringUtils.isNotBlank(loginPwd)) {
			criteria.andLoginPwdEqualTo(loginPwd);
		}
		List<User> userList = userMapper.selectByExample(example);
		if (userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}
	public void  saveResume(User user){
		userMapper.updateByPrimaryKey(user);
	}



	/**
	 * 根据用户登录名来查询
	 * */
	public int findByUserLoginName(String loginName) {
		int result=0; 
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(loginName)) {
			criteria.andLoginNameEqualTo(loginName);
		}
		List<User> userList = userMapper.selectByExample(example);
		if (userList==null||userList.isEmpty()) {
			return result;//说明没有该用户登录名字，可以注册
		}else{
			result=1;//该用户名称已经有了,不可以注册
		}	
		return result;
	}

	@Override
	public User findUserByRealname(String realname) {
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(realname)) {
			criteria.andRealnameEqualTo(realname);
		}
		List<User> userList = userMapper.selectByExample(example);
		if (userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
	}
}
