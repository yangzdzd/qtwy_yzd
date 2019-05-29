package com.qtwy.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;


	public CompanyExample() {
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

		public Criteria andCidIsNull() {
			addCriterion("cid is null");
			return (Criteria) this;
		}

		public Criteria andCidIsNotNull() {
			addCriterion("cid is not null");
			return (Criteria) this;
		}

		public Criteria andCidEqualTo(Integer value) {
			addCriterion("cid =", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidNotEqualTo(Integer value) {
			addCriterion("cid <>", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidGreaterThan(Integer value) {
			addCriterion("cid >", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidGreaterThanOrEqualTo(Integer value) {
			addCriterion("cid >=", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidLessThan(Integer value) {
			addCriterion("cid <", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidLessThanOrEqualTo(Integer value) {
			addCriterion("cid <=", value, "cid");
			return (Criteria) this;
		}

		public Criteria andCidIn(List<Integer> values) {
			addCriterion("cid in", values, "cid");
			return (Criteria) this;
		}

		public Criteria andCidNotIn(List<Integer> values) {
			addCriterion("cid not in", values, "cid");
			return (Criteria) this;
		}

		public Criteria andCidBetween(Integer value1, Integer value2) {
			addCriterion("cid between", value1, value2, "cid");
			return (Criteria) this;
		}

		public Criteria andCidNotBetween(Integer value1, Integer value2) {
			addCriterion("cid not between", value1, value2, "cid");
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

		public Criteria andCompanyTypeIsNull() {
			addCriterion("company_type is null");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeIsNotNull() {
			addCriterion("company_type is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeEqualTo(String value) {
			addCriterion("company_type =", value, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeNotEqualTo(String value) {
			addCriterion("company_type <>", value, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeGreaterThan(String value) {
			addCriterion("company_type >", value, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
			addCriterion("company_type >=", value, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeLessThan(String value) {
			addCriterion("company_type <", value, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
			addCriterion("company_type <=", value, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeLike(String value) {
			addCriterion("company_type like", value, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeNotLike(String value) {
			addCriterion("company_type not like", value, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeIn(List<String> values) {
			addCriterion("company_type in", values, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeNotIn(List<String> values) {
			addCriterion("company_type not in", values, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeBetween(String value1, String value2) {
			addCriterion("company_type between", value1, value2, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyTypeNotBetween(String value1, String value2) {
			addCriterion("company_type not between", value1, value2, "companyType");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameIsNull() {
			addCriterion("company_login_name is null");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameIsNotNull() {
			addCriterion("company_login_name is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameEqualTo(String value) {
			addCriterion("company_login_name =", value, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameNotEqualTo(String value) {
			addCriterion("company_login_name <>", value, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameGreaterThan(String value) {
			addCriterion("company_login_name >", value, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameGreaterThanOrEqualTo(String value) {
			addCriterion("company_login_name >=", value, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameLessThan(String value) {
			addCriterion("company_login_name <", value, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameLessThanOrEqualTo(String value) {
			addCriterion("company_login_name <=", value, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameLike(String value) {
			addCriterion("company_login_name like", value, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameNotLike(String value) {
			addCriterion("company_login_name not like", value, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameIn(List<String> values) {
			addCriterion("company_login_name in", values, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameNotIn(List<String> values) {
			addCriterion("company_login_name not in", values, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameBetween(String value1, String value2) {
			addCriterion("company_login_name between", value1, value2, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyLoginNameNotBetween(String value1, String value2) {
			addCriterion("company_login_name not between", value1, value2, "companyLoginName");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdIsNull() {
			addCriterion("company_pwd is null");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdIsNotNull() {
			addCriterion("company_pwd is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdEqualTo(String value) {
			addCriterion("company_pwd =", value, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdNotEqualTo(String value) {
			addCriterion("company_pwd <>", value, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdGreaterThan(String value) {
			addCriterion("company_pwd >", value, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdGreaterThanOrEqualTo(String value) {
			addCriterion("company_pwd >=", value, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdLessThan(String value) {
			addCriterion("company_pwd <", value, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdLessThanOrEqualTo(String value) {
			addCriterion("company_pwd <=", value, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdLike(String value) {
			addCriterion("company_pwd like", value, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdNotLike(String value) {
			addCriterion("company_pwd not like", value, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdIn(List<String> values) {
			addCriterion("company_pwd in", values, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdNotIn(List<String> values) {
			addCriterion("company_pwd not in", values, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdBetween(String value1, String value2) {
			addCriterion("company_pwd between", value1, value2, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyPwdNotBetween(String value1, String value2) {
			addCriterion("company_pwd not between", value1, value2, "companyPwd");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressIsNull() {
			addCriterion("company_address is null");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressIsNotNull() {
			addCriterion("company_address is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressEqualTo(String value) {
			addCriterion("company_address =", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotEqualTo(String value) {
			addCriterion("company_address <>", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressGreaterThan(String value) {
			addCriterion("company_address >", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
			addCriterion("company_address >=", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressLessThan(String value) {
			addCriterion("company_address <", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
			addCriterion("company_address <=", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressLike(String value) {
			addCriterion("company_address like", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotLike(String value) {
			addCriterion("company_address not like", value, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressIn(List<String> values) {
			addCriterion("company_address in", values, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotIn(List<String> values) {
			addCriterion("company_address not in", values, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressBetween(String value1, String value2) {
			addCriterion("company_address between", value1, value2, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyAddressNotBetween(String value1, String value2) {
			addCriterion("company_address not between", value1, value2, "companyAddress");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteIsNull() {
			addCriterion("company_website is null");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteIsNotNull() {
			addCriterion("company_website is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteEqualTo(String value) {
			addCriterion("company_website =", value, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteNotEqualTo(String value) {
			addCriterion("company_website <>", value, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteGreaterThan(String value) {
			addCriterion("company_website >", value, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteGreaterThanOrEqualTo(String value) {
			addCriterion("company_website >=", value, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteLessThan(String value) {
			addCriterion("company_website <", value, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteLessThanOrEqualTo(String value) {
			addCriterion("company_website <=", value, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteLike(String value) {
			addCriterion("company_website like", value, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteNotLike(String value) {
			addCriterion("company_website not like", value, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteIn(List<String> values) {
			addCriterion("company_website in", values, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteNotIn(List<String> values) {
			addCriterion("company_website not in", values, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteBetween(String value1, String value2) {
			addCriterion("company_website between", value1, value2, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyWebsiteNotBetween(String value1, String value2) {
			addCriterion("company_website not between", value1, value2, "companyWebsite");
			return (Criteria) this;
		}

		public Criteria andCompanyDescIsNull() {
			addCriterion("company_desc is null");
			return (Criteria) this;
		}

		public Criteria andCompanyDescIsNotNull() {
			addCriterion("company_desc is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyDescEqualTo(String value) {
			addCriterion("company_desc =", value, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescNotEqualTo(String value) {
			addCriterion("company_desc <>", value, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescGreaterThan(String value) {
			addCriterion("company_desc >", value, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescGreaterThanOrEqualTo(String value) {
			addCriterion("company_desc >=", value, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescLessThan(String value) {
			addCriterion("company_desc <", value, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescLessThanOrEqualTo(String value) {
			addCriterion("company_desc <=", value, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescLike(String value) {
			addCriterion("company_desc like", value, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescNotLike(String value) {
			addCriterion("company_desc not like", value, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescIn(List<String> values) {
			addCriterion("company_desc in", values, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescNotIn(List<String> values) {
			addCriterion("company_desc not in", values, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescBetween(String value1, String value2) {
			addCriterion("company_desc between", value1, value2, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andCompanyDescNotBetween(String value1, String value2) {
			addCriterion("company_desc not between", value1, value2, "companyDesc");
			return (Criteria) this;
		}

		public Criteria andEmpNumIsNull() {
			addCriterion("emp_num is null");
			return (Criteria) this;
		}

		public Criteria andEmpNumIsNotNull() {
			addCriterion("emp_num is not null");
			return (Criteria) this;
		}

		public Criteria andEmpNumEqualTo(String value) {
			addCriterion("emp_num =", value, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumNotEqualTo(String value) {
			addCriterion("emp_num <>", value, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumGreaterThan(String value) {
			addCriterion("emp_num >", value, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumGreaterThanOrEqualTo(String value) {
			addCriterion("emp_num >=", value, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumLessThan(String value) {
			addCriterion("emp_num <", value, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumLessThanOrEqualTo(String value) {
			addCriterion("emp_num <=", value, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumLike(String value) {
			addCriterion("emp_num like", value, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumNotLike(String value) {
			addCriterion("emp_num not like", value, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumIn(List<String> values) {
			addCriterion("emp_num in", values, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumNotIn(List<String> values) {
			addCriterion("emp_num not in", values, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumBetween(String value1, String value2) {
			addCriterion("emp_num between", value1, value2, "empNum");
			return (Criteria) this;
		}

		public Criteria andEmpNumNotBetween(String value1, String value2) {
			addCriterion("emp_num not between", value1, value2, "empNum");
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