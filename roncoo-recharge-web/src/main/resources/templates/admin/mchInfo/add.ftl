<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/mchInfo/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">商户名称：</label>
            <input type="text" name="infoName" value="" placeholder="商户名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商户类型：</label>
            <select name="infoType" data-toggle="selectpicker" data-rule="required" data-width="100">
            <#list infoTypeEnums as infoType>
                <option value="${infoType.code}">${infoType.desc}</option>
            </#list>
            </select>
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>