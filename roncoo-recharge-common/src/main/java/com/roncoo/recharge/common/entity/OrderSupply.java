/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderSupply implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer orderStatus;

    private Long orderTradeNo;

    private Long itemSupplyId;

    private Long userInfoId;

    private Long itemId;

    private Integer itemCategory;

    private Integer itemType;

    private String itemNo;

    private String itemName;

    private String mobile;

    private Long supplyInfoId;

    private String supplyCode;

    private String supplyName;

    private Long supplySerialNo;

    private String supplyFacePrice;

    private Integer supplyCostPrice;

    private Integer supplyActualCost;

    private String supplyDesc;

    private Integer repeatType;

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

    public Long getOrderTradeNo() {
        return orderTradeNo;
    }

    public void setOrderTradeNo(Long orderTradeNo) {
        this.orderTradeNo = orderTradeNo;
    }

    public Long getItemSupplyId() {
        return itemSupplyId;
    }

    public void setItemSupplyId(Long itemSupplyId) {
        this.itemSupplyId = itemSupplyId;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Long getSupplyInfoId() {
        return supplyInfoId;
    }

    public void setSupplyInfoId(Long supplyInfoId) {
        this.supplyInfoId = supplyInfoId;
    }

    public String getSupplyCode() {
        return supplyCode;
    }

    public void setSupplyCode(String supplyCode) {
        this.supplyCode = supplyCode == null ? null : supplyCode.trim();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName == null ? null : supplyName.trim();
    }

    public Long getSupplySerialNo() {
        return supplySerialNo;
    }

    public void setSupplySerialNo(Long supplySerialNo) {
        this.supplySerialNo = supplySerialNo;
    }

    public String getSupplyFacePrice() {
        return supplyFacePrice;
    }

    public void setSupplyFacePrice(String supplyFacePrice) {
        this.supplyFacePrice = supplyFacePrice == null ? null : supplyFacePrice.trim();
    }

    public Integer getSupplyCostPrice() {
        return supplyCostPrice;
    }

    public void setSupplyCostPrice(Integer supplyCostPrice) {
        this.supplyCostPrice = supplyCostPrice;
    }

    public Integer getSupplyActualCost() {
        return supplyActualCost;
    }

    public void setSupplyActualCost(Integer supplyActualCost) {
        this.supplyActualCost = supplyActualCost;
    }

    public String getSupplyDesc() {
        return supplyDesc;
    }

    public void setSupplyDesc(String supplyDesc) {
        this.supplyDesc = supplyDesc == null ? null : supplyDesc.trim();
    }

    public Integer getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(Integer repeatType) {
        this.repeatType = repeatType;
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
        sb.append(", orderTradeNo=").append(orderTradeNo);
        sb.append(", itemSupplyId=").append(itemSupplyId);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemCategory=").append(itemCategory);
        sb.append(", itemType=").append(itemType);
        sb.append(", itemNo=").append(itemNo);
        sb.append(", itemName=").append(itemName);
        sb.append(", mobile=").append(mobile);
        sb.append(", supplyInfoId=").append(supplyInfoId);
        sb.append(", supplyCode=").append(supplyCode);
        sb.append(", supplyName=").append(supplyName);
        sb.append(", supplySerialNo=").append(supplySerialNo);
        sb.append(", supplyFacePrice=").append(supplyFacePrice);
        sb.append(", supplyCostPrice=").append(supplyCostPrice);
        sb.append(", supplyActualCost=").append(supplyActualCost);
        sb.append(", supplyDesc=").append(supplyDesc);
        sb.append(", repeatType=").append(repeatType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
