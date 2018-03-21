/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.io.Serializable;
import java.util.Date;

public class ItemSupply implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer itemStatus;

    private Long itemId;

    private String itemNo;

    private String itemName;

    private Long supplyInfoId;

    private String supplyCode;

    private String supplyName;

    private Integer priority;

    private Integer lossType;

    private Integer lossTime;

    private String facePrice;

    private Integer costPrice;

    private String supplyProductCode;

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

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getLossType() {
        return lossType;
    }

    public void setLossType(Integer lossType) {
        this.lossType = lossType;
    }

    public Integer getLossTime() {
        return lossTime;
    }

    public void setLossTime(Integer lossTime) {
        this.lossTime = lossTime;
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

    public String getSupplyProductCode() {
        return supplyProductCode;
    }

    public void setSupplyProductCode(String supplyProductCode) {
        this.supplyProductCode = supplyProductCode == null ? null : supplyProductCode.trim();
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
        sb.append(", itemStatus=").append(itemStatus);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemNo=").append(itemNo);
        sb.append(", itemName=").append(itemName);
        sb.append(", supplyInfoId=").append(supplyInfoId);
        sb.append(", supplyCode=").append(supplyCode);
        sb.append(", supplyName=").append(supplyName);
        sb.append(", priority=").append(priority);
        sb.append(", lossType=").append(lossType);
        sb.append(", lossTime=").append(lossTime);
        sb.append(", facePrice=").append(facePrice);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", supplyProductCode=").append(supplyProductCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
