package com.qtwy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ApplyExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ApplyExample() {
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andSidIsNull() {
			addCriterion("sid is null");
			return (Criteria) this;
		}

		public Criteria andSidIsNotNull() {
			addCriterion("sid is not null");
			return (Criteria) this;
		}

		public Criteria andSidEqualTo(Integer value) {
			addCriterion("sid =", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidNotEqualTo(Integer value) {
			addCriterion("sid <>", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidGreaterThan(Integer value) {
			addCriterion("sid >", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidGreaterThanOrEqualTo(Integer value) {
			addCriterion("sid >=", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidLessThan(Integer value) {
			addCriterion("sid <", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidLessThanOrEqualTo(Integer value) {
			addCriterion("sid <=", value, "sid");
			return (Criteria) this;
		}

		public Criteria andSidIn(List<Integer> values) {
			addCriterion("sid in", values, "sid");
			return (Criteria) this;
		}

		public Criteria andSidNotIn(List<Integer> values) {
			addCriterion("sid not in", values, "sid");
			return (Criteria) this;
		}

		public Criteria andSidBetween(Integer value1, Integer value2) {
			addCriterion("sid between", value1, value2, "sid");
			return (Criteria) this;
		}

		public Criteria andSidNotBetween(Integer value1, Integer value2) {
			addCriterion("sid not between", value1, value2, "sid");
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

		public Criteria andJobAddressIsNull() {
			addCriterion("job_address is null");
			return (Criteria) this;
		}

		public Criteria andJobAddressIsNotNull() {
			addCriterion("job_address is not null");
			return (Criteria) this;
		}

		public Criteria andJobAddressEqualTo(String value) {
			addCriterion("job_address =", value, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressNotEqualTo(String value) {
			addCriterion("job_address <>", value, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressGreaterThan(String value) {
			addCriterion("job_address >", value, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressGreaterThanOrEqualTo(String value) {
			addCriterion("job_address >=", value, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressLessThan(String value) {
			addCriterion("job_address <", value, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressLessThanOrEqualTo(String value) {
			addCriterion("job_address <=", value, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressLike(String value) {
			addCriterion("job_address like", value, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressNotLike(String value) {
			addCriterion("job_address not like", value, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressIn(List<String> values) {
			addCriterion("job_address in", values, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressNotIn(List<String> values) {
			addCriterion("job_address not in", values, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressBetween(String value1, String value2) {
			addCriterion("job_address between", value1, value2, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobAddressNotBetween(String value1, String value2) {
			addCriterion("job_address not between", value1, value2, "jobAddress");
			return (Criteria) this;
		}

		public Criteria andJobNameIsNull() {
			addCriterion("job_name is null");
			return (Criteria) this;
		}

		public Criteria andJobNameIsNotNull() {
			addCriterion("job_name is not null");
			return (Criteria) this;
		}

		public Criteria andJobNameEqualTo(String value) {
			addCriterion("job_name =", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameNotEqualTo(String value) {
			addCriterion("job_name <>", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameGreaterThan(String value) {
			addCriterion("job_name >", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameGreaterThanOrEqualTo(String value) {
			addCriterion("job_name >=", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameLessThan(String value) {
			addCriterion("job_name <", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameLessThanOrEqualTo(String value) {
			addCriterion("job_name <=", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameLike(String value) {
			addCriterion("job_name like", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameNotLike(String value) {
			addCriterion("job_name not like", value, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameIn(List<String> values) {
			addCriterion("job_name in", values, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameNotIn(List<String> values) {
			addCriterion("job_name not in", values, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameBetween(String value1, String value2) {
			addCriterion("job_name between", value1, value2, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobNameNotBetween(String value1, String value2) {
			addCriterion("job_name not between", value1, value2, "jobName");
			return (Criteria) this;
		}

		public Criteria andJobSalaryIsNull() {
			addCriterion("job_salary is null");
			return (Criteria) this;
		}

		public Criteria andJobSalaryIsNotNull() {
			addCriterion("job_salary is not null");
			return (Criteria) this;
		}

		public Criteria andJobSalaryEqualTo(Double value) {
			addCriterion("job_salary =", value, "jobSalary");
			return (Criteria) this;
		}

		public Criteria andJobSalaryNotEqualTo(Double value) {
			addCriterion("job_salary <>", value, "jobSalary");
			return (Criteria) this;
		}

		public Criteria andJobSalaryGreaterThan(Double value) {
			addCriterion("job_salary >", value, "jobSalary");
			return (Criteria) this;
		}

		public Criteria andJobSalaryGreaterThanOrEqualTo(Double value) {
			addCriterion("job_salary >=", value, "jobSalary");
			return (Criteria) this;
		}

		public Criteria andJobSalaryLessThan(Double value) {
			addCriterion("job_salary <", value, "jobSalary");
			return (Criteria) this;
		}

		public Criteria andJobSalaryLessThanOrEqualTo(Double value) {
			addCriterion("job_salary <=", value, "jobSalary");
			return (Criteria) this;
		}

		public Criteria andJobSalaryIn(List<Double> values) {
			addCriterion("job_salary in", values, "jobSalary");
			return (Criteria) this;
		}

		public Criteria andJobSalaryNotIn(List<Double> values) {
			addCriterion("job_salary not in", values, "jobSalary");
			return (Criteria) this;
		}

		public Criteria andJobSalaryBetween(Double value1, Double value2) {
			addCriterion("job_salary between", value1, value2, "jobSalary");
			return (Criteria) this;
		}

		public Criteria andJobSalaryNotBetween(Double value1, Double value2) {
			addCriterion("job_salary not between", value1, value2, "jobSalary");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeIsNull() {
			addCriterion("release_time is null");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeIsNotNull() {
			addCriterion("release_time is not null");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeEqualTo(Date value) {
			addCriterionForJDBCDate("release_time =", value, "releaseTime");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeNotEqualTo(Date value) {
			addCriterionForJDBCDate("release_time <>", value, "releaseTime");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeGreaterThan(Date value) {
			addCriterionForJDBCDate("release_time >", value, "releaseTime");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("release_time >=", value, "releaseTime");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeLessThan(Date value) {
			addCriterionForJDBCDate("release_time <", value, "releaseTime");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("release_time <=", value, "releaseTime");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeIn(List<Date> values) {
			addCriterionForJDBCDate("release_time in", values, "releaseTime");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeNotIn(List<Date> values) {
			addCriterionForJDBCDate("release_time not in", values, "releaseTime");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("release_time between", value1, value2, "releaseTime");
			return (Criteria) this;
		}

		public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("release_time not between", value1, value2, "releaseTime");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIsNull() {
			addCriterion("company_name is null");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIsNotNull() {
			addCriterion("company_name is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyNameEqualTo(String value) {
			addCriterion("company_name =", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotEqualTo(String value) {
			addCriterion("company_name <>", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameGreaterThan(String value) {
			addCriterion("company_name >", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
			addCriterion("company_name >=", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLessThan(String value) {
			addCriterion("company_name <", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLessThanOrEqualTo(String value) {
			addCriterion("company_name <=", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLike(String value) {
			addCriterion("company_name like", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotLike(String value) {
			addCriterion("company_name not like", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIn(List<String> values) {
			addCriterion("company_name in", values, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotIn(List<String> values) {
			addCriterion("company_name not in", values, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameBetween(String value1, String value2) {
			addCriterion("company_name between", value1, value2, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotBetween(String value1, String value2) {
			addCriterion("company_name not between", value1, value2, "companyName");
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