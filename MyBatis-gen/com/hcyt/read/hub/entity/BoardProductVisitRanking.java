/*
 * BoardProductVisitRanking.java
 * Copyright(C) 20xx-2015 ������ά��Ϣ�ɷ����޹�˾
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.entity;

/**
 * ���ݿ�����Դ����������
 * 
 * @author stevenlaw
 * @version 1.0 2020-07-09
 */
public class BoardProductVisitRanking {

    /**
     * Id
     */
    private Integer id;
    /**
     * �鼮����
     */
    private String productName;
    /**
     * �ܷ�����
     */
    private Integer totalVisitProduct;
    /**
     * ��Ʒ���� 1 ������2 ���飬3������
     */
    private Integer productType;
    /**
     * ��ƷId
     */
    private Integer productId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }
    public Integer getTotalVisitProduct() {
        return totalVisitProduct;
    }
    public void setTotalVisitProduct(Integer totalVisitProduct) {
        this.totalVisitProduct = totalVisitProduct;
    }
    public Integer getProductType() {
        return productType;
    }
    public void setProductType(Integer productType) {
        this.productType = productType;
    }
    public Integer getProductId() {
        return productId;
    }
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}