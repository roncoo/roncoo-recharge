<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/orderTradePay/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="gmtCreate" value="" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="gmtModified" value="" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">1创建 2支付成功 3支付失败 9异常：</label>
            <input type="text" name="payStatus" value="" placeholder="1创建 2支付成功 3支付失败 9异常" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">交易订单ID：</label>
            <input type="text" name="paySerialNo" value="" placeholder="交易订单ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">平台交易号：</label>
            <input type="text" name="orderTradeNo" value="" placeholder="平台交易号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户ID：</label>
            <input type="text" name="userInfoId" value="" placeholder="用户ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">账户ID：</label>
            <input type="text" name="acctInfoId" value="" placeholder="账户ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">账户日志ID：</label>
            <input type="text" name="acctLogId" value="" placeholder="账户日志ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商品ID：</label>
            <input type="text" name="itemId" value="" placeholder="商品ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商品编号：</label>
            <input type="text" name="itemNo" value="" placeholder="商品编号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">销售价：</label>
            <input type="text" name="salesPrice" value="" placeholder="销售价" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付类型：1余额：</label>
            <input type="text" name="payType" value="" placeholder="支付类型：1余额" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">交易类型：1 入账 2 出账：</label>
            <input type="text" name="tradeType" value="" placeholder="交易类型：1 入账 2 出账" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">错误信息：</label>
            <input type="text" name="errorMsg" value="" placeholder="错误信息" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>