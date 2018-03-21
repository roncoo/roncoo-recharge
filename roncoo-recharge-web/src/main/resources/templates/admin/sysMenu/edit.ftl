<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/sysMenu/update" data-toggle="validate" method="post">
		<input name="id" type="hidden" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">菜单名称：</label>
            <input type="text" name="menuName" value="${bean.menuName}" placeholder="菜单名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">菜单路径：</label>
            <input type="text" name="menuUrl" value="${bean.menuUrl}" placeholder="菜单路径" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">目标名称：</label>
            <input type="text" name="targetName" value="${bean.targetName}" placeholder="目标名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">菜单图标：</label>
            <input type="text" name="menuIcon" value="${bean.menuIcon}" placeholder="菜单图标" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">排序：</label>
            <input type="text" name="sort" value="${bean.sort}" placeholder="打开方式" size="20">
        </div>
        <div class="form-group">
            <label class="control-label x85">状态：</label>
            <input type="text" name="statusId" value="${bean.statusId}" placeholder="状态" size="20">
        </div>
        <div class="form-group">
            <label class="control-label x85">备注：</label>
            <input type="text" name="remark" value="${bean.remark!}" placeholder="状态" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>