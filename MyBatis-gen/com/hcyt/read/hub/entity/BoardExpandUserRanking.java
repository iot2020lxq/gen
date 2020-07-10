/*
 * BoardExpandUserRanking.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.entity;

/**
 * 数据看板推广大使排行
 * 
 * @author stevenlaw
 * @version 1.0 2020-07-09
 */
public class BoardExpandUserRanking {

    /**
     * Id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户头像
     */
    private String headPicture;
    /**
     * 机构名称
     */
    private String shopName;
    /**
     * 推广数量
     */
    private Integer totalExpandNum;
    /**
     * 用户Id
     */
    private Integer userId;
    /**
     * 机构id
     */
    private Integer shopId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
    public String getHeadPicture() {
        return headPicture;
    }
    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture == null ? null : headPicture.trim();
    }
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }
    public Integer getTotalExpandNum() {
        return totalExpandNum;
    }
    public void setTotalExpandNum(Integer totalExpandNum) {
        this.totalExpandNum = totalExpandNum;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getShopId() {
        return shopId;
    }
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}