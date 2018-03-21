<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/sysOrganization/update" data-toggle="validate" method="post">
		<input name="id" type="hidden" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">组织名称：</label>
            <input type="text" name="organizationName" value="${bean.organizationName}" placeholder="组织名称" size="20">
        </div>
		
	   <div class="form-group">
            <label class="control-label x85">备注：</label>
            <input type="text" name="remark" value="${bean.remark!}" placeholder="备注" size="20">
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