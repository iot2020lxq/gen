/*
 * BoardExpandRanking.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.entity;

/**
 * 数据看板推广量排行
 * 
 * @author stevenlaw
 * @version 1.0 2020-07-09
 */
public class BoardExpandRanking {

    /**
     * id
     */
    private Integer id;
    /**
     * 机构名称
     */
    private String shopName;
    /**
     * 总推广人数
     */
    private Integer totalExpandNum;
    /**
     * 机构级别1 省级馆，2 市级馆，3县级馆
     */
    private Integer shopLevel;
    /**
     * 机构Id
     */
    private Integer shopId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public Integer getShopLevel() {
        return shopLevel;
    }
    public void setShopLevel(Integer shopLevel) {
        this.shopLevel = shopLevel;
    }
    public Integer getShopId() {
        return shopId;
    }
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}