package com.qtwy.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

	@Excel(name = "公司编号", needMerge = true)
	private Integer cid;
	@Excel(name = "公司名称", needMerge = true)
	private String companyName;
	@Excel(name = "公司类型", needMerge = true)
	private String companyType;
	@Excel(name = "登陆名", needMerge = true)
	private String companyLoginName;
	@Excel(name = "密码", needMerge = true)
	private String companyPwd;
	@Excel(name = "公司地址", needMerge = true)
	private String companyAddress;
	@Excel(name = "公司网站", needMerge = true)
	private String companyWebsite;
	@Excel(name = "公司描述", needMerge = true)
	private String companyDesc;
	@Excel(name = "公司人数", needMerge = true)
	private String empNum;

}