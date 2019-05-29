package com.qtwy.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Excel(name = "用户编号", needMerge = true)
	private Integer uid;
    @Excel(name = "用户名", needMerge = true)
	private String loginName;
    @Excel(name = "密码", needMerge = true)
	private String loginPwd;
    @Excel(name = "性别", needMerge = true)
	private String gender;
    @Excel(name = "电话", needMerge = true)
	private String telephone;
    @Excel(name = "邮箱", needMerge = true)
	private String email;
    @Excel(name = "描述", needMerge = true)
	private String descripte;
    @Excel(name = "真实姓名", needMerge = true)
	private String realname;
    @Excel(name = "地址", needMerge = true)
	private String address;
    @Excel(name = "工作状况", needMerge = true)
	private String jobStatus;
    @Excel(name = "期望薪资", needMerge = true)
	private Double salary;
    @Excel(name = "学校", needMerge = true)
	private String school;


}