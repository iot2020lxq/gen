/*
 * FamilyCitangContent.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.Date;

/**
 * 族谱家规家训表
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
     * 祠堂id
     */
    private Integer citangId;
    /**
     * 祠堂照片
     */
    private String mainPhoto;
    /**
     * 照片描述
     */
    private String content;
    /**
     * 排序号
     */
    private Integer page;
    /**
     * 创建时间
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