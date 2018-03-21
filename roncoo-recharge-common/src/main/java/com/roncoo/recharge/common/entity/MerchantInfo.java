/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.io.Serializable;
import java.util.Date;

public class MerchantInfo implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer statusId;

    private Long userInfoId;

    private Long acctInfoId;

    private String appId;

    private Integer priceLevel;

    private String nickName;

    private String compayName;

    private Integer chargingLimit;

    private Integer warningBalance;

    private Integer depositBalance;

    private Integer apiVerifyType;

    private String appSeceret;

    private String whiteList;

    private Integer txVerifyType;

    private String payPwd;

    private String verifyCodeKey;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Long getAcctInfoId() {
        return acctInfoId;
    }

    public void setAcctInfoId(Long acctInfoId) {
        this.acctInfoId = acctInfoId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public Integer getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(Integer priceLevel) {
        this.priceLevel = priceLevel;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getCompayName() {
        return compayName;
    }

    public void setCompayName(String compayName) {
        this.compayName = compayName == null ? null : compayName.trim();
    }

    public Integer getChargingLimit() {
        return chargingLimit;
    }

    public void setChargingLimit(Integer chargingLimit) {
        this.chargingLimit = chargingLimit;
    }

    public Integer getWarningBalance() {
        return warningBalance;
    }

    public void setWarningBalance(Integer warningBalance) {
        this.warningBalance = warningBalance;
    }

    public Integer getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(Integer depositBalance) {
        this.depositBalance = depositBalance;
    }

    public Integer getApiVerifyType() {
        return apiVerifyType;
    }

    public void setApiVerifyType(Integer apiVerifyType) {
        this.apiVerifyType = apiVerifyType;
    }

    public String getAppSeceret() {
        return appSeceret;
    }

    public void setAppSeceret(String appSeceret) {
        this.appSeceret = appSeceret == null ? null : appSeceret.trim();
    }

    public String getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(String whiteList) {
        this.whiteList = whiteList == null ? null : whiteList.trim();
    }

    public Integer getTxVerifyType() {
        return txVerifyType;
    }

    public void setTxVerifyType(Integer txVerifyType) {
        this.txVerifyType = txVerifyType;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd == null ? null : payPwd.trim();
    }

    public String getVerifyCodeKey() {
        return verifyCodeKey;
    }

    public void setVerifyCodeKey(String verifyCodeKey) {
        this.verifyCodeKey = verifyCodeKey == null ? null : verifyCodeKey.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", statusId=").append(statusId);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", acctInfoId=").append(acctInfoId);
        sb.append(", appId=").append(appId);
        sb.append(", priceLevel=").append(priceLevel);
        sb.append(", nickName=").append(nickName);
        sb.append(", compayName=").append(compayName);
        sb.append(", chargingLimit=").append(chargingLimit);
        sb.append(", warningBalance=").append(warningBalance);
        sb.append(", depositBalance=").append(depositBalance);
        sb.append(", apiVerifyType=").append(apiVerifyType);
        sb.append(", appSeceret=").append(appSeceret);
        sb.append(", whiteList=").append(whiteList);
        sb.append(", txVerifyType=").append(txVerifyType);
        sb.append(", payPwd=").append(payPwd);
        sb.append(", verifyCodeKey=").append(verifyCodeKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
