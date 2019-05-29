package com.qtwy.dao;


import com.qtwy.entity.Apply;
import com.qtwy.entity.ApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplyMapper {

	int countByExample(ApplyExample example);


	int deleteByExample(ApplyExample example);


	int deleteByPrimaryKey(Integer sid);


	int insert(Apply record);


	int insertSelective(Apply record);


	List<Apply> selectByExample(ApplyExample example);


	Apply selectByPrimaryKey(Integer sid);


	int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);


	int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);


	int updateByPrimaryKeySelective(Apply record);


	int updateByPrimaryKey(Apply record);

	List<Apply> findAll();
}