/*
 * TIndexFloor.java
 * Copyright(C) 20xx-2015 ������ά��Ϣ�ɷ����޹�˾
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-12 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.Date;

/**
 * ��ҳ¥���������
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
     * ����id
     */
    private String appId;
    /**
     * ��Ŀ����
     */
    private String title;
    /**
     * ¥������
     */
    private String titleMemo;
    /**
     * ¥��code������code����Ӧ��ת
     */
    private String code;
    /**
     * ����Խ��Խ��ǰ
     */
    private Integer sort;
    /**
     * ״̬��־��1��Ч
     */
    private Integer status;
    /**
     * ����ʱ��
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