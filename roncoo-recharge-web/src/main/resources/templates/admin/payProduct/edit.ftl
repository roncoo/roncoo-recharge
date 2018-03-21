<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/payProduct/update" data-toggle="validate" method="post">
		<input name="id" type="hidden" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">产品名称：</label>
            <input type="text" name="productName" value="${bean.productName}" placeholder="产品名称" size="20">
        </div>
        <div class="form-group">
            <label class="control-label x85">产品类型：</label>
            <select name="productType" data-toggle="selectpicker" data-rule="required" data-width="100">
                <#list productTypeEnums as productType>
                <option value="${productType.code}" <#if bean.productType == productType.code>selected="selected"</#if>>${productType.desc}</option>
                </#list>
            </select>
        </div>
        <div class="form-group">
            <label class="control-label x85">状态：</label>
            <#list statusIdEnums as statusId>
            <input type="radio" name="statusId" value="${statusId.code}" data-toggle="icheck" data-label="${statusId.desc}" <#if bean.statusId == statusId.code>checked="checked"</#if>/> 
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