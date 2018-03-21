<div class="bjui-pageContent">
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">用户ID：</label>${bean.userInfoId!}
		</div>
		<div class="col-lg-6">
			<label class="control-label">账户ID：</label>${bean.acctInfoId!}
		</div>
	</div>
	<br/>
	<br/>
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label">APPID：</label>${bean.appId!}
		</div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">昵称：</label>${bean.nickName!}
		</div>
		<div class="col-lg-6">
            <label class="control-label">价格级别：</label> <#list priceLevelEnums as enumvo><#if bean.priceLevel?? && bean.priceLevel==enumvo.code>${enumvo.desc}</#if></#list>
        </div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-12">
            <label class="control-label">公司全称：</label>${bean.compayName!}
        </div>
    </div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">充值限制：</label>${bean.chargingLimit!}元
		</div>
		<div class="col-lg-6">
			<label class="control-label">余额阈值：</label>${bean.warningBalance!}元
		</div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">保证金：</label>${bean.depositBalance!}元
		</div>
		<div class="col-lg-6">
            <label class="control-label">当前余额：</label>${bean.totalBalance/1000!}元
        </div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">接口校验类型：</label><#list apiVerifyTypeEnums as enumvo><#if bean.apiVerifyType?? && bean.apiVerifyType==enumvo.code>${enumvo.desc}</#if></#list>
		</div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label">AppSeceret：</label>${bean.appSeceret!}
	    </div>
	</div>
    <br/>
    <br/>
	<div class="form-group">
		<div class="col-lg-12">
			<label class="control-label">白名单：</label>${bean.whiteList!}
		</div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">提现校验类型：</label><#list txVerifyTypeEnums as enumvo><#if bean.txVerifyType?? && bean.txVerifyType==enumvo.code>${enumvo.desc}</#if></#list>
		</div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">支付密码：</label>${bean.payPwd!}
		</div>
		<div class="col-lg-6">
			<label class="control-label">动态秘钥：</label>${bean.verifyCodeKey!}
		</div>
	</div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>