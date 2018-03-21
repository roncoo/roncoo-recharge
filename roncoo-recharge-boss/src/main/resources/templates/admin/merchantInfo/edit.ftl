<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/merchantInfo/update" data-toggle="validate" method="post">
		<input type="hidden" name="id" value="${bean.id}"/>
		<div class="form-group">
            <label for="priceLevel" class="control-label x95">价格级别：</label>
            <#list priceLevelEnums as enumvo>
            <input type="radio" id="priceLevel${enumvo.code}" name="priceLevel" value="${enumvo.code}" <#if bean.priceLevel?? && bean.priceLevel==enumvo.code>checked</#if> data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
	
		<div class="form-group">
            <label class="control-label x95">公司全称：</label>
            <input type="text" name="compayName" value="${bean.compayName!}" placeholder="公司全称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x95">充值限制：</label>
            <input type="text" name="chargingLimit" value="${bean.chargingLimit!}" placeholder="充值限制" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x95">余额阈值：</label>
            <input type="text" name="warningBalance" value="${bean.warningBalance!}" placeholder="余额阈值" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x95">保证金：</label>
            <input type="text" name="depositBalance" value="${bean.depositBalance!}" placeholder="保证金" size="20">
        </div>
		<div class="form-group">
            <label for="apiVerifyType" class="control-label x95">接口校验类型：</label>
            <#list apiVerifyTypeEnums as enumvo>
            <input type="radio" id="apiVerifyType${enumvo.code}" name="apiVerifyType" value="${enumvo.code}" <#if bean.apiVerifyType?? && bean.apiVerifyType==enumvo.code>checked</#if> data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
		<div class="form-group">
            <label class="control-label x95">AppSeceret：</label>
            <input type="text" name="appSeceret" value="${bean.appSeceret!}" placeholder="AppSeceret" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x95">白名单：</label>
            <input type="text" name="whiteList" value="${bean.whiteList!}" placeholder="白名单" size="20">
        </div>
		<div class="form-group">
            <label for="txVerifyType" class="control-label x95">提现校验类型：</label>
            <#list txVerifyTypeEnums as enumvo>
            <input type="radio" id="txVerifyType${enumvo.code}" name="txVerifyType" value="${enumvo.code}" <#if bean.txVerifyType?? && bean.txVerifyType==enumvo.code>checked</#if> data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
		<div class="form-group">
            <label class="control-label x95">支付密码：</label>
            <input type="text" name="payPwd" value="${bean.payPwd!}" placeholder="支付密码" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x95">动态秘钥：</label>
            <input type="text" name="verifyCodeKey" value="${bean.verifyCodeKey!}" placeholder="动态秘钥" size="20">
        </div>
        <div class="form-group">
            <label for="statusId" class="control-label x95">状态：</label>
            <#list statusIdEnums as enumvo>
            <input type="radio" id="statusId${enumvo.code}" name="statusId" value="${enumvo.code}" <#if bean.statusId?? && bean.statusId==enumvo.code>checked</#if> data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>