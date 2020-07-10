/*
 * IndexButton.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-13 Created
 */
package com.hcyt.familytree.hub.entity.family;

/**
 * 
 * 
 * @author stevenlaw
 * @version 1.0 2020-05-13
 */
public class IndexButton {

    private Integer id;
    private String picture;
    private String buttonName;
    private Integer status;
    private String appId;
    private Integer sort;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
    public String getButtonName() {
        return buttonName;
    }
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName == null ? null : buttonName.trim();
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }
    public Integer getSort() {
        return sort;
    }
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}