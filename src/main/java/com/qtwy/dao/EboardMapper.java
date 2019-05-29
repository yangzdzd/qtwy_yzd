package com.qtwy.dao;


import com.qtwy.entity.Eboard;
import com.qtwy.entity.EboardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EboardMapper {


	int countByExample(EboardExample example);


	int deleteByExample(EboardExample example);


	int deleteByPrimaryKey(Integer eid);


	int insert(Eboard record);


	int insertSelective(Eboard record);


	List<Eboard> selectByExample(EboardExample example);


	Eboard selectByPrimaryKey(Integer eid);


	int updateByExampleSelective(@Param("record") Eboard record, @Param("example") EboardExample example);


	int updateByExample(@Param("record") Eboard record, @Param("example") EboardExample example);


	int updateByPrimaryKeySelective(Eboard record);


	int updateByPrimaryKey(Eboard record);
}