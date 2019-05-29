package com.qtwy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apply {

	private Integer sid;

	private String realname;

	private String jobAddress;

	private String jobName;

	private Double jobSalary;

	private Date releaseTime;

	private String companyName;

}