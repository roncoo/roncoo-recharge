<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/accountInfo/save" data-toggle="validate" method="post">
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
            <label class="control-label x85">状态：</label>
            <input type="text" name="statusId" value="" placeholder="状态" size="20">
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
            <label class="control-label x85">总收益：</label>
            <input type="text" name="totalIncome" value="" placeholder="总收益" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">总支出：</label>
            <input type="text" name="totalExpend" value="" placeholder="总支出" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">今日收益：</label>
            <input type="text" name="todayIncome" value="" placeholder="今日收益" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">今日支出：</label>
            <input type="text" name="todayExpend" value="" placeholder="今日支出" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">可用账户余额：</label>
            <input type="text" name="enableBalance" value="" placeholder="可用账户余额" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">不可用账户余额：</label>
            <input type="text" name="unableBalance" value="" placeholder="不可用账户余额" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">保证金：</label>
            <input type="text" name="securityMoney" value="" placeholder="保证金" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">结算金额：</label>
            <input type="text" name="settleAmount" value="" placeholder="结算金额" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>