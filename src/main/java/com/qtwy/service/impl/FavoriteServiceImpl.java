package com.qtwy.service.impl;

import com.qtwy.dao.FavoritesMapper;
import com.qtwy.entity.Favorites;
import com.qtwy.entity.FavoritesExample;
import com.qtwy.service.IFavoriteService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class FavoriteServiceImpl implements IFavoriteService {
	@Autowired
	public FavoritesMapper favoritesMapper;
	/**
	 * 判断是否是第一次收藏
	 * */
	public Favorites findFavoriteByAll_(String realname, String jobAddress, String jobName, String companyName) {
		FavoritesExample example=new FavoritesExample();
		FavoritesExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(realname)) {
			criteria.andRealnameEqualTo(realname);
		}
		if (StringUtils.isNotBlank(jobAddress)) {
			criteria.andJobAddressEqualTo(jobAddress);
		}
		if (StringUtils.isNotBlank(jobName)) {
			criteria.andJobNameEqualTo(jobName);
		}
		if (StringUtils.isNotBlank(companyName)) {
			criteria.andCompanyNameEqualTo(companyName);
		}
		List<Favorites> favoritesList = favoritesMapper.selectByExample(example);
		if (favoritesList != null && !favoritesList.isEmpty()) {
			return favoritesList.get(0);
		}
		return null;
	}
	/**
	 * 插入收藏
	 * */
	public int insertFavorite(Favorites favorites_) {
		int result = favoritesMapper.insert(favorites_);
		return result;
	}
	/**
	 * 查询职位收藏记录
	 * */
	public List<Favorites> findFavoriteByRealName(String realname) {
		FavoritesExample example=new FavoritesExample();
		FavoritesExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(realname)) {
			criteria.andRealnameEqualTo(realname);
		}
		//根据真实名字查询
		List<Favorites> favoritesList = favoritesMapper.selectByExample(example);
		if (favoritesList != null && !favoritesList.isEmpty()) {
			return favoritesList;
		}
		return null;
	}

}
