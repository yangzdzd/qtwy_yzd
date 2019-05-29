package com.qtwy.pojoExt;


import com.qtwy.entity.Apply;
import com.qtwy.entity.Company;
import com.qtwy.entity.Job;

public class JobInfoExt extends Job {
	
	private Company company;
	
	
	private Apply apply;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}



	public Apply getApply() {
		return apply;
	}

	public void setApply(Apply apply) {
		this.apply = apply;
	}
	
}
