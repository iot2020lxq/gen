/*
 * TIndexFloor.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-12 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.Date;

/**
 * 首页楼层基础属性
 * 
 * @author stevenlaw
 * @version 1.0 2020-05-12
 */
public class TIndexFloor {

    /**
     * id
     */
    private Integer id;
    /**
     * 机构id
     */
    private String appId;
    /**
     * 栏目名称
     */
    private String title;
    /**
     * 楼层描述
     */
    private String titleMemo;
    /**
     * 楼层code，根据code做对应跳转
     */
    private String code;
    /**
     * 排序，越大越靠前
     */
    private Integer sort;
    /**
     * 状态标志，1有效
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createDate;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public String getTitleMemo() {
        return titleMemo;
    }
    public void setTitleMemo(String titleMemo) {
        this.titleMemo = titleMemo == null ? null : titleMemo.trim();
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
    public Integer getSort() {
        return sort;
    }
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}