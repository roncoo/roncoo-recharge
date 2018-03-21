/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String salesArea;

    private String facePrice;

    private Integer costPrice;

    private Integer salesPrice1;

    private Integer salesPrice2;

    private Integer salesPrice3;

    private Integer carrierType;

    private Integer itemCategory;

    private Integer itemType;

    private Integer itemStatus;

    private String itemNo;

    private String itemName;

    private String itemDesc;

    private Integer flowScope;

    private Integer flowPackageType;

    private Integer flowStreamType;

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

    public String getSalesArea() {
        return salesArea;
    }

    public void setSalesArea(String salesArea) {
        this.salesArea = salesArea == null ? null : salesArea.trim();
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

    public Integer getSalesPrice1() {
        return salesPrice1;
    }

    public void setSalesPrice1(Integer salesPrice1) {
        this.salesPrice1 = salesPrice1;
    }

    public Integer getSalesPrice2() {
        return salesPrice2;
    }

    public void setSalesPrice2(Integer salesPrice2) {
        this.salesPrice2 = salesPrice2;
    }

    public Integer getSalesPrice3() {
        return salesPrice3;
    }

    public void setSalesPrice3(Integer salesPrice3) {
        this.salesPrice3 = salesPrice3;
    }

    public Integer getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(Integer carrierType) {
        this.carrierType = carrierType;
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

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
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

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", salesArea=").append(salesArea);
        sb.append(", facePrice=").append(facePrice);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", salesPrice1=").append(salesPrice1);
        sb.append(", salesPrice2=").append(salesPrice2);
        sb.append(", salesPrice3=").append(salesPrice3);
        sb.append(", carrierType=").append(carrierType);
        sb.append(", itemCategory=").append(itemCategory);
        sb.append(", itemType=").append(itemType);
        sb.append(", itemStatus=").append(itemStatus);
        sb.append(", itemNo=").append(itemNo);
        sb.append(", itemName=").append(itemName);
        sb.append(", itemDesc=").append(itemDesc);
        sb.append(", flowScope=").append(flowScope);
        sb.append(", flowPackageType=").append(flowPackageType);
        sb.append(", flowStreamType=").append(flowStreamType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
