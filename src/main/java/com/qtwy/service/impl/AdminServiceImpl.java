package com.qtwy.service.impl;

import com.qtwy.dao.AdminMapper;
import com.qtwy.entity.Admin;
import com.qtwy.entity.AdminExample;
import com.qtwy.service.IAdminService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
//@Transactional
public class AdminServiceImpl implements IAdminService {
	@Autowired
	private AdminMapper adminMapper;
	/**
	 * 根据名字和密码查询管理员用户
	 * */
	public Admin getAdminByNameAndPwd(String adminName, String adminPwd) {
		AdminExample example=new AdminExample();
		AdminExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(adminName)) {
			criteria.andAdminNameEqualTo(adminName);
		}
		if (StringUtils.isNotBlank(adminPwd)) {
			criteria.andAdminPwdEqualTo(adminPwd);
		}
		List<Admin> adminList = adminMapper.selectByExample(example);
		if (adminList != null && !adminList.isEmpty()) {
			return adminList.get(0);
		}
		return null;
	}

}
