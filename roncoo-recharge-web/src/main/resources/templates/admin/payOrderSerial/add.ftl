<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/payOrderSerial/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="id" value="" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">创建时间：</label>
            <input type="text" name="gmtCreate" value="" placeholder="创建时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">修改时间：</label>
            <input type="text" name="gmtModified" value="" placeholder="修改时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商户ID：</label>
            <input type="text" name="mchInfoId" value="" placeholder="商户ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商户名称：</label>
            <input type="text" name="mchInfoName" value="" placeholder="商户名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付产品ID：</label>
            <input type="text" name="payProductId" value="" placeholder="支付产品ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付产品名称：</label>
            <input type="text" name="payProductName" value="" placeholder="支付产品名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付渠道ID：</label>
            <input type="text" name="payChannelId" value="" placeholder="支付渠道ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付渠道名称：</label>
            <input type="text" name="payChannelName" value="" placeholder="支付渠道名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付订单号：</label>
            <input type="text" name="payOrderNo" value="" placeholder="支付订单号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付订单流水号：</label>
            <input type="text" name="payOrderSerialNo" value="" placeholder="支付订单流水号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付订单流水状态：</label>
            <input type="text" name="payOrderSerialStatus" value="" placeholder="支付订单流水状态" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>