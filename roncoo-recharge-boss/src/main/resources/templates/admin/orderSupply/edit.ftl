<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/orderSupply/update" data-toggle="validate" method="post">
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
            <label class="control-label x85">0创建 1处理中 2 成功 3 失败 9 未确认：</label>
            <input type="text" name="orderStatus" value="${bean.orderStatus!}" placeholder="0创建 1处理中 2 成功 3 失败 9 未确认" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">平台交易号：</label>
            <input type="text" name="orderTradeNo" value="${bean.orderTradeNo!}" placeholder="平台交易号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">供应商商品ID：</label>
            <input type="text" name="itemSupplyId" value="${bean.itemSupplyId!}" placeholder="供应商商品ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户ID：</label>
            <input type="text" name="userInfoId" value="${bean.userInfoId!}" placeholder="用户ID" size="20">
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
            <label class="control-label x85">上游商户编号：</label>
            <input type="text" name="supplyInfoId" value="${bean.supplyInfoId!}" placeholder="上游商户编号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">上游商户名称：</label>
            <input type="text" name="supplyName" value="${bean.supplyName!}" placeholder="上游商户名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">上游供货流水号：</label>
            <input type="text" name="supplySerialNo" value="${bean.supplySerialNo!}" placeholder="上游供货流水号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商品面值：</label>
            <input type="text" name="supplyFacePrice" value="${bean.supplyFacePrice!}" placeholder="商品面值" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">平台录入成本价：</label>
            <input type="text" name="supplyCostPrice" value="${bean.supplyCostPrice!}" placeholder="平台录入成本价" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">上游实际扣款价：</label>
            <input type="text" name="supplyActualCost" value="${bean.supplyActualCost!}" placeholder="上游实际扣款价" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">上游充值信息：</label>
            <input type="text" name="supplyDesc" value="${bean.supplyDesc!}" placeholder="上游充值信息" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">是否补充：</label>
            <input type="text" name="repeatType" value="${bean.repeatType!}" placeholder="是否补充" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>