<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/accountInfo/update" data-toggle="validate" method="post">
		<input name="id" type="hidden" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">商户名称：</label>
            <input type="text" name="mchInfoName" value="${bean.mchInfoName}" placeholder="商户名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">总收益：</label>
            <input type="text" name="totalIncome" value="${bean.totalIncome}" placeholder="总收益" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">总支出：</label>
            <input type="text" name="totalExpend" value="${bean.totalExpend}" placeholder="总支出" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">今日收益：</label>
            <input type="text" name="todayIncome" value="${bean.todayIncome}" placeholder="今日收益" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">今日支出：</label>
            <input type="text" name="todayExpend" value="${bean.todayExpend}" placeholder="今日支出" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">可用账户余额：</label>
            <input type="text" name="enableBalance" value="${bean.enableBalance}" placeholder="可用账户余额" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">不可用账户余额：</label>
            <input type="text" name="unableBalance" value="${bean.unableBalance}" placeholder="不可用账户余额" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">保证金：</label>
            <input type="text" name="securityMoney" value="${bean.securityMoney}" placeholder="保证金" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">结算金额：</label>
            <input type="text" name="settleAmount" value="${bean.settleAmount}" placeholder="结算金额" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>