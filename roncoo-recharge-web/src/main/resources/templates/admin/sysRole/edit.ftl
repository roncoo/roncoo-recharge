<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/sysRole/update" data-toggle="validate" method="post">
		<input name="id" type="hidden" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">名称：</label>
            <input type="text" name="roleName" value="${bean.roleName}" placeholder="创建时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">排序：</label>
            <input type="text" name="sort" value="${bean.sort}" placeholder="修改时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">状态：</label>
            <input type="text" name="statusId" value="${bean.statusId}" placeholder="状态" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">备注：</label>
            <input type="text" name="remark" value="${bean.remark!}" placeholder="名称" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>