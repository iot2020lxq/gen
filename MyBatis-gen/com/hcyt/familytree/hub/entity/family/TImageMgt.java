/*
 * TImageMgt.java
 * Copyright(C) 20xx-2015 ������ά��Ϣ�ɷ����޹�˾
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.Date;

/**
 * �ֲ�ͼ����
 * 
 * @author stevenlaw
 * @version 1.0 2020-05-11
 */
public class TImageMgt {

    private Integer id;
    /**
     * ��ʾ��С��������
     */
    private String title;
    /**
     * ��ע
     */
    private String imageMemo;
    /**
     * ͼƬ·��
     */
    private String imgUrl;
    /**
     * �ֲ�ͼ���ͣ�0��ҳ��1ͼƬ¥�㣬2���ͼƬ��
     */
    private Integer imageType;
    /**
     * ��������(0���ڲ���ַ��1���ⲿ��ַ)����ǰֻ��Ҫ����0
     */
    private Integer linkType;
    /**
     * ��תҳ���Լ�����
     */
    private String pagesParam;
    /**
     * �Ƿ�չʾ,1��Ч
     */
    private Integer status;
    /**
     * ����ʱ��
     */
    private Date createDate;
    /**
     * ����ʱ�䣬���˷���ʱ��Ĳ���ʾ�����ڶ�ʱ����
     */
    private Date publishDate;
    /**
     * �ֲ�ͼ�����Ļ���
     */
    private String appId;
    /**
     * ����ֵ��Ĭ��Խ����ǰ��
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