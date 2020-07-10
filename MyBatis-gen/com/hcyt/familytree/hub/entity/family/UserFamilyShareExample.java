/*
 * UserFamilyShareExample.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserFamilyShareExample {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public UserFamilyShareExample() {
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
     * 用户分享族谱
     * 
     * @author stevenlaw
     * @version 1.0 2020-05-11
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
        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }
        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }
        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }
        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }
        public Criteria andFamilyNameIsNull() {
            addCriterion("family_name is null");
            return (Criteria) this;
        }
        public Criteria andFamilyNameIsNotNull() {
            addCriterion("family_name is not null");
            return (Criteria) this;
        }
        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("family_name =", value, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("family_name <>", value, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("family_name >", value, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("family_name >=", value, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("family_name <", value, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("family_name <=", value, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameLike(String value) {
            addCriterion("family_name like", value, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("family_name not like", value, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("family_name in", values, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("family_name not in", values, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("family_name between", value1, value2, "familyName");
            return (Criteria) this;
        }
        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("family_name not between", value1, value2, "familyName");
            return (Criteria) this;
        }
        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }
        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }
        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }
        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }
        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }
        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }
        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }
        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }
        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }
        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }
        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }
        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }
        public Criteria andMainPhotoIsNull() {
            addCriterion("main_photo is null");
            return (Criteria) this;
        }
        public Criteria andMainPhotoIsNotNull() {
            addCriterion("main_photo is not null");
            return (Criteria) this;
        }
        public Criteria andMainPhotoEqualTo(String value) {
            addCriterion("main_photo =", value, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoNotEqualTo(String value) {
            addCriterion("main_photo <>", value, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoGreaterThan(String value) {
            addCriterion("main_photo >", value, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("main_photo >=", value, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoLessThan(String value) {
            addCriterion("main_photo <", value, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoLessThanOrEqualTo(String value) {
            addCriterion("main_photo <=", value, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoLike(String value) {
            addCriterion("main_photo like", value, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoNotLike(String value) {
            addCriterion("main_photo not like", value, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoIn(List<String> values) {
            addCriterion("main_photo in", values, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoNotIn(List<String> values) {
            addCriterion("main_photo not in", values, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoBetween(String value1, String value2) {
            addCriterion("main_photo between", value1, value2, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andMainPhotoNotBetween(String value1, String value2) {
            addCriterion("main_photo not between", value1, value2, "mainPhoto");
            return (Criteria) this;
        }
        public Criteria andShareWayIsNull() {
            addCriterion("share_way is null");
            return (Criteria) this;
        }
        public Criteria andShareWayIsNotNull() {
            addCriterion("share_way is not null");
            return (Criteria) this;
        }
        public Criteria andShareWayEqualTo(Integer value) {
            addCriterion("share_way =", value, "shareWay");
            return (Criteria) this;
        }
        public Criteria andShareWayNotEqualTo(Integer value) {
            addCriterion("share_way <>", value, "shareWay");
            return (Criteria) this;
        }
        public Criteria andShareWayGreaterThan(Integer value) {
            addCriterion("share_way >", value, "shareWay");
            return (Criteria) this;
        }
        public Criteria andShareWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_way >=", value, "shareWay");
            return (Criteria) this;
        }
        public Criteria andShareWayLessThan(Integer value) {
            addCriterion("share_way <", value, "shareWay");
            return (Criteria) this;
        }
        public Criteria andShareWayLessThanOrEqualTo(Integer value) {
            addCriterion("share_way <=", value, "shareWay");
            return (Criteria) this;
        }
        public Criteria andShareWayIn(List<Integer> values) {
            addCriterion("share_way in", values, "shareWay");
            return (Criteria) this;
        }
        public Criteria andShareWayNotIn(List<Integer> values) {
            addCriterion("share_way not in", values, "shareWay");
            return (Criteria) this;
        }
        public Criteria andShareWayBetween(Integer value1, Integer value2) {
            addCriterion("share_way between", value1, value2, "shareWay");
            return (Criteria) this;
        }
        public Criteria andShareWayNotBetween(Integer value1, Integer value2) {
            addCriterion("share_way not between", value1, value2, "shareWay");
            return (Criteria) this;
        }
        public Criteria andJzWayIsNull() {
            addCriterion("jz_way is null");
            return (Criteria) this;
        }
        public Criteria andJzWayIsNotNull() {
            addCriterion("jz_way is not null");
            return (Criteria) this;
        }
        public Criteria andJzWayEqualTo(Integer value) {
            addCriterion("jz_way =", value, "jzWay");
            return (Criteria) this;
        }
        public Criteria andJzWayNotEqualTo(Integer value) {
            addCriterion("jz_way <>", value, "jzWay");
            return (Criteria) this;
        }
        public Criteria andJzWayGreaterThan(Integer value) {
            addCriterion("jz_way >", value, "jzWay");
            return (Criteria) this;
        }
        public Criteria andJzWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("jz_way >=", value, "jzWay");
            return (Criteria) this;
        }
        public Criteria andJzWayLessThan(Integer value) {
            addCriterion("jz_way <", value, "jzWay");
            return (Criteria) this;
        }
        public Criteria andJzWayLessThanOrEqualTo(Integer value) {
            addCriterion("jz_way <=", value, "jzWay");
            return (Criteria) this;
        }
        public Criteria andJzWayIn(List<Integer> values) {
            addCriterion("jz_way in", values, "jzWay");
            return (Criteria) this;
        }
        public Criteria andJzWayNotIn(List<Integer> values) {
            addCriterion("jz_way not in", values, "jzWay");
            return (Criteria) this;
        }
        public Criteria andJzWayBetween(Integer value1, Integer value2) {
            addCriterion("jz_way between", value1, value2, "jzWay");
            return (Criteria) this;
        }
        public Criteria andJzWayNotBetween(Integer value1, Integer value2) {
            addCriterion("jz_way not between", value1, value2, "jzWay");
            return (Criteria) this;
        }
        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }
        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }
        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }
        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }
        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }
        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }
        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }
        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }
        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }
        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }
        public Criteria andCertUrlIsNull() {
            addCriterion("cert_url is null");
            return (Criteria) this;
        }
        public Criteria andCertUrlIsNotNull() {
            addCriterion("cert_url is not null");
            return (Criteria) this;
        }
        public Criteria andCertUrlEqualTo(String value) {
            addCriterion("cert_url =", value, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlNotEqualTo(String value) {
            addCriterion("cert_url <>", value, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlGreaterThan(String value) {
            addCriterion("cert_url >", value, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cert_url >=", value, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlLessThan(String value) {
            addCriterion("cert_url <", value, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlLessThanOrEqualTo(String value) {
            addCriterion("cert_url <=", value, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlLike(String value) {
            addCriterion("cert_url like", value, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlNotLike(String value) {
            addCriterion("cert_url not like", value, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlIn(List<String> values) {
            addCriterion("cert_url in", values, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlNotIn(List<String> values) {
            addCriterion("cert_url not in", values, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlBetween(String value1, String value2) {
            addCriterion("cert_url between", value1, value2, "certUrl");
            return (Criteria) this;
        }
        public Criteria andCertUrlNotBetween(String value1, String value2) {
            addCriterion("cert_url not between", value1, value2, "certUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }
        public Criteria andFileUrlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }
        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("file_url =", value, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("file_url >", value, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlLessThan(String value) {
            addCriterion("file_url <", value, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlLike(String value) {
            addCriterion("file_url like", value, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlNotLike(String value) {
            addCriterion("file_url not like", value, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("file_url in", values, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "fileUrl");
            return (Criteria) this;
        }
        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }
        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }
        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }
        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }
        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }
        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }
        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }
        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }
        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }
        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }
        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }
        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }
        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }
        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }
        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }
        public Criteria andUserMobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }
        public Criteria andUserMobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }
        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileLessThan(String value) {
            addCriterion("user_mobile <", value, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileLike(String value) {
            addCriterion("user_mobile like", value, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }
        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }
        public Criteria andReadFlagIsNull() {
            addCriterion("read_flag is null");
            return (Criteria) this;
        }
        public Criteria andReadFlagIsNotNull() {
            addCriterion("read_flag is not null");
            return (Criteria) this;
        }
        public Criteria andReadFlagEqualTo(Integer value) {
            addCriterion("read_flag =", value, "readFlag");
            return (Criteria) this;
        }
        public Criteria andReadFlagNotEqualTo(Integer value) {
            addCriterion("read_flag <>", value, "readFlag");
            return (Criteria) this;
        }
        public Criteria andReadFlagGreaterThan(Integer value) {
            addCriterion("read_flag >", value, "readFlag");
            return (Criteria) this;
        }
        public Criteria andReadFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_flag >=", value, "readFlag");
            return (Criteria) this;
        }
        public Criteria andReadFlagLessThan(Integer value) {
            addCriterion("read_flag <", value, "readFlag");
            return (Criteria) this;
        }
        public Criteria andReadFlagLessThanOrEqualTo(Integer value) {
            addCriterion("read_flag <=", value, "readFlag");
            return (Criteria) this;
        }
        public Criteria andReadFlagIn(List<Integer> values) {
            addCriterion("read_flag in", values, "readFlag");
            return (Criteria) this;
        }
        public Criteria andReadFlagNotIn(List<Integer> values) {
            addCriterion("read_flag not in", values, "readFlag");
            return (Criteria) this;
        }
        public Criteria andReadFlagBetween(Integer value1, Integer value2) {
            addCriterion("read_flag between", value1, value2, "readFlag");
            return (Criteria) this;
        }
        public Criteria andReadFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("read_flag not between", value1, value2, "readFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 用户分享族谱
     * 
     * @author stevenlaw
     * @version 1.0 2020-05-11
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