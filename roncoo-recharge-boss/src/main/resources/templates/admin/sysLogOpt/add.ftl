<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/sysLogOpt/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">创建时间：</label>
            <input type="text" name="gmtCreate" value="" placeholder="创建时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户ID：</label>
            <input type="text" name="userInfoId" value="" placeholder="用户ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">真实姓名：</label>
            <input type="text" name="loginName" value="" placeholder="真实姓名" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>