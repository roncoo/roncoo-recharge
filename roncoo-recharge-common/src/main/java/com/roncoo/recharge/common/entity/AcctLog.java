/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.io.Serializable;
import java.util.Date;

public class AcctLog implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Long userInfoId;

    private Long acctInfoId;

    private Integer billType;

    private Integer billStatus;

    private Integer tradeType;

    private Long paySerialNo;

    private Integer amount;

    private Long totalBalance;

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

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public Integer getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Long getPaySerialNo() {
        return paySerialNo;
    }

    public void setPaySerialNo(Long paySerialNo) {
        this.paySerialNo = paySerialNo;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Long totalBalance) {
        this.totalBalance = totalBalance;
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
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", acctInfoId=").append(acctInfoId);
        sb.append(", billType=").append(billType);
        sb.append(", billStatus=").append(billStatus);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", paySerialNo=").append(paySerialNo);
        sb.append(", amount=").append(amount);
        sb.append(", totalBalance=").append(totalBalance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
