<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/acctLog/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="gmtCreate" value="" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="gmtModified" value="" placeholder="" size="20">
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
            <label class="control-label x85">交易单类型 1支付单 2充值单 3退款单 4提现单：</label>
            <input type="text" name="billType" value="" placeholder="交易单类型 1支付单 2充值单 3退款单 4提现单" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">账单状态：1 成功 2 异常：</label>
            <input type="text" name="billStatus" value="" placeholder="账单状态：1 成功 2 异常" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">交易类型：1 入账 2 出账：</label>
            <input type="text" name="tradeType" value="" placeholder="交易类型：1 入账 2 出账" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">支付交易订单号：</label>
            <input type="text" name="paySerialNo" value="" placeholder="支付交易订单号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">余额：</label>
            <input type="text" name="totalBalance" value="" placeholder="余额" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>