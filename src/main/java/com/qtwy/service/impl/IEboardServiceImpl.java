package com.qtwy.service.impl;

import com.qtwy.dao.EboardMapper;
import com.qtwy.entity.Eboard;
import com.qtwy.entity.EboardExample;
import com.qtwy.service.IEboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class IEboardServiceImpl implements IEboardService {
	
	@Autowired
	public EboardMapper eboardMapper;
	
	/**
	 * 查询所有新闻和公告
	 * */
	public List<Eboard> findAllJournalism() {
		EboardExample example=new EboardExample();
		List<Eboard> eboardList = eboardMapper.selectByExample(example);
		if (eboardList != null && !eboardList.isEmpty()) {
			return eboardList;
		}
		return null;
	}
	/*
	* 删除新闻
	* */
	@Override
	public void delete(Integer eid) {
		eboardMapper.deleteByPrimaryKey(eid);
	}

	/*
	* 修改新闻
	* */
	@Override
	public void update(Eboard eboard) {
		eboardMapper.updateByPrimaryKey(eboard);
	}

	@Override
	public Eboard selectOne(Integer eid) {
		return eboardMapper.selectByPrimaryKey(eid);
	}

	@Override
	public void insert(Eboard eboard) {
		eboardMapper.insert(eboard);
	}


}
