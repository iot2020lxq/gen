/*
 * BoardProductVisitRanking.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.entity;

/**
 * 数据看板资源访问量排行
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
     * 书籍名称
     */
    private String productName;
    /**
     * 总访问量
     */
    private Integer totalVisitProduct;
    /**
     * 产品类型 1 精读，2 听书，3电子书
     */
    private Integer productType;
    /**
     * 产品Id
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