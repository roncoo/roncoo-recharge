<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/sysOrganization/save" data-toggle="validate" method="post">
        <input type="hidden" name="parentId" value="${bean.parentId}"/>
	    <input type="hidden" name="organizationType" value="${bean.organizationType}"/>
        <div class="form-group">
            <label class="control-label x85">组织名称：</label>
            <input type="text" name="organizationName" value="" placeholder="组织名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">备注：</label>
            <input type="text" name="remark" value="" placeholder="备注" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>