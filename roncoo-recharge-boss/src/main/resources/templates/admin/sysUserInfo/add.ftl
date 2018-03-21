<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/sysUserInfo/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">登录名：</label>
            <input type="text" name="loginName" value="" placeholder="登录名" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户名：</label>
            <input type="text" name="nickName" value="" placeholder="用户名" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label class="control-label x85">邮箱：</label>
            <input type="text" name="email" value="" placeholder="邮箱" size="20" data-rule="required,email">
        </div>
        <div class="form-group">
            <label class="control-label x85">手机：</label>
            <input type="text" name="mobile" value="" placeholder="手机" size="20" data-rule="required,mobile">
        </div>
        <div class="form-group">
            <label class="control-label x85">地址：</label>
            <textarea name="addr" data-toggle="autoheight" cols="20"></textarea>
        </div>
		<div class="form-group">
            <label for="userType" class="control-label x85">类型：</label>
            <#list userTypeEnums as enumvo>
            <input type="radio" id="userType${enumvo.code}" name="userType" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
        <div class="form-group">
            <label for="statusId" class="control-label x85">状态：</label>
            <#list statusIdEnums as enumvo>
            <input type="radio" id="statusId${enumvo.code}" name="statusId" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>