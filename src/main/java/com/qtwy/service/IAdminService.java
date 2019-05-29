package com.qtwy.service;


import com.qtwy.entity.Admin;

public interface IAdminService {
	/**
	 * 根据名字和密码查询管理员用户
	 * */
	public Admin getAdminByNameAndPwd(String adminName, String adminPwd);

}
