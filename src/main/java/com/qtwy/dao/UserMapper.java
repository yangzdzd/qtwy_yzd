package com.qtwy.dao;


import com.qtwy.entity.User;
import com.qtwy.entity.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

	int countByExample(UserExample example);


	int deleteByExample(UserExample example);


	int deleteByPrimaryKey(Integer uid);


	int insert(User record);


	int insertSelective(User record);


	List<User> selectByExample(UserExample example);


	User selectByPrimaryKey(Integer uid);


	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);


	int updateByExample(@Param("record") User record, @Param("example") UserExample example);


	int updateByPrimaryKeySelective(User record);


	int updateByPrimaryKey(User record);

	List<User> findAll();
}