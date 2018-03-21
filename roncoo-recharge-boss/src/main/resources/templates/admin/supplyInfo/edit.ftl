<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/supplyInfo/update" data-toggle="validate" method="post">
		<input type="hidden" name="id" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">公司名：</label>
            <input type="text" name="compayName" value="${bean.compayName!}" placeholder="公司名" size="61">
        </div>
		<div class="form-group">
            <label class="control-label x85">请求URl：</label>
            <input type="text" name="paraRequestUrl" value="${bean.paraRequestUrl!}" placeholder="参数：请求URl" size="61">
        </div>
		<div class="form-group">
            <label class="control-label x85">订单url：</label>
            <input type="text" name="paraOrderUrl" value="${bean.paraOrderUrl!}" placeholder="参数：订单查询url" size="61">
        </div>
		<div class="form-group">
            <label class="control-label x85">余额URL：</label>
            <input type="text" name="paraBalanceUrl" value="${bean.paraBalanceUrl!}" placeholder="参数：余额查询URL" size="61">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">用户ID：</label>
            <input type="text" name="paraUserId" value="${bean.paraUserId!}" placeholder="参数：用户ID" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">key：</label>
            <input type="text" name="paraKey" value="${bean.paraKey!}" placeholder="参数：key" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">seceret：</label>
            <input type="text" name="paraSeceret" value="${bean.paraSeceret!}" placeholder="参数：seceret" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">扩展参数1：</label>
            <input type="text" name="paraExt1" value="${bean.paraExt1!}" placeholder="扩展参数1" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">扩展参数2：</label>
            <input type="text" name="paraExt2" value="${bean.paraExt2!}" placeholder="扩展参数2" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">扩展参数3：</label>
            <input type="text" name="paraExt3" value="${bean.paraExt3!}" placeholder="扩展参数3" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">扩展参数4：</label>
            <input type="text" name="paraExt4" value="${bean.paraExt4!}" placeholder="扩展参数4" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">扩展参数5：</label>
            <input type="text" name="paraExt5" value="${bean.paraExt5!}" placeholder="扩展参数5" size="20">
        </div>
        <div class="form-group x2">
            <label for="statusId" class="control-label x85">状态：</label>
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