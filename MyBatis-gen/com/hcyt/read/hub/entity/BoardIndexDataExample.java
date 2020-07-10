/*
 * BoardIndexDataExample.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.entity;

import java.util.ArrayList;
import java.util.List;

public class BoardIndexDataExample {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public BoardIndexDataExample() {
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

    /**
     * 数据看板概览表
     * 
     * @author stevenlaw
     * @version 1.0 2020-07-09
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
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }
        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andTotalUserIsNull() {
            addCriterion("total_user is null");
            return (Criteria) this;
        }
        public Criteria andTotalUserIsNotNull() {
            addCriterion("total_user is not null");
            return (Criteria) this;
        }
        public Criteria andTotalUserEqualTo(Integer value) {
            addCriterion("total_user =", value, "totalUser");
            return (Criteria) this;
        }
        public Criteria andTotalUserNotEqualTo(Integer value) {
            addCriterion("total_user <>", value, "totalUser");
            return (Criteria) this;
        }
        public Criteria andTotalUserGreaterThan(Integer value) {
            addCriterion("total_user >", value, "totalUser");
            return (Criteria) this;
        }
        public Criteria andTotalUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_user >=", value, "totalUser");
            return (Criteria) this;
        }
        public Criteria andTotalUserLessThan(Integer value) {
            addCriterion("total_user <", value, "totalUser");
            return (Criteria) this;
        }
        public Criteria andTotalUserLessThanOrEqualTo(Integer value) {
            addCriterion("total_user <=", value, "totalUser");
            return (Criteria) this;
        }
        public Criteria andTotalUserIn(List<Integer> values) {
            addCriterion("total_user in", values, "totalUser");
            return (Criteria) this;
        }
        public Criteria andTotalUserNotIn(List<Integer> values) {
            addCriterion("total_user not in", values, "totalUser");
            return (Criteria) this;
        }
        public Criteria andTotalUserBetween(Integer value1, Integer value2) {
            addCriterion("total_user between", value1, value2, "totalUser");
            return (Criteria) this;
        }
        public Criteria andTotalUserNotBetween(Integer value1, Integer value2) {
            addCriterion("total_user not between", value1, value2, "totalUser");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserIsNull() {
            addCriterion("today_add_user is null");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserIsNotNull() {
            addCriterion("today_add_user is not null");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserEqualTo(Integer value) {
            addCriterion("today_add_user =", value, "todayAddUser");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserNotEqualTo(Integer value) {
            addCriterion("today_add_user <>", value, "todayAddUser");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserGreaterThan(Integer value) {
            addCriterion("today_add_user >", value, "todayAddUser");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_add_user >=", value, "todayAddUser");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserLessThan(Integer value) {
            addCriterion("today_add_user <", value, "todayAddUser");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserLessThanOrEqualTo(Integer value) {
            addCriterion("today_add_user <=", value, "todayAddUser");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserIn(List<Integer> values) {
            addCriterion("today_add_user in", values, "todayAddUser");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserNotIn(List<Integer> values) {
            addCriterion("today_add_user not in", values, "todayAddUser");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserBetween(Integer value1, Integer value2) {
            addCriterion("today_add_user between", value1, value2, "todayAddUser");
            return (Criteria) this;
        }
        public Criteria andTodayAddUserNotBetween(Integer value1, Integer value2) {
            addCriterion("today_add_user not between", value1, value2, "todayAddUser");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserIsNull() {
            addCriterion("yesterday_add_user is null");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserIsNotNull() {
            addCriterion("yesterday_add_user is not null");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserEqualTo(Integer value) {
            addCriterion("yesterday_add_user =", value, "yesterdayAddUser");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserNotEqualTo(Integer value) {
            addCriterion("yesterday_add_user <>", value, "yesterdayAddUser");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserGreaterThan(Integer value) {
            addCriterion("yesterday_add_user >", value, "yesterdayAddUser");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("yesterday_add_user >=", value, "yesterdayAddUser");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserLessThan(Integer value) {
            addCriterion("yesterday_add_user <", value, "yesterdayAddUser");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserLessThanOrEqualTo(Integer value) {
            addCriterion("yesterday_add_user <=", value, "yesterdayAddUser");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserIn(List<Integer> values) {
            addCriterion("yesterday_add_user in", values, "yesterdayAddUser");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserNotIn(List<Integer> values) {
            addCriterion("yesterday_add_user not in", values, "yesterdayAddUser");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserBetween(Integer value1, Integer value2) {
            addCriterion("yesterday_add_user between", value1, value2, "yesterdayAddUser");
            return (Criteria) this;
        }
        public Criteria andYesterdayAddUserNotBetween(Integer value1, Integer value2) {
            addCriterion("yesterday_add_user not between", value1, value2, "yesterdayAddUser");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumIsNull() {
            addCriterion("total_visit_num is null");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumIsNotNull() {
            addCriterion("total_visit_num is not null");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumEqualTo(Integer value) {
            addCriterion("total_visit_num =", value, "totalVisitNum");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumNotEqualTo(Integer value) {
            addCriterion("total_visit_num <>", value, "totalVisitNum");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumGreaterThan(Integer value) {
            addCriterion("total_visit_num >", value, "totalVisitNum");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_visit_num >=", value, "totalVisitNum");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumLessThan(Integer value) {
            addCriterion("total_visit_num <", value, "totalVisitNum");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_visit_num <=", value, "totalVisitNum");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumIn(List<Integer> values) {
            addCriterion("total_visit_num in", values, "totalVisitNum");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumNotIn(List<Integer> values) {
            addCriterion("total_visit_num not in", values, "totalVisitNum");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumBetween(Integer value1, Integer value2) {
            addCriterion("total_visit_num between", value1, value2, "totalVisitNum");
            return (Criteria) this;
        }
        public Criteria andTotalVisitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_visit_num not between", value1, value2, "totalVisitNum");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumIsNull() {
            addCriterion("today_visit_num is null");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumIsNotNull() {
            addCriterion("today_visit_num is not null");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumEqualTo(Integer value) {
            addCriterion("today_visit_num =", value, "todayVisitNum");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumNotEqualTo(Integer value) {
            addCriterion("today_visit_num <>", value, "todayVisitNum");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumGreaterThan(Integer value) {
            addCriterion("today_visit_num >", value, "todayVisitNum");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_visit_num >=", value, "todayVisitNum");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumLessThan(Integer value) {
            addCriterion("today_visit_num <", value, "todayVisitNum");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumLessThanOrEqualTo(Integer value) {
            addCriterion("today_visit_num <=", value, "todayVisitNum");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumIn(List<Integer> values) {
            addCriterion("today_visit_num in", values, "todayVisitNum");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumNotIn(List<Integer> values) {
            addCriterion("today_visit_num not in", values, "todayVisitNum");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumBetween(Integer value1, Integer value2) {
            addCriterion("today_visit_num between", value1, value2, "todayVisitNum");
            return (Criteria) this;
        }
        public Criteria andTodayVisitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("today_visit_num not between", value1, value2, "todayVisitNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumIsNull() {
            addCriterion("yesterday_visit_num is null");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumIsNotNull() {
            addCriterion("yesterday_visit_num is not null");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumEqualTo(Integer value) {
            addCriterion("yesterday_visit_num =", value, "yesterdayVisitNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumNotEqualTo(Integer value) {
            addCriterion("yesterday_visit_num <>", value, "yesterdayVisitNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumGreaterThan(Integer value) {
            addCriterion("yesterday_visit_num >", value, "yesterdayVisitNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("yesterday_visit_num >=", value, "yesterdayVisitNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumLessThan(Integer value) {
            addCriterion("yesterday_visit_num <", value, "yesterdayVisitNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumLessThanOrEqualTo(Integer value) {
            addCriterion("yesterday_visit_num <=", value, "yesterdayVisitNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumIn(List<Integer> values) {
            addCriterion("yesterday_visit_num in", values, "yesterdayVisitNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumNotIn(List<Integer> values) {
            addCriterion("yesterday_visit_num not in", values, "yesterdayVisitNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumBetween(Integer value1, Integer value2) {
            addCriterion("yesterday_visit_num between", value1, value2, "yesterdayVisitNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayVisitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("yesterday_visit_num not between", value1, value2, "yesterdayVisitNum");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumIsNull() {
            addCriterion("total_expand_num is null");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumIsNotNull() {
            addCriterion("total_expand_num is not null");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumEqualTo(Integer value) {
            addCriterion("total_expand_num =", value, "totalExpandNum");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumNotEqualTo(Integer value) {
            addCriterion("total_expand_num <>", value, "totalExpandNum");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumGreaterThan(Integer value) {
            addCriterion("total_expand_num >", value, "totalExpandNum");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_expand_num >=", value, "totalExpandNum");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumLessThan(Integer value) {
            addCriterion("total_expand_num <", value, "totalExpandNum");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_expand_num <=", value, "totalExpandNum");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumIn(List<Integer> values) {
            addCriterion("total_expand_num in", values, "totalExpandNum");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumNotIn(List<Integer> values) {
            addCriterion("total_expand_num not in", values, "totalExpandNum");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumBetween(Integer value1, Integer value2) {
            addCriterion("total_expand_num between", value1, value2, "totalExpandNum");
            return (Criteria) this;
        }
        public Criteria andTotalExpandNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_expand_num not between", value1, value2, "totalExpandNum");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumIsNull() {
            addCriterion("today_expand_num is null");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumIsNotNull() {
            addCriterion("today_expand_num is not null");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumEqualTo(Integer value) {
            addCriterion("today_expand_num =", value, "todayExpandNum");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumNotEqualTo(Integer value) {
            addCriterion("today_expand_num <>", value, "todayExpandNum");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumGreaterThan(Integer value) {
            addCriterion("today_expand_num >", value, "todayExpandNum");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_expand_num >=", value, "todayExpandNum");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumLessThan(Integer value) {
            addCriterion("today_expand_num <", value, "todayExpandNum");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumLessThanOrEqualTo(Integer value) {
            addCriterion("today_expand_num <=", value, "todayExpandNum");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumIn(List<Integer> values) {
            addCriterion("today_expand_num in", values, "todayExpandNum");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumNotIn(List<Integer> values) {
            addCriterion("today_expand_num not in", values, "todayExpandNum");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumBetween(Integer value1, Integer value2) {
            addCriterion("today_expand_num between", value1, value2, "todayExpandNum");
            return (Criteria) this;
        }
        public Criteria andTodayExpandNumNotBetween(Integer value1, Integer value2) {
            addCriterion("today_expand_num not between", value1, value2, "todayExpandNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumIsNull() {
            addCriterion("yesterday_expand_num is null");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumIsNotNull() {
            addCriterion("yesterday_expand_num is not null");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumEqualTo(Integer value) {
            addCriterion("yesterday_expand_num =", value, "yesterdayExpandNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumNotEqualTo(Integer value) {
            addCriterion("yesterday_expand_num <>", value, "yesterdayExpandNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumGreaterThan(Integer value) {
            addCriterion("yesterday_expand_num >", value, "yesterdayExpandNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("yesterday_expand_num >=", value, "yesterdayExpandNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumLessThan(Integer value) {
            addCriterion("yesterday_expand_num <", value, "yesterdayExpandNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumLessThanOrEqualTo(Integer value) {
            addCriterion("yesterday_expand_num <=", value, "yesterdayExpandNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumIn(List<Integer> values) {
            addCriterion("yesterday_expand_num in", values, "yesterdayExpandNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumNotIn(List<Integer> values) {
            addCriterion("yesterday_expand_num not in", values, "yesterdayExpandNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumBetween(Integer value1, Integer value2) {
            addCriterion("yesterday_expand_num between", value1, value2, "yesterdayExpandNum");
            return (Criteria) this;
        }
        public Criteria andYesterdayExpandNumNotBetween(Integer value1, Integer value2) {
            addCriterion("yesterday_expand_num not between", value1, value2, "yesterdayExpandNum");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductIsNull() {
            addCriterion("total_share_product is null");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductIsNotNull() {
            addCriterion("total_share_product is not null");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductEqualTo(Integer value) {
            addCriterion("total_share_product =", value, "totalShareProduct");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductNotEqualTo(Integer value) {
            addCriterion("total_share_product <>", value, "totalShareProduct");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductGreaterThan(Integer value) {
            addCriterion("total_share_product >", value, "totalShareProduct");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_share_product >=", value, "totalShareProduct");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductLessThan(Integer value) {
            addCriterion("total_share_product <", value, "totalShareProduct");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductLessThanOrEqualTo(Integer value) {
            addCriterion("total_share_product <=", value, "totalShareProduct");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductIn(List<Integer> values) {
            addCriterion("total_share_product in", values, "totalShareProduct");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductNotIn(List<Integer> values) {
            addCriterion("total_share_product not in", values, "totalShareProduct");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductBetween(Integer value1, Integer value2) {
            addCriterion("total_share_product between", value1, value2, "totalShareProduct");
            return (Criteria) this;
        }
        public Criteria andTotalShareProductNotBetween(Integer value1, Integer value2) {
            addCriterion("total_share_product not between", value1, value2, "totalShareProduct");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductIsNull() {
            addCriterion("today_share_product is null");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductIsNotNull() {
            addCriterion("today_share_product is not null");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductEqualTo(Integer value) {
            addCriterion("today_share_product =", value, "todayShareProduct");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductNotEqualTo(Integer value) {
            addCriterion("today_share_product <>", value, "todayShareProduct");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductGreaterThan(Integer value) {
            addCriterion("today_share_product >", value, "todayShareProduct");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_share_product >=", value, "todayShareProduct");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductLessThan(Integer value) {
            addCriterion("today_share_product <", value, "todayShareProduct");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductLessThanOrEqualTo(Integer value) {
            addCriterion("today_share_product <=", value, "todayShareProduct");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductIn(List<Integer> values) {
            addCriterion("today_share_product in", values, "todayShareProduct");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductNotIn(List<Integer> values) {
            addCriterion("today_share_product not in", values, "todayShareProduct");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductBetween(Integer value1, Integer value2) {
            addCriterion("today_share_product between", value1, value2, "todayShareProduct");
            return (Criteria) this;
        }
        public Criteria andTodayShareProductNotBetween(Integer value1, Integer value2) {
            addCriterion("today_share_product not between", value1, value2, "todayShareProduct");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductIsNull() {
            addCriterion("yesterday_share_product is null");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductIsNotNull() {
            addCriterion("yesterday_share_product is not null");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductEqualTo(Integer value) {
            addCriterion("yesterday_share_product =", value, "yesterdayShareProduct");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductNotEqualTo(Integer value) {
            addCriterion("yesterday_share_product <>", value, "yesterdayShareProduct");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductGreaterThan(Integer value) {
            addCriterion("yesterday_share_product >", value, "yesterdayShareProduct");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("yesterday_share_product >=", value, "yesterdayShareProduct");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductLessThan(Integer value) {
            addCriterion("yesterday_share_product <", value, "yesterdayShareProduct");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductLessThanOrEqualTo(Integer value) {
            addCriterion("yesterday_share_product <=", value, "yesterdayShareProduct");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductIn(List<Integer> values) {
            addCriterion("yesterday_share_product in", values, "yesterdayShareProduct");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductNotIn(List<Integer> values) {
            addCriterion("yesterday_share_product not in", values, "yesterdayShareProduct");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductBetween(Integer value1, Integer value2) {
            addCriterion("yesterday_share_product between", value1, value2, "yesterdayShareProduct");
            return (Criteria) this;
        }
        public Criteria andYesterdayShareProductNotBetween(Integer value1, Integer value2) {
            addCriterion("yesterday_share_product not between", value1, value2, "yesterdayShareProduct");
            return (Criteria) this;
        }
        public Criteria andShopNumIsNull() {
            addCriterion("shop_num is null");
            return (Criteria) this;
        }
        public Criteria andShopNumIsNotNull() {
            addCriterion("shop_num is not null");
            return (Criteria) this;
        }
        public Criteria andShopNumEqualTo(Integer value) {
            addCriterion("shop_num =", value, "shopNum");
            return (Criteria) this;
        }
        public Criteria andShopNumNotEqualTo(Integer value) {
            addCriterion("shop_num <>", value, "shopNum");
            return (Criteria) this;
        }
        public Criteria andShopNumGreaterThan(Integer value) {
            addCriterion("shop_num >", value, "shopNum");
            return (Criteria) this;
        }
        public Criteria andShopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_num >=", value, "shopNum");
            return (Criteria) this;
        }
        public Criteria andShopNumLessThan(Integer value) {
            addCriterion("shop_num <", value, "shopNum");
            return (Criteria) this;
        }
        public Criteria andShopNumLessThanOrEqualTo(Integer value) {
            addCriterion("shop_num <=", value, "shopNum");
            return (Criteria) this;
        }
        public Criteria andShopNumIn(List<Integer> values) {
            addCriterion("shop_num in", values, "shopNum");
            return (Criteria) this;
        }
        public Criteria andShopNumNotIn(List<Integer> values) {
            addCriterion("shop_num not in", values, "shopNum");
            return (Criteria) this;
        }
        public Criteria andShopNumBetween(Integer value1, Integer value2) {
            addCriterion("shop_num between", value1, value2, "shopNum");
            return (Criteria) this;
        }
        public Criteria andShopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_num not between", value1, value2, "shopNum");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumIsNull() {
            addCriterion("provincial_shop_num is null");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumIsNotNull() {
            addCriterion("provincial_shop_num is not null");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumEqualTo(Integer value) {
            addCriterion("provincial_shop_num =", value, "provincialShopNum");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumNotEqualTo(Integer value) {
            addCriterion("provincial_shop_num <>", value, "provincialShopNum");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumGreaterThan(Integer value) {
            addCriterion("provincial_shop_num >", value, "provincialShopNum");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("provincial_shop_num >=", value, "provincialShopNum");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumLessThan(Integer value) {
            addCriterion("provincial_shop_num <", value, "provincialShopNum");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumLessThanOrEqualTo(Integer value) {
            addCriterion("provincial_shop_num <=", value, "provincialShopNum");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumIn(List<Integer> values) {
            addCriterion("provincial_shop_num in", values, "provincialShopNum");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumNotIn(List<Integer> values) {
            addCriterion("provincial_shop_num not in", values, "provincialShopNum");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumBetween(Integer value1, Integer value2) {
            addCriterion("provincial_shop_num between", value1, value2, "provincialShopNum");
            return (Criteria) this;
        }
        public Criteria andProvincialShopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("provincial_shop_num not between", value1, value2, "provincialShopNum");
            return (Criteria) this;
        }
        public Criteria andCityShopNumIsNull() {
            addCriterion("city_shop_num is null");
            return (Criteria) this;
        }
        public Criteria andCityShopNumIsNotNull() {
            addCriterion("city_shop_num is not null");
            return (Criteria) this;
        }
        public Criteria andCityShopNumEqualTo(Integer value) {
            addCriterion("city_shop_num =", value, "cityShopNum");
            return (Criteria) this;
        }
        public Criteria andCityShopNumNotEqualTo(Integer value) {
            addCriterion("city_shop_num <>", value, "cityShopNum");
            return (Criteria) this;
        }
        public Criteria andCityShopNumGreaterThan(Integer value) {
            addCriterion("city_shop_num >", value, "cityShopNum");
            return (Criteria) this;
        }
        public Criteria andCityShopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_shop_num >=", value, "cityShopNum");
            return (Criteria) this;
        }
        public Criteria andCityShopNumLessThan(Integer value) {
            addCriterion("city_shop_num <", value, "cityShopNum");
            return (Criteria) this;
        }
        public Criteria andCityShopNumLessThanOrEqualTo(Integer value) {
            addCriterion("city_shop_num <=", value, "cityShopNum");
            return (Criteria) this;
        }
        public Criteria andCityShopNumIn(List<Integer> values) {
            addCriterion("city_shop_num in", values, "cityShopNum");
            return (Criteria) this;
        }
        public Criteria andCityShopNumNotIn(List<Integer> values) {
            addCriterion("city_shop_num not in", values, "cityShopNum");
            return (Criteria) this;
        }
        public Criteria andCityShopNumBetween(Integer value1, Integer value2) {
            addCriterion("city_shop_num between", value1, value2, "cityShopNum");
            return (Criteria) this;
        }
        public Criteria andCityShopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("city_shop_num not between", value1, value2, "cityShopNum");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumIsNull() {
            addCriterion("county_shop_num is null");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumIsNotNull() {
            addCriterion("county_shop_num is not null");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumEqualTo(Integer value) {
            addCriterion("county_shop_num =", value, "countyShopNum");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumNotEqualTo(Integer value) {
            addCriterion("county_shop_num <>", value, "countyShopNum");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumGreaterThan(Integer value) {
            addCriterion("county_shop_num >", value, "countyShopNum");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("county_shop_num >=", value, "countyShopNum");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumLessThan(Integer value) {
            addCriterion("county_shop_num <", value, "countyShopNum");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumLessThanOrEqualTo(Integer value) {
            addCriterion("county_shop_num <=", value, "countyShopNum");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumIn(List<Integer> values) {
            addCriterion("county_shop_num in", values, "countyShopNum");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumNotIn(List<Integer> values) {
            addCriterion("county_shop_num not in", values, "countyShopNum");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumBetween(Integer value1, Integer value2) {
            addCriterion("county_shop_num between", value1, value2, "countyShopNum");
            return (Criteria) this;
        }
        public Criteria andCountyShopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("county_shop_num not between", value1, value2, "countyShopNum");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumIsNull() {
            addCriterion("township_shop_num is null");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumIsNotNull() {
            addCriterion("township_shop_num is not null");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumEqualTo(Integer value) {
            addCriterion("township_shop_num =", value, "townshipShopNum");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumNotEqualTo(Integer value) {
            addCriterion("township_shop_num <>", value, "townshipShopNum");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumGreaterThan(Integer value) {
            addCriterion("township_shop_num >", value, "townshipShopNum");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("township_shop_num >=", value, "townshipShopNum");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumLessThan(Integer value) {
            addCriterion("township_shop_num <", value, "townshipShopNum");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumLessThanOrEqualTo(Integer value) {
            addCriterion("township_shop_num <=", value, "townshipShopNum");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumIn(List<Integer> values) {
            addCriterion("township_shop_num in", values, "townshipShopNum");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumNotIn(List<Integer> values) {
            addCriterion("township_shop_num not in", values, "townshipShopNum");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumBetween(Integer value1, Integer value2) {
            addCriterion("township_shop_num between", value1, value2, "townshipShopNum");
            return (Criteria) this;
        }
        public Criteria andTownshipShopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("township_shop_num not between", value1, value2, "townshipShopNum");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumIsNull() {
            addCriterion("university_shop_num is null");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumIsNotNull() {
            addCriterion("university_shop_num is not null");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumEqualTo(Integer value) {
            addCriterion("university_shop_num =", value, "universityShopNum");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumNotEqualTo(Integer value) {
            addCriterion("university_shop_num <>", value, "universityShopNum");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumGreaterThan(Integer value) {
            addCriterion("university_shop_num >", value, "universityShopNum");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("university_shop_num >=", value, "universityShopNum");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumLessThan(Integer value) {
            addCriterion("university_shop_num <", value, "universityShopNum");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumLessThanOrEqualTo(Integer value) {
            addCriterion("university_shop_num <=", value, "universityShopNum");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumIn(List<Integer> values) {
            addCriterion("university_shop_num in", values, "universityShopNum");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumNotIn(List<Integer> values) {
            addCriterion("university_shop_num not in", values, "universityShopNum");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumBetween(Integer value1, Integer value2) {
            addCriterion("university_shop_num between", value1, value2, "universityShopNum");
            return (Criteria) this;
        }
        public Criteria andUniversityShopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("university_shop_num not between", value1, value2, "universityShopNum");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumIsNull() {
            addCriterion("community_shop_num is null");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumIsNotNull() {
            addCriterion("community_shop_num is not null");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumEqualTo(Integer value) {
            addCriterion("community_shop_num =", value, "communityShopNum");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumNotEqualTo(Integer value) {
            addCriterion("community_shop_num <>", value, "communityShopNum");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumGreaterThan(Integer value) {
            addCriterion("community_shop_num >", value, "communityShopNum");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("community_shop_num >=", value, "communityShopNum");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumLessThan(Integer value) {
            addCriterion("community_shop_num <", value, "communityShopNum");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumLessThanOrEqualTo(Integer value) {
            addCriterion("community_shop_num <=", value, "communityShopNum");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumIn(List<Integer> values) {
            addCriterion("community_shop_num in", values, "communityShopNum");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumNotIn(List<Integer> values) {
            addCriterion("community_shop_num not in", values, "communityShopNum");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumBetween(Integer value1, Integer value2) {
            addCriterion("community_shop_num between", value1, value2, "communityShopNum");
            return (Criteria) this;
        }
        public Criteria andCommunityShopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("community_shop_num not between", value1, value2, "communityShopNum");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumIsNull() {
            addCriterion("wenhua_num is null");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumIsNotNull() {
            addCriterion("wenhua_num is not null");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumEqualTo(Integer value) {
            addCriterion("wenhua_num =", value, "wenhuaNum");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumNotEqualTo(Integer value) {
            addCriterion("wenhua_num <>", value, "wenhuaNum");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumGreaterThan(Integer value) {
            addCriterion("wenhua_num >", value, "wenhuaNum");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("wenhua_num >=", value, "wenhuaNum");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumLessThan(Integer value) {
            addCriterion("wenhua_num <", value, "wenhuaNum");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumLessThanOrEqualTo(Integer value) {
            addCriterion("wenhua_num <=", value, "wenhuaNum");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumIn(List<Integer> values) {
            addCriterion("wenhua_num in", values, "wenhuaNum");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumNotIn(List<Integer> values) {
            addCriterion("wenhua_num not in", values, "wenhuaNum");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumBetween(Integer value1, Integer value2) {
            addCriterion("wenhua_num between", value1, value2, "wenhuaNum");
            return (Criteria) this;
        }
        public Criteria andWenhuaNumNotBetween(Integer value1, Integer value2) {
            addCriterion("wenhua_num not between", value1, value2, "wenhuaNum");
            return (Criteria) this;
        }
        public Criteria andProviderNumIsNull() {
            addCriterion("provider_num is null");
            return (Criteria) this;
        }
        public Criteria andProviderNumIsNotNull() {
            addCriterion("provider_num is not null");
            return (Criteria) this;
        }
        public Criteria andProviderNumEqualTo(Integer value) {
            addCriterion("provider_num =", value, "providerNum");
            return (Criteria) this;
        }
        public Criteria andProviderNumNotEqualTo(Integer value) {
            addCriterion("provider_num <>", value, "providerNum");
            return (Criteria) this;
        }
        public Criteria andProviderNumGreaterThan(Integer value) {
            addCriterion("provider_num >", value, "providerNum");
            return (Criteria) this;
        }
        public Criteria andProviderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("provider_num >=", value, "providerNum");
            return (Criteria) this;
        }
        public Criteria andProviderNumLessThan(Integer value) {
            addCriterion("provider_num <", value, "providerNum");
            return (Criteria) this;
        }
        public Criteria andProviderNumLessThanOrEqualTo(Integer value) {
            addCriterion("provider_num <=", value, "providerNum");
            return (Criteria) this;
        }
        public Criteria andProviderNumIn(List<Integer> values) {
            addCriterion("provider_num in", values, "providerNum");
            return (Criteria) this;
        }
        public Criteria andProviderNumNotIn(List<Integer> values) {
            addCriterion("provider_num not in", values, "providerNum");
            return (Criteria) this;
        }
        public Criteria andProviderNumBetween(Integer value1, Integer value2) {
            addCriterion("provider_num between", value1, value2, "providerNum");
            return (Criteria) this;
        }
        public Criteria andProviderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("provider_num not between", value1, value2, "providerNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 数据看板概览表
     * 
     * @author stevenlaw
     * @version 1.0 2020-07-09
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