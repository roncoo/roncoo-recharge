<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/payOrderSerial/update" data-toggle="validate" method="post">
		<input name="id" type="hidden" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">创建时间：</label>
            <input type="text" name="gmtCreate" value="${bean.gmtCreate}" placeholder="创建时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">修改时间：</label>
            <input type="text" name="gmtModified" value="${bean.gmtModified}" placeholder="修改时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商户ID：</label>
            <input type="text" name="mchInfoId" value="${bean.mchInfoId}" placeholder="商户ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商户名称：</label>
            <input type="text" name="mchInfoName" value="${bean.mchInfoName}" placeholder="商户名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付产品ID：</label>
            <input type="text" name="payProductId" value="${bean.payProductId}" placeholder="支付产品ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付产品名称：</label>
            <input type="text" name="payProductName" value="${bean.payProductName}" placeholder="支付产品名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付渠道ID：</label>
            <input type="text" name="payChannelId" value="${bean.payChannelId}" placeholder="支付渠道ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付渠道名称：</label>
            <input type="text" name="payChannelName" value="${bean.payChannelName}" placeholder="支付渠道名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付订单号：</label>
            <input type="text" name="payOrderNo" value="${bean.payOrderNo}" placeholder="支付订单号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付订单流水号：</label>
            <input type="text" name="payOrderSerialNo" value="${bean.payOrderSerialNo}" placeholder="支付订单流水号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付订单流水状态：</label>
            <input type="text" name="payOrderSerialStatus" value="${bean.payOrderSerialStatus}" placeholder="支付订单流水状态" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>