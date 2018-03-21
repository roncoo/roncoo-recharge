<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/sysLogLogin/update" data-toggle="validate" method="post">
		<input type="hidden" name="id" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">创建时间：</label>
            <input type="text" name="gmtCreate" value="${bean.gmtCreate!}" placeholder="创建时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户ID：</label>
            <input type="text" name="userInfoId" value="${bean.userInfoId!}" placeholder="用户ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">登录名：</label>
            <input type="text" name="loginName" value="${bean.loginName!}" placeholder="登录名" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">登录IP：</label>
            <input type="text" name="loginIp" value="${bean.loginIp!}" placeholder="登录IP" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">上次登录IP：</label>
            <input type="text" name="lastLoginIp" value="${bean.lastLoginIp!}" placeholder="上次登录IP" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">上次登录时间：</label>
            <input type="text" name="lastLoginTime" value="${bean.lastLoginTime!}" placeholder="上次登录时间" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>