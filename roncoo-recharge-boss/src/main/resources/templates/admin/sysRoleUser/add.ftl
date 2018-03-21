<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/sysRoleUser/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">创建时间：</label>
            <input type="text" name="gmtCreate" value="" placeholder="创建时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">修改时间：</label>
            <input type="text" name="gmtModified" value="" placeholder="修改时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">1 正常 2 冻结 9 注销：</label>
            <input type="text" name="statusId" value="" placeholder="1 正常 2 冻结 9 注销" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">角色ID：</label>
            <input type="text" name="roleId" value="" placeholder="角色ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户ID：</label>
            <input type="text" name="userInfoId" value="" placeholder="用户ID" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>