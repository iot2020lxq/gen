/*
 * FamilyCitangContent.java
 * Copyright(C) 20xx-2015 ������ά��Ϣ�ɷ����޹�˾
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.Date;

/**
 * ���׼ҹ��ѵ��
 * 
 * @author stevenlaw
 * @version 1.0 2020-05-11
 */
public class FamilyCitangContent {

    /**
     * id
     */
    private Integer id;
    /**
     * ����id
     */
    private Integer citangId;
    /**
     * ������Ƭ
     */
    private String mainPhoto;
    /**
     * ��Ƭ����
     */
    private String content;
    /**
     * �����
     */
    private Integer page;
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
    public Integer getCitangId() {
        return citangId;
    }
    public void setCitangId(Integer citangId) {
        this.citangId = citangId;
    }
    public String getMainPhoto() {
        return mainPhoto;
    }
    public void setMainPhoto(String mainPhoto) {
        this.mainPhoto = mainPhoto == null ? null : mainPhoto.trim();
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}