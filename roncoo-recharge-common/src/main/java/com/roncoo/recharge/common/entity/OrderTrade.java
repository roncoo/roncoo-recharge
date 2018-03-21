/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderTrade implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer orderStatus;

    private Long userInfoId;

    private Long acctInfoId;

    private Long itemSupplyId;

    private Long itemId;

    private Integer itemCategory;

    private Integer itemType;

    private String itemNo;

    private String itemName;

    private Integer salesPrice;

    private String facePrice;

    private Integer costPrice;

    private Integer actualCost;

    private String mobile;

    private Integer channel;

    private Long tradeNo;

    private Long paySerialNo;

    private String orderNo;

    private Date orderTime;

    private Integer carrierType;

    private String supplyDesc;

    private Integer supplyCount;

    private Integer supplyIndex;

    private String notifyUrl;

    private Integer flowMode;

    private Integer flowScope;

    private Integer flowPackageType;

    private Integer flowStreamType;

    private String cardNo;

    private String cardPwd;

    private Integer repeatType;

    private Long supplySerialNo;

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

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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

    public Long getItemSupplyId() {
        return itemSupplyId;
    }

    public void setItemSupplyId(Long itemSupplyId) {
        this.itemSupplyId = itemSupplyId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(Integer itemCategory) {
        this.itemCategory = itemCategory;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Integer salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getFacePrice() {
        return facePrice;
    }

    public void setFacePrice(String facePrice) {
        this.facePrice = facePrice == null ? null : facePrice.trim();
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getActualCost() {
        return actualCost;
    }

    public void setActualCost(Integer actualCost) {
        this.actualCost = actualCost;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Long getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(Long tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Long getPaySerialNo() {
        return paySerialNo;
    }

    public void setPaySerialNo(Long paySerialNo) {
        this.paySerialNo = paySerialNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(Integer carrierType) {
        this.carrierType = carrierType;
    }

    public String getSupplyDesc() {
        return supplyDesc;
    }

    public void setSupplyDesc(String supplyDesc) {
        this.supplyDesc = supplyDesc == null ? null : supplyDesc.trim();
    }

    public Integer getSupplyCount() {
        return supplyCount;
    }

    public void setSupplyCount(Integer supplyCount) {
        this.supplyCount = supplyCount;
    }

    public Integer getSupplyIndex() {
        return supplyIndex;
    }

    public void setSupplyIndex(Integer supplyIndex) {
        this.supplyIndex = supplyIndex;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public Integer getFlowMode() {
        return flowMode;
    }

    public void setFlowMode(Integer flowMode) {
        this.flowMode = flowMode;
    }

    public Integer getFlowScope() {
        return flowScope;
    }

    public void setFlowScope(Integer flowScope) {
        this.flowScope = flowScope;
    }

    public Integer getFlowPackageType() {
        return flowPackageType;
    }

    public void setFlowPackageType(Integer flowPackageType) {
        this.flowPackageType = flowPackageType;
    }

    public Integer getFlowStreamType() {
        return flowStreamType;
    }

    public void setFlowStreamType(Integer flowStreamType) {
        this.flowStreamType = flowStreamType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getCardPwd() {
        return cardPwd;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd == null ? null : cardPwd.trim();
    }

    public Integer getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(Integer repeatType) {
        this.repeatType = repeatType;
    }

    public Long getSupplySerialNo() {
        return supplySerialNo;
    }

    public void setSupplySerialNo(Long supplySerialNo) {
        this.supplySerialNo = supplySerialNo;
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
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", acctInfoId=").append(acctInfoId);
        sb.append(", itemSupplyId=").append(itemSupplyId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemCategory=").append(itemCategory);
        sb.append(", itemType=").append(itemType);
        sb.append(", itemNo=").append(itemNo);
        sb.append(", itemName=").append(itemName);
        sb.append(", salesPrice=").append(salesPrice);
        sb.append(", facePrice=").append(facePrice);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", actualCost=").append(actualCost);
        sb.append(", mobile=").append(mobile);
        sb.append(", channel=").append(channel);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", paySerialNo=").append(paySerialNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", carrierType=").append(carrierType);
        sb.append(", supplyDesc=").append(supplyDesc);
        sb.append(", supplyCount=").append(supplyCount);
        sb.append(", supplyIndex=").append(supplyIndex);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", flowMode=").append(flowMode);
        sb.append(", flowScope=").append(flowScope);
        sb.append(", flowPackageType=").append(flowPackageType);
        sb.append(", flowStreamType=").append(flowStreamType);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", cardPwd=").append(cardPwd);
        sb.append(", repeatType=").append(repeatType);
        sb.append(", supplySerialNo=").append(supplySerialNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
