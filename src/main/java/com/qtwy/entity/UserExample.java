package com.qtwy.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;


	public UserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andUidIsNull() {
			addCriterion("uid is null");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("uid is not null");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(Integer value) {
			addCriterion("uid =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(Integer value) {
			addCriterion("uid <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(Integer value) {
			addCriterion("uid >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(Integer value) {
			addCriterion("uid >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(Integer value) {
			addCriterion("uid <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("uid <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<Integer> values) {
			addCriterion("uid in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<Integer> values) {
			addCriterion("uid not in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidBetween(Integer value1, Integer value2) {
			addCriterion("uid between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(Integer value1, Integer value2) {
			addCriterion("uid not between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andLoginNameIsNull() {
			addCriterion("login_name is null");
			return (Criteria) this;
		}

		public Criteria andLoginNameIsNotNull() {
			addCriterion("login_name is not null");
			return (Criteria) this;
		}

		public Criteria andLoginNameEqualTo(String value) {
			addCriterion("login_name =", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotEqualTo(String value) {
			addCriterion("login_name <>", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameGreaterThan(String value) {
			addCriterion("login_name >", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
			addCriterion("login_name >=", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameLessThan(String value) {
			addCriterion("login_name <", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameLessThanOrEqualTo(String value) {
			addCriterion("login_name <=", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameLike(String value) {
			addCriterion("login_name like", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotLike(String value) {
			addCriterion("login_name not like", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameIn(List<String> values) {
			addCriterion("login_name in", values, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotIn(List<String> values) {
			addCriterion("login_name not in", values, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameBetween(String value1, String value2) {
			addCriterion("login_name between", value1, value2, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotBetween(String value1, String value2) {
			addCriterion("login_name not between", value1, value2, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginPwdIsNull() {
			addCriterion("login_pwd is null");
			return (Criteria) this;
		}

		public Criteria andLoginPwdIsNotNull() {
			addCriterion("login_pwd is not null");
			return (Criteria) this;
		}

		public Criteria andLoginPwdEqualTo(String value) {
			addCriterion("login_pwd =", value, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdNotEqualTo(String value) {
			addCriterion("login_pwd <>", value, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdGreaterThan(String value) {
			addCriterion("login_pwd >", value, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdGreaterThanOrEqualTo(String value) {
			addCriterion("login_pwd >=", value, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdLessThan(String value) {
			addCriterion("login_pwd <", value, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdLessThanOrEqualTo(String value) {
			addCriterion("login_pwd <=", value, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdLike(String value) {
			addCriterion("login_pwd like", value, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdNotLike(String value) {
			addCriterion("login_pwd not like", value, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdIn(List<String> values) {
			addCriterion("login_pwd in", values, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdNotIn(List<String> values) {
			addCriterion("login_pwd not in", values, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdBetween(String value1, String value2) {
			addCriterion("login_pwd between", value1, value2, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andLoginPwdNotBetween(String value1, String value2) {
			addCriterion("login_pwd not between", value1, value2, "loginPwd");
			return (Criteria) this;
		}

		public Criteria andGenderIsNull() {
			addCriterion("gender is null");
			return (Criteria) this;
		}

		public Criteria andGenderIsNotNull() {
			addCriterion("gender is not null");
			return (Criteria) this;
		}

		public Criteria andGenderEqualTo(String value) {
			addCriterion("gender =", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotEqualTo(String value) {
			addCriterion("gender <>", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThan(String value) {
			addCriterion("gender >", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThanOrEqualTo(String value) {
			addCriterion("gender >=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThan(String value) {
			addCriterion("gender <", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThanOrEqualTo(String value) {
			addCriterion("gender <=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLike(String value) {
			addCriterion("gender like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotLike(String value) {
			addCriterion("gender not like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderIn(List<String> values) {
			addCriterion("gender in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotIn(List<String> values) {
			addCriterion("gender not in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderBetween(String value1, String value2) {
			addCriterion("gender between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotBetween(String value1, String value2) {
			addCriterion("gender not between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andTelephoneIsNull() {
			addCriterion("telephone is null");
			return (Criteria) this;
		}

		public Criteria andTelephoneIsNotNull() {
			addCriterion("telephone is not null");
			return (Criteria) this;
		}

		public Criteria andTelephoneEqualTo(String value) {
			addCriterion("telephone =", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneNotEqualTo(String value) {
			addCriterion("telephone <>", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneGreaterThan(String value) {
			addCriterion("telephone >", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
			addCriterion("telephone >=", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneLessThan(String value) {
			addCriterion("telephone <", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneLessThanOrEqualTo(String value) {
			addCriterion("telephone <=", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneLike(String value) {
			addCriterion("telephone like", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneNotLike(String value) {
			addCriterion("telephone not like", value, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneIn(List<String> values) {
			addCriterion("telephone in", values, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneNotIn(List<String> values) {
			addCriterion("telephone not in", values, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneBetween(String value1, String value2) {
			addCriterion("telephone between", value1, value2, "telephone");
			return (Criteria) this;
		}

		public Criteria andTelephoneNotBetween(String value1, String value2) {
			addCriterion("telephone not between", value1, value2, "telephone");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andDescripteIsNull() {
			addCriterion("descripte is null");
			return (Criteria) this;
		}

		public Criteria andDescripteIsNotNull() {
			addCriterion("descripte is not null");
			return (Criteria) this;
		}

		public Criteria andDescripteEqualTo(String value) {
			addCriterion("descripte =", value, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteNotEqualTo(String value) {
			addCriterion("descripte <>", value, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteGreaterThan(String value) {
			addCriterion("descripte >", value, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteGreaterThanOrEqualTo(String value) {
			addCriterion("descripte >=", value, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteLessThan(String value) {
			addCriterion("descripte <", value, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteLessThanOrEqualTo(String value) {
			addCriterion("descripte <=", value, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteLike(String value) {
			addCriterion("descripte like", value, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteNotLike(String value) {
			addCriterion("descripte not like", value, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteIn(List<String> values) {
			addCriterion("descripte in", values, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteNotIn(List<String> values) {
			addCriterion("descripte not in", values, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteBetween(String value1, String value2) {
			addCriterion("descripte between", value1, value2, "descripte");
			return (Criteria) this;
		}

		public Criteria andDescripteNotBetween(String value1, String value2) {
			addCriterion("descripte not between", value1, value2, "descripte");
			return (Criteria) this;
		}

		public Criteria andRealnameIsNull() {
			addCriterion("realname is null");
			return (Criteria) this;
		}

		public Criteria andRealnameIsNotNull() {
			addCriterion("realname is not null");
			return (Criteria) this;
		}

		public Criteria andRealnameEqualTo(String value) {
			addCriterion("realname =", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameNotEqualTo(String value) {
			addCriterion("realname <>", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameGreaterThan(String value) {
			addCriterion("realname >", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameGreaterThanOrEqualTo(String value) {
			addCriterion("realname >=", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameLessThan(String value) {
			addCriterion("realname <", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameLessThanOrEqualTo(String value) {
			addCriterion("realname <=", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameLike(String value) {
			addCriterion("realname like", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameNotLike(String value) {
			addCriterion("realname not like", value, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameIn(List<String> values) {
			addCriterion("realname in", values, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameNotIn(List<String> values) {
			addCriterion("realname not in", values, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameBetween(String value1, String value2) {
			addCriterion("realname between", value1, value2, "realname");
			return (Criteria) this;
		}

		public Criteria andRealnameNotBetween(String value1, String value2) {
			addCriterion("realname not between", value1, value2, "realname");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andJobStatusIsNull() {
			addCriterion("job_status is null");
			return (Criteria) this;
		}

		public Criteria andJobStatusIsNotNull() {
			addCriterion("job_status is not null");
			return (Criteria) this;
		}

		public Criteria andJobStatusEqualTo(String value) {
			addCriterion("job_status =", value, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusNotEqualTo(String value) {
			addCriterion("job_status <>", value, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusGreaterThan(String value) {
			addCriterion("job_status >", value, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusGreaterThanOrEqualTo(String value) {
			addCriterion("job_status >=", value, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusLessThan(String value) {
			addCriterion("job_status <", value, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusLessThanOrEqualTo(String value) {
			addCriterion("job_status <=", value, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusLike(String value) {
			addCriterion("job_status like", value, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusNotLike(String value) {
			addCriterion("job_status not like", value, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusIn(List<String> values) {
			addCriterion("job_status in", values, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusNotIn(List<String> values) {
			addCriterion("job_status not in", values, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusBetween(String value1, String value2) {
			addCriterion("job_status between", value1, value2, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andJobStatusNotBetween(String value1, String value2) {
			addCriterion("job_status not between", value1, value2, "jobStatus");
			return (Criteria) this;
		}

		public Criteria andSalaryIsNull() {
			addCriterion("salary is null");
			return (Criteria) this;
		}

		public Criteria andSalaryIsNotNull() {
			addCriterion("salary is not null");
			return (Criteria) this;
		}

		public Criteria andSalaryEqualTo(Double value) {
			addCriterion("salary =", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryNotEqualTo(Double value) {
			addCriterion("salary <>", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryGreaterThan(Double value) {
			addCriterion("salary >", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryGreaterThanOrEqualTo(Double value) {
			addCriterion("salary >=", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryLessThan(Double value) {
			addCriterion("salary <", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryLessThanOrEqualTo(Double value) {
			addCriterion("salary <=", value, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryIn(List<Double> values) {
			addCriterion("salary in", values, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryNotIn(List<Double> values) {
			addCriterion("salary not in", values, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryBetween(Double value1, Double value2) {
			addCriterion("salary between", value1, value2, "salary");
			return (Criteria) this;
		}

		public Criteria andSalaryNotBetween(Double value1, Double value2) {
			addCriterion("salary not between", value1, value2, "salary");
			return (Criteria) this;
		}

		public Criteria andSchoolIsNull() {
			addCriterion("school is null");
			return (Criteria) this;
		}

		public Criteria andSchoolIsNotNull() {
			addCriterion("school is not null");
			return (Criteria) this;
		}

		public Criteria andSchoolEqualTo(String value) {
			addCriterion("school =", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotEqualTo(String value) {
			addCriterion("school <>", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolGreaterThan(String value) {
			addCriterion("school >", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolGreaterThanOrEqualTo(String value) {
			addCriterion("school >=", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLessThan(String value) {
			addCriterion("school <", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLessThanOrEqualTo(String value) {
			addCriterion("school <=", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLike(String value) {
			addCriterion("school like", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotLike(String value) {
			addCriterion("school not like", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolIn(List<String> values) {
			addCriterion("school in", values, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotIn(List<String> values) {
			addCriterion("school not in", values, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolBetween(String value1, String value2) {
			addCriterion("school between", value1, value2, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotBetween(String value1, String value2) {
			addCriterion("school not between", value1, value2, "school");
			return (Criteria) this;
		}
	}


	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}


    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}