<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/payOrder/update" data-toggle="validate" method="post">
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
            <label class="control-label x85">状态：</label>
            <input type="text" name="statusId" value="${bean.statusId}" placeholder="状态" size="20">
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
            <label class="control-label x85">支付订单号：</label>
            <input type="text" name="payOrderNo" value="${bean.payOrderNo}" placeholder="支付订单号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付订单流水号：</label>
            <input type="text" name="payOrderSerialNo" value="${bean.payOrderSerialNo}" placeholder="支付订单流水号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付次数：</label>
            <input type="text" name="payCount" value="${bean.payCount}" placeholder="支付次数" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付索引：</label>
            <input type="text" name="payIndex" value="${bean.payIndex}" placeholder="支付索引" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">订单状态：</label>
            <input type="text" name="orderStatus" value="${bean.orderStatus}" placeholder="订单状态" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">订单号：</label>
            <input type="text" name="orderNo" value="${bean.orderNo}" placeholder="订单号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">订单价格：</label>
            <input type="text" name="orderPrice" value="${bean.orderPrice}" placeholder="订单价格" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">订单商品：</label>
            <input type="text" name="orderProduct" value="${bean.orderProduct}" placeholder="订单商品" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">订单IP：</label>
            <input type="text" name="orderIp" value="${bean.orderIp}" placeholder="订单IP" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">订单时间：</label>
            <input type="text" name="orderTime" value="${bean.orderTime}" placeholder="订单时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">页面通知地址：</label>
            <input type="text" name="returnUrl" value="${bean.returnUrl}" placeholder="页面通知地址" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>