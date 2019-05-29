package com.qtwy.service.impl;

import com.qtwy.dao.ApplyMapper;
import com.qtwy.entity.Apply;
import com.qtwy.entity.ApplyExample;
import com.qtwy.service.IApplyJobService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ApplyJobServiceImpl implements IApplyJobService {
	@Autowired
	public ApplyMapper applyMapper;
	/**
	 * 根据工作名字查询职位
	 * */
	public Apply findApplyByAll(String realname, String jobAddress, String jobName) {
		ApplyExample example=new ApplyExample();
		ApplyExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(realname)) {
			criteria.andRealnameEqualTo(realname);
		}
		if (StringUtils.isNotBlank(jobAddress)) {
			criteria.andJobAddressEqualTo(jobAddress);
		}
		if (StringUtils.isNotBlank(jobName)) {
			criteria.andJobNameEqualTo(jobName);
		}
		List<Apply> applyList = applyMapper.selectByExample(example);
		if (applyList != null && !applyList.isEmpty()) {
			return applyList.get(0);
		}
		return null;
	}
	/**
	 * 插入具体职位值
	 * */
	public int insertApply(Apply newApply) {
		int result = applyMapper.insert(newApply);
		return result;
	}
	/**
	 * 根据ID删除职位投递记录
	 * */
	public void deleteById(Integer sid) {
		ApplyExample example=new ApplyExample();
		ApplyExample.Criteria criteria = example.createCriteria();
		criteria.andSidEqualTo(sid);
		applyMapper.selectByExample(example);
	}
	/**
	 * 根据真实姓名查询所有的申请记录
	 * */
	public List<Apply> findApplyRecordByRealname(String realname) {
		ApplyExample example=new ApplyExample();
		ApplyExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(realname)) {
			criteria.andRealnameEqualTo(realname);
		}
		//根据真实名字查询
		List<Apply> applyList_ = applyMapper.selectByExample(example);
		if (applyList_ != null && !applyList_.isEmpty()) {
			return applyList_;
		}
		return null;
	}
	/**
	 * 根据企业名查询所有的申请者
	 * */
	public List<Apply> findAllByCompanyName(String companyName) {
		ApplyExample example=new ApplyExample();
		ApplyExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(companyName)) {
			criteria.andCompanyNameEqualTo(companyName);
		}
		List<Apply> applyList_ = applyMapper.selectByExample(example);
		if (applyList_ != null && !applyList_.isEmpty()) {
			return applyList_;
		}
		return null;
	}
}
