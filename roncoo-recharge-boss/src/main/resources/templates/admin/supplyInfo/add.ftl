<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/supplyInfo/save" data-toggle="validate" method="post">
	    <div class="form-group x2">
            <label for="supplyCategory" class="control-label x85">类别：</label>
            <#list supplyCategoryEnums as enumvo>
            <input type="radio" id="supplyCategory${enumvo.code}" name="supplyCategory" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
		<div class="form-group x2">
            <label class="control-label x85">名称：</label>
            <input type="text" name="supplyName" value="" placeholder="名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">公司名：</label>
            <input type="text" name="compayName" value="" placeholder="公司名" size="61">
        </div>
		<div class="form-group">
            <label class="control-label x85">请求URl：</label>
            <input type="text" name="paraRequestUrl" value="" placeholder="参数：请求URl" size="61">
        </div>
		<div class="form-group">
            <label class="control-label x85">订单url：</label>
            <input type="text" name="paraOrderUrl" value="" placeholder="参数：订单查询url" size="61">
        </div>
		<div class="form-group">
            <label class="control-label x85">余额URL：</label>
            <input type="text" name="paraBalanceUrl" value="" placeholder="参数：余额查询URL" size="61">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">用户ID：</label>
            <input type="text" name="paraUserId" value="" placeholder="参数：用户ID" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">key：</label>
            <input type="text" name="paraKey" value="" placeholder="参数：key" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">seceret：</label>
            <input type="text" name="paraSeceret" value="" placeholder="参数：seceret" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">扩展参数1：</label>
            <input type="text" name="paraExt1" value="" placeholder="扩展参数1" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">扩展参数2：</label>
            <input type="text" name="paraExt2" value="" placeholder="扩展参数2" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">扩展参数3：</label>
            <input type="text" name="paraExt3" value="" placeholder="扩展参数3" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">扩展参数4：</label>
            <input type="text" name="paraExt4" value="" placeholder="扩展参数4" size="20">
        </div>
		<div class="form-group x2">
            <label class="control-label x85">扩展参数5：</label>
            <input type="text" name="paraExt5" value="" placeholder="扩展参数5" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>