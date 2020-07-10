/*
 * UserFamilyShare.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.Date;

/**
 * 用户分享族谱
 * 
 * @author stevenlaw
 * @version 1.0 2020-05-11
 */
public class UserFamilyShare {

    /**
     * id
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 族谱名称
     */
    private String familyName;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 封面图片
     */
    private String mainPhoto;
    /**
     * 1 捐赠，2共享，3置换
     */
    private Integer shareWay;
    /**
     * 捐赠方式，0线上1邮寄
     */
    private Integer jzWay;
    /**
     * 状态，0初始，1已通过，2未通过
     */
    private Integer status;
    /**
     * 未通过原因
     */
    private String reason;
    /**
     * 证书url
     */
    private String certUrl;
    /**
     * 线上文件url地址
     */
    private String fileUrl;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 联系电话
     */
    private String userMobile;
    /**
     * 1开启共享和置换标志，0未开启
     */
    private Integer readFlag;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public String getMainPhoto() {
        return mainPhoto;
    }
    public void setMainPhoto(String mainPhoto) {
        this.mainPhoto = mainPhoto == null ? null : mainPhoto.trim();
    }
    public Integer getShareWay() {
        return shareWay;
    }
    public void setShareWay(Integer shareWay) {
        this.shareWay = shareWay;
    }
    public Integer getJzWay() {
        return jzWay;
    }
    public void setJzWay(Integer jzWay) {
        this.jzWay = jzWay;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
    public String getCertUrl() {
        return certUrl;
    }
    public void setCertUrl(String certUrl) {
        this.certUrl = certUrl == null ? null : certUrl.trim();
    }
    public String getFileUrl() {
        return fileUrl;
    }
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
    public String getUserMobile() {
        return userMobile;
    }
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }
    public Integer getReadFlag() {
        return readFlag;
    }
    public void setReadFlag(Integer readFlag) {
        this.readFlag = readFlag;
    }
}