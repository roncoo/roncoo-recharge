<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/acctInfo/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="gmtCreate" value="" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="gmtModified" value="" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">1 正常 2 冻结 9注销：</label>
            <input type="text" name="statusId" value="" placeholder="1 正常 2 冻结 9注销" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户ID：</label>
            <input type="text" name="userInfoId" value="" placeholder="用户ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">总余额：</label>
            <input type="text" name="totalBalance" value="" placeholder="总余额" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">最后交易余额：</label>
            <input type="text" name="lastTradeBalance" value="" placeholder="最后交易余额" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">最后交易时间：</label>
            <input type="text" name="lastTradeDate" value="" placeholder="最后交易时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">校验码：</label>
            <input type="text" name="verificationCode" value="" placeholder="校验码" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>