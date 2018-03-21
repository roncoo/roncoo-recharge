/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.recharge.common.entity;

import java.io.Serializable;
import java.util.Date;

public class SupplyInfo implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer statusId;

    private Integer supplyCategory;

    private String supplyCode;

    private String supplyName;

    private String compayName;

    private String paraRequestUrl;

    private String paraOrderUrl;

    private String paraBalanceUrl;

    private String paraUserId;

    private String paraKey;

    private String paraSeceret;

    private String paraExt1;

    private String paraExt2;

    private String paraExt3;

    private String paraExt4;

    private String paraExt5;

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

    public Integer getSupplyCategory() {
        return supplyCategory;
    }

    public void setSupplyCategory(Integer supplyCategory) {
        this.supplyCategory = supplyCategory;
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

    public String getCompayName() {
        return compayName;
    }

    public void setCompayName(String compayName) {
        this.compayName = compayName == null ? null : compayName.trim();
    }

    public String getParaRequestUrl() {
        return paraRequestUrl;
    }

    public void setParaRequestUrl(String paraRequestUrl) {
        this.paraRequestUrl = paraRequestUrl == null ? null : paraRequestUrl.trim();
    }

    public String getParaOrderUrl() {
        return paraOrderUrl;
    }

    public void setParaOrderUrl(String paraOrderUrl) {
        this.paraOrderUrl = paraOrderUrl == null ? null : paraOrderUrl.trim();
    }

    public String getParaBalanceUrl() {
        return paraBalanceUrl;
    }

    public void setParaBalanceUrl(String paraBalanceUrl) {
        this.paraBalanceUrl = paraBalanceUrl == null ? null : paraBalanceUrl.trim();
    }

    public String getParaUserId() {
        return paraUserId;
    }

    public void setParaUserId(String paraUserId) {
        this.paraUserId = paraUserId == null ? null : paraUserId.trim();
    }

    public String getParaKey() {
        return paraKey;
    }

    public void setParaKey(String paraKey) {
        this.paraKey = paraKey == null ? null : paraKey.trim();
    }

    public String getParaSeceret() {
        return paraSeceret;
    }

    public void setParaSeceret(String paraSeceret) {
        this.paraSeceret = paraSeceret == null ? null : paraSeceret.trim();
    }

    public String getParaExt1() {
        return paraExt1;
    }

    public void setParaExt1(String paraExt1) {
        this.paraExt1 = paraExt1 == null ? null : paraExt1.trim();
    }

    public String getParaExt2() {
        return paraExt2;
    }

    public void setParaExt2(String paraExt2) {
        this.paraExt2 = paraExt2 == null ? null : paraExt2.trim();
    }

    public String getParaExt3() {
        return paraExt3;
    }

    public void setParaExt3(String paraExt3) {
        this.paraExt3 = paraExt3 == null ? null : paraExt3.trim();
    }

    public String getParaExt4() {
        return paraExt4;
    }

    public void setParaExt4(String paraExt4) {
        this.paraExt4 = paraExt4 == null ? null : paraExt4.trim();
    }

    public String getParaExt5() {
        return paraExt5;
    }

    public void setParaExt5(String paraExt5) {
        this.paraExt5 = paraExt5 == null ? null : paraExt5.trim();
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
        sb.append(", supplyCategory=").append(supplyCategory);
        sb.append(", supplyCode=").append(supplyCode);
        sb.append(", supplyName=").append(supplyName);
        sb.append(", compayName=").append(compayName);
        sb.append(", paraRequestUrl=").append(paraRequestUrl);
        sb.append(", paraOrderUrl=").append(paraOrderUrl);
        sb.append(", paraBalanceUrl=").append(paraBalanceUrl);
        sb.append(", paraUserId=").append(paraUserId);
        sb.append(", paraKey=").append(paraKey);
        sb.append(", paraSeceret=").append(paraSeceret);
        sb.append(", paraExt1=").append(paraExt1);
        sb.append(", paraExt2=").append(paraExt2);
        sb.append(", paraExt3=").append(paraExt3);
        sb.append(", paraExt4=").append(paraExt4);
        sb.append(", paraExt5=").append(paraExt5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
