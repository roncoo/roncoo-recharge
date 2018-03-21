<div class="bjui-pageContent">
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">商户ID：</label>${bean.mchInfoId}
		</div>
		<div class="col-lg-6">
			<label class="control-label ">商户名称：</label>${bean.mchInfoName}
		</div>
	</div>
	<br/>
	<br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">总收益：</label>${bean.totalIncome}
		</div>
		<div class="col-lg-6">
			<label class="control-label ">总支出：</label>${bean.totalExpend}
		</div>
	</div>
	<br/>
	<br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">今日收益：</label>${bean.todayIncome}
		</div>
		<div class="col-lg-6">
			<label class="control-label ">今日支出：</label>${bean.todayExpend}
		</div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">可用账户余额：</label>${bean.enableBalance}
		</div>
		<div class="col-lg-6">
			<label class="control-label ">不可用账户余额：</label>${bean.unableBalance}
		</div>
	</div>
	<br/>
	<br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">保证金：</label>${bean.securityMoney}
		</div>
		<div class="col-lg-6">
			<label class="control-label ">结算金额：</label>${bean.settleAmount}
		</div>
	</div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>