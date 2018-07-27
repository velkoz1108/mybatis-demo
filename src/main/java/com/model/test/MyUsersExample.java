package com.model.test;

import java.util.ArrayList;
import java.util.List;

public class MyUsersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    public MyUsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andObjJsonIsNull() {
            addCriterion("obj_json is null");
            return (Criteria) this;
        }

        public Criteria andObjJsonIsNotNull() {
            addCriterion("obj_json is not null");
            return (Criteria) this;
        }

        public Criteria andObjJsonEqualTo(String value) {
            addCriterion("obj_json =", value, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonNotEqualTo(String value) {
            addCriterion("obj_json <>", value, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonGreaterThan(String value) {
            addCriterion("obj_json >", value, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonGreaterThanOrEqualTo(String value) {
            addCriterion("obj_json >=", value, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonLessThan(String value) {
            addCriterion("obj_json <", value, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonLessThanOrEqualTo(String value) {
            addCriterion("obj_json <=", value, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonLike(String value) {
            addCriterion("obj_json like", value, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonNotLike(String value) {
            addCriterion("obj_json not like", value, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonIn(List<String> values) {
            addCriterion("obj_json in", values, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonNotIn(List<String> values) {
            addCriterion("obj_json not in", values, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonBetween(String value1, String value2) {
            addCriterion("obj_json between", value1, value2, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjJsonNotBetween(String value1, String value2) {
            addCriterion("obj_json not between", value1, value2, "objJson");
            return (Criteria) this;
        }

        public Criteria andObjArrIsNull() {
            addCriterion("obj_arr is null");
            return (Criteria) this;
        }

        public Criteria andObjArrIsNotNull() {
            addCriterion("obj_arr is not null");
            return (Criteria) this;
        }

        public Criteria andObjArrEqualTo(String value) {
            addCriterion("obj_arr =", value, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrNotEqualTo(String value) {
            addCriterion("obj_arr <>", value, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrGreaterThan(String value) {
            addCriterion("obj_arr >", value, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrGreaterThanOrEqualTo(String value) {
            addCriterion("obj_arr >=", value, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrLessThan(String value) {
            addCriterion("obj_arr <", value, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrLessThanOrEqualTo(String value) {
            addCriterion("obj_arr <=", value, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrLike(String value) {
            addCriterion("obj_arr like", value, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrNotLike(String value) {
            addCriterion("obj_arr not like", value, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrIn(List<String> values) {
            addCriterion("obj_arr in", values, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrNotIn(List<String> values) {
            addCriterion("obj_arr not in", values, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrBetween(String value1, String value2) {
            addCriterion("obj_arr between", value1, value2, "objArr");
            return (Criteria) this;
        }

        public Criteria andObjArrNotBetween(String value1, String value2) {
            addCriterion("obj_arr not between", value1, value2, "objArr");
            return (Criteria) this;
        }

        public Criteria andStrArrIsNull() {
            addCriterion("str_arr is null");
            return (Criteria) this;
        }

        public Criteria andStrArrIsNotNull() {
            addCriterion("str_arr is not null");
            return (Criteria) this;
        }

        public Criteria andStrArrEqualTo(String value) {
            addCriterion("str_arr =", value, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrNotEqualTo(String value) {
            addCriterion("str_arr <>", value, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrGreaterThan(String value) {
            addCriterion("str_arr >", value, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrGreaterThanOrEqualTo(String value) {
            addCriterion("str_arr >=", value, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrLessThan(String value) {
            addCriterion("str_arr <", value, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrLessThanOrEqualTo(String value) {
            addCriterion("str_arr <=", value, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrLike(String value) {
            addCriterion("str_arr like", value, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrNotLike(String value) {
            addCriterion("str_arr not like", value, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrIn(List<String> values) {
            addCriterion("str_arr in", values, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrNotIn(List<String> values) {
            addCriterion("str_arr not in", values, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrBetween(String value1, String value2) {
            addCriterion("str_arr between", value1, value2, "strArr");
            return (Criteria) this;
        }

        public Criteria andStrArrNotBetween(String value1, String value2) {
            addCriterion("str_arr not between", value1, value2, "strArr");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbggenerated do_not_delete_during_merge Fri Jul 27 16:44:31 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbggenerated Fri Jul 27 16:44:31 CST 2018
     */
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
}