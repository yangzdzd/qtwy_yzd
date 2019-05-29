package com.qtwy.service.impl;

import com.qtwy.dao.CompanyMapper;
import com.qtwy.entity.Company;
import com.qtwy.entity.CompanyExample;
import com.qtwy.service.ICompanyService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
@Transactional
public class CompanyServiceImpl implements ICompanyService {
	
	@Autowired
	public CompanyMapper companyMapper;
	//公司登录
	public void save(Company Company) {
		companyMapper.insert(Company);
	}
	//查询所有公司
	public List<Company> findAll() {
		List<Company> companylist = companyMapper.findAll();
		return companylist;
	}
	//根据id查询用户
	public Company findCompanyById(Integer cid) {
		Company company = companyMapper.selectByPrimaryKey(cid);
		return company;
	}
	//根据id进行删除
	public void deleteById(Integer cid) {
		companyMapper.deleteByPrimaryKey(cid);
	}
	//登录
	public Company login(Company Company) {
		return null;
	}
	
	public void updateCompany(Company company) {
		companyMapper.updateByPrimaryKeySelective(company);
	}
	/**
	 * 查询登录名是否存在
	 * */
	public int findCompanyByName(String companyLoginName) {
		int result=0; 
		CompanyExample example = new CompanyExample();
		CompanyExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(companyLoginName)) {
			criteria.andCompanyLoginNameEqualTo(companyLoginName);
		}
		List<Company> companyList = companyMapper.selectByExample(example);
		if (companyList==null||companyList.isEmpty()) {
			return result;//说明没有该公司登录名
		}else{
			result=1;//该公司的登录名已经有了
		}	
		return result;
	}
	/**
	 * 企业登录时登录名和密码校验
	 * */
	public Company getCompanyByNameAndPwd(String companyLoginName, String companyPwd) {
		 CompanyExample example = new CompanyExample();
		 CompanyExample.Criteria criteria = example.createCriteria();
		 if (StringUtils.isNotBlank(companyLoginName)) {
				criteria.andCompanyLoginNameEqualTo(companyLoginName);
			}
		 if (StringUtils.isNotBlank(companyPwd)) {
				criteria.andCompanyPwdEqualTo(companyPwd);
			}
		List<Company> companyList = companyMapper.selectByExample(example);
		if (companyList != null && !companyList.isEmpty()) {
			return companyList.get(0);
		}
		return null;
	}
	/**
	 * 查询公司名称是否存在
	 * */
	public int findByCompanyName(String companyName) {
		int result=0; 
		CompanyExample example = new CompanyExample();
		CompanyExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(companyName)) {
			criteria.andCompanyNameEqualTo(companyName);
		}
		List<Company> companyList = companyMapper.selectByExample(example);
		if (companyList==null||companyList.isEmpty()) {
			return result;//说明没有该公司名字，可以注册
		}else{
			result=1;//该公司名称已经有了,不可以注册
		}	
		return result;
	}
}
