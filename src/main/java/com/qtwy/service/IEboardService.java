package com.qtwy.service;

import com.qtwy.entity.Eboard;

import java.util.List;


public interface IEboardService {
	/**
	 *查询所有新闻和公告
	 * */
	List<Eboard> findAllJournalism();

	void delete(Integer eid);

	void update(Eboard eboard);

	Eboard selectOne(Integer eid);

	void insert(Eboard eboard);

}	
