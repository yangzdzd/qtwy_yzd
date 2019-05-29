package com.qtwy.dao;

import com.qtwy.pojoExt.JobInfoExt;

import java.util.List;
import java.util.Map;


public interface JobInfoExtMapper {
	/*
	 * 查看所有工作职位,外加模糊查询.
	 * */
	public List<JobInfoExt> findAll(Map<String, Object> map);
}
