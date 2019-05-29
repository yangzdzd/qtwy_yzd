package com.qtwy.dao;


import com.qtwy.entity.Company;
import com.qtwy.entity.CompanyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyMapper {

	int countByExample(CompanyExample example);


	int deleteByExample(CompanyExample example);


	int deleteByPrimaryKey(Integer cid);


	int insert(Company record);


	int insertSelective(Company record);


	List<Company> selectByExample(CompanyExample example);


	Company selectByPrimaryKey(Integer cid);


	int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);


	int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);


	int updateByPrimaryKeySelective(Company record);


	int updateByPrimaryKey(Company record);

	List<Company> findAll();
}