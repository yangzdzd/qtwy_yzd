package com.qtwy.dao;


import com.qtwy.entity.Job;
import com.qtwy.entity.JobExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobMapper {


	int countByExample(JobExample example);


	int deleteByExample(JobExample example);


	int deleteByPrimaryKey(Integer jobId);


	int insert(Job record);


	int insertSelective(Job record);


	List<Job> selectByExample(JobExample example);


	Job selectByPrimaryKey(Integer jobId);


	int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);


	int updateByExample(@Param("record") Job record, @Param("example") JobExample example);


	int updateByPrimaryKeySelective(Job record);


	int updateByPrimaryKey(Job record);
}