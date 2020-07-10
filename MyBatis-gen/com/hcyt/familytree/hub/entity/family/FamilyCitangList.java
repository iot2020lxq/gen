/*
 * FamilyCitangList.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.Date;

/**
 * 族谱祠堂列表
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
     * 族谱id
     */
    private Integer familyId;
    /**
     * 姓氏
     */
    private String surname;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 祠堂名称
     */
    private String title;
    /**
     * 图片数量
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