package com.qtwy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Favorites {


	private Integer fid;

	private String jobAddress;

	private String jobName;

	private Double jobSalary;

	private Date releaseTime;

	private String companyName;

	private String realname;


}