<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/orderTrade/update" data-toggle="validate" method="post">
		<input type="hidden" name="id" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="gmtCreate" value="${bean.gmtCreate!}" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="gmtModified" value="${bean.gmtModified!}" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85"> 1创建 处理中 2 成功 3 失败 9 未确认：</label>
            <input type="text" name="orderStatus" value="${bean.orderStatus!}" placeholder=" 1创建 处理中 2 成功 3 失败 9 未确认" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">下游用户ID：</label>
            <input type="text" name="userInfoId" value="${bean.userInfoId!}" placeholder="下游用户ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付单ID：</label>
            <input type="text" name="acctInfoId" value="${bean.acctInfoId!}" placeholder="支付单ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">供应商商品ID：</label>
            <input type="text" name="itemSupplyId" value="${bean.itemSupplyId!}" placeholder="供应商商品ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商品ID：</label>
            <input type="text" name="itemId" value="${bean.itemId!}" placeholder="商品ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商品编号：</label>
            <input type="text" name="itemNo" value="${bean.itemNo!}" placeholder="商品编号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商品名称：</label>
            <input type="text" name="itemName" value="${bean.itemName!}" placeholder="商品名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商品类型：1流量，2话费：</label>
            <input type="text" name="itemType" value="${bean.itemType!}" placeholder="商品类型：1流量，2话费" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">销售价格：</label>
            <input type="text" name="salesPrice" value="${bean.salesPrice!}" placeholder="销售价格" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">面值：</label>
            <input type="text" name="facePrice" value="${bean.facePrice!}" placeholder="面值" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">成本价：</label>
            <input type="text" name="costPrice" value="${bean.costPrice!}" placeholder="成本价" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">实际扣费：</label>
            <input type="text" name="actualCost" value="${bean.actualCost!}" placeholder="实际扣费" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">交易订单：</label>
            <input type="text" name="tradeNo" value="${bean.tradeNo!}" placeholder="交易订单" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付流水号：</label>
            <input type="text" name="paySerialNo" value="${bean.paySerialNo!}" placeholder="支付流水号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">下游订单号：</label>
            <input type="text" name="orderNo" value="${bean.orderNo!}" placeholder="下游订单号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">下游订单时间：</label>
            <input type="text" name="orderTime" value="${bean.orderTime!}" placeholder="下游订单时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">运营商类型：</label>
            <input type="text" name="carrierType" value="${bean.carrierType!}" placeholder="运营商类型" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">省编码：</label>
            <input type="text" name="provinceCode" value="${bean.provinceCode!}" placeholder="省编码" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">省名称：</label>
            <input type="text" name="provinceName" value="${bean.provinceName!}" placeholder="省名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">上游供货摘要：</label>
            <input type="text" name="supplyDesc" value="${bean.supplyDesc!}" placeholder="上游供货摘要" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">供货次数：</label>
            <input type="text" name="supplyCount" value="${bean.supplyCount!}" placeholder="供货次数" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">供货索引：</label>
            <input type="text" name="supplyIndex" value="${bean.supplyIndex!}" placeholder="供货索引" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">回调地址：</label>
            <input type="text" name="notifyUrl" value="${bean.notifyUrl!}" placeholder="回调地址" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">流量生效方式：1立即生效，2下月生效：</label>
            <input type="text" name="flowMode" value="${bean.flowMode!}" placeholder="流量生效方式：1立即生效，2下月生效" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">流量范围：1全国，2本地：</label>
            <input type="text" name="flowScope" value="${bean.flowScope!}" placeholder="流量范围：1全国，2本地" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">卡号：</label>
            <input type="text" name="cardNo" value="${bean.cardNo!}" placeholder="卡号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">卡密：</label>
            <input type="text" name="cardPwd" value="${bean.cardPwd!}" placeholder="卡密" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>