/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderTradePay implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer payStatus;

    private Long paySerialNo;

    private Long orderTradeNo;

    private Long userInfoId;

    private Long acctInfoId;

    private Long acctLogId;

    private Long itemId;

    private String itemNo;

    private Integer salesPrice;

    private Integer payType;

    private Integer tradeType;

    private String errorMsg;

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

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Long getPaySerialNo() {
        return paySerialNo;
    }

    public void setPaySerialNo(Long paySerialNo) {
        this.paySerialNo = paySerialNo;
    }

    public Long getOrderTradeNo() {
        return orderTradeNo;
    }

    public void setOrderTradeNo(Long orderTradeNo) {
        this.orderTradeNo = orderTradeNo;
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

    public Long getAcctLogId() {
        return acctLogId;
    }

    public void setAcctLogId(Long acctLogId) {
        this.acctLogId = acctLogId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public Integer getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Integer salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
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
        sb.append(", payStatus=").append(payStatus);
        sb.append(", paySerialNo=").append(paySerialNo);
        sb.append(", orderTradeNo=").append(orderTradeNo);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", acctInfoId=").append(acctInfoId);
        sb.append(", acctLogId=").append(acctLogId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemNo=").append(itemNo);
        sb.append(", salesPrice=").append(salesPrice);
        sb.append(", payType=").append(payType);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", errorMsg=").append(errorMsg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
