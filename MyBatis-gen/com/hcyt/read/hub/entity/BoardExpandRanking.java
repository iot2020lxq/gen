/*
 * BoardExpandRanking.java
 * Copyright(C) 20xx-2015 ������ά��Ϣ�ɷ����޹�˾
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.entity;

/**
 * ���ݿ����ƹ�������
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
     * ��������
     */
    private String shopName;
    /**
     * ���ƹ�����
     */
    private Integer totalExpandNum;
    /**
     * ��������1 ʡ���ݣ�2 �м��ݣ�3�ؼ���
     */
    private Integer shopLevel;
    /**
     * ����Id
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