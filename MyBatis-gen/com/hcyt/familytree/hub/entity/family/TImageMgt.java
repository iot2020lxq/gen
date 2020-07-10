/*
 * TImageMgt.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.Date;

/**
 * 轮播图管理
 * 
 * @author stevenlaw
 * @version 1.0 2020-05-11
 */
public class TImageMgt {

    private Integer id;
    /**
     * 显示到小程序名称
     */
    private String title;
    /**
     * 备注
     */
    private String imageMemo;
    /**
     * 图片路径
     */
    private String imgUrl;
    /**
     * 轮播图类型（0首页，1图片楼层，2广告图片）
     */
    private Integer imageType;
    /**
     * 链接类型(0跳内部地址，1跳外部地址)，当前只需要考虑0
     */
    private Integer linkType;
    /**
     * 跳转页面以及参数
     */
    private String pagesParam;
    /**
     * 是否展示,1有效
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 发布时间，过了发布时间的才显示，用于定时发布
     */
    private Date publishDate;
    /**
     * 轮播图所属的机构
     */
    private String appId;
    /**
     * 排序值，默认越大排前面
     */
    private Integer sort;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public String getImageMemo() {
        return imageMemo;
    }
    public void setImageMemo(String imageMemo) {
        this.imageMemo = imageMemo == null ? null : imageMemo.trim();
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
    public Integer getImageType() {
        return imageType;
    }
    public void setImageType(Integer imageType) {
        this.imageType = imageType;
    }
    public Integer getLinkType() {
        return linkType;
    }
    public void setLinkType(Integer linkType) {
        this.linkType = linkType;
    }
    public String getPagesParam() {
        return pagesParam;
    }
    public void setPagesParam(String pagesParam) {
        this.pagesParam = pagesParam == null ? null : pagesParam.trim();
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
    public Date getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
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