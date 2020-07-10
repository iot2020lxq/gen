/*
 * UserFamilyShare.java
 * Copyright(C) 20xx-2015 ������ά��Ϣ�ɷ����޹�˾
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.entity.family;

import java.util.Date;

/**
 * �û���������
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
     * �û�id
     */
    private Integer userId;
    /**
     * ��������
     */
    private String familyName;
    /**
     * ����ʱ��
     */
    private Date createDate;
    /**
     * ����ͼƬ
     */
    private String mainPhoto;
    /**
     * 1 ������2����3�û�
     */
    private Integer shareWay;
    /**
     * ������ʽ��0����1�ʼ�
     */
    private Integer jzWay;
    /**
     * ״̬��0��ʼ��1��ͨ����2δͨ��
     */
    private Integer status;
    /**
     * δͨ��ԭ��
     */
    private String reason;
    /**
     * ֤��url
     */
    private String certUrl;
    /**
     * �����ļ�url��ַ
     */
    private String fileUrl;
    /**
     * ����ʱ��
     */
    private Date updateDate;
    /**
     * ����
     */
    private String userName;
    /**
     * ��ϵ�绰
     */
    private String userMobile;
    /**
     * 1����������û���־��0δ����
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