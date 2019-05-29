package com.qtwy.service;

import com.qtwy.entity.Favorites;

import java.util.List;


public interface IFavoriteService {
	/**
	 * 判断是否是第一次收藏
	 * */
	public Favorites findFavoriteByAll_(String realname, String jobAddress, String jobName, String companyName);
	/**
	 * 插入新的收藏
	 * */
	public int insertFavorite(Favorites favorites_);
	/**
	 * 查询职位收藏记录
	 * */
	public List<Favorites> findFavoriteByRealName(String realname);
	
}
