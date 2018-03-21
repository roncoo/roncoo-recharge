<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/payProduct/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">产品名称：</label>
            <input type="text" name="productName" value="" placeholder="产品名称" size="20">
        </div>
        <div class="form-group">
            <label class="control-label x85">产品类型：</label>
            <select name="productType" data-toggle="selectpicker" data-rule="required" data-width="100">
                <#list productTypeEnums as productType>
                <option value="${productType.code}">${productType.desc}</option>
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