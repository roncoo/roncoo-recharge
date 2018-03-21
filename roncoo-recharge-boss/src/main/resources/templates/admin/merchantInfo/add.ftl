<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/merchantInfo/save" data-toggle="validate" method="post">
		
		<div class="form-group">
            <label for="priceLevel" class="control-label x95">价格级别：</label>
            <#list priceLevelEnums as enumvo>
            <input type="radio" id="priceLevel${enumvo.code}" name="priceLevel" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
		<div class="form-group">
            <label class="control-label x95">昵称：</label>
            <input type="text" name="nickName" data-toggle="lookup" data-url="${base}/admin/sysUserInfo/lookup" size="20" data-rule="required">
            <input type="hidden" name="userInfoId">
        </div>
		<div class="form-group">
            <label class="control-label x95">公司全称：</label>
            <input type="text" name="compayName" value="" placeholder="公司全称" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label class="control-label x95">充值限制：</label>
            <input type="text" name="chargingLimit" value="" placeholder="充值限制" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label class="control-label x95">余额阈值：</label>
            <input type="text" name="warningBalance" value="" placeholder="余额阈值" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label class="control-label x95">保证金：</label>
            <input type="text" name="depositBalance" value="" placeholder="保证金" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label for="apiVerifyType" class="control-label x95">接口校验类型：</label>
            <#list apiVerifyTypeEnums as enumvo>
            <input type="radio" id="apiVerifyType${enumvo.code}" name="apiVerifyType" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
		<div class="form-group">
            <label class="control-label x95">AppSeceret：</label>
            <input type="text" name="appSeceret" value="" placeholder="AppSeceret" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x95">白名单：</label>
            <textarea name="whiteList" data-toggle="autoheight" cols="20"></textarea>
        </div>
		<div class="form-group">
            <label for="txVerifyType" class="control-label x95">提现校验类型：</label>
            <#list txVerifyTypeEnums as enumvo>
            <input type="radio" id="txVerifyType${enumvo.code}" name="txVerifyType" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
		<div class="form-group">
            <label class="control-label x95">支付密码：</label>
            <input type="text" name="payPwd" value="" placeholder="支付密码" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x95">动态秘钥：</label>
            <input type="text" name="verifyCodeKey" value="" placeholder="动态秘钥" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>