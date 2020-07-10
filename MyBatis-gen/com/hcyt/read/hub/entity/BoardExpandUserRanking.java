/*
 * BoardExpandUserRanking.java
 * Copyright(C) 20xx-2015 ������ά��Ϣ�ɷ����޹�˾
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.entity;

/**
 * ���ݿ����ƹ��ʹ����
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
     * �û���
     */
    private String userName;
    /**
     * �û�ͷ��
     */
    private String headPicture;
    /**
     * ��������
     */
    private String shopName;
    /**
     * �ƹ�����
     */
    private Integer totalExpandNum;
    /**
     * �û�Id
     */
    private Integer userId;
    /**
     * ����id
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