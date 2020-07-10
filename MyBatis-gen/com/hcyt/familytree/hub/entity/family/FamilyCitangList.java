/*
 * FamilyCitangList.java
 * Copyright(C) 20xx-2015 ������ά��Ϣ�ɷ����޹�˾
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.Date;

/**
 * ���������б�
 * 
 * @author stevenlaw
 * @version 1.0 2020-05-11
 */
public class FamilyCitangList {

    /**
     * id
     */
    private Integer id;
    /**
     * ����id
     */
    private Integer familyId;
    /**
     * ����
     */
    private String surname;
    /**
     * ����ʱ��
     */
    private Date createDate;
    /**
     * ��������
     */
    private String title;
    /**
     * ͼƬ����
     */
    private Integer photoNum;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getFamilyId() {
        return familyId;
    }
    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public Integer getPhotoNum() {
        return photoNum;
    }
    public void setPhotoNum(Integer photoNum) {
        this.photoNum = photoNum;
    }
}