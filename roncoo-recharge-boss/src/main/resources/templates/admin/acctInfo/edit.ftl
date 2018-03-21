<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/acctInfo/update" data-toggle="validate" method="post">
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
            <label class="control-label x85">1 正常 2 冻结 9注销：</label>
            <input type="text" name="statusId" value="${bean.statusId!}" placeholder="1 正常 2 冻结 9注销" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户ID：</label>
            <input type="text" name="userInfoId" value="${bean.userInfoId!}" placeholder="用户ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">总余额：</label>
            <input type="text" name="totalBalance" value="${bean.totalBalance!}" placeholder="总余额" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">最后交易余额：</label>
            <input type="text" name="lastTradeBalance" value="${bean.lastTradeBalance!}" placeholder="最后交易余额" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">最后交易时间：</label>
            <input type="text" name="lastTradeDate" value="${bean.lastTradeDate!}" placeholder="最后交易时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">校验码：</label>
            <input type="text" name="verificationCode" value="${bean.verificationCode!}" placeholder="校验码" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>