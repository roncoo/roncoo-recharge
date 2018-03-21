<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/sysUser/update" data-toggle="validate" method="post">
		<input name="id" type="hidden" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">用户手机：</label>
            <input type="text" name="userPhone" value="${bean.userPhone}" placeholder="手机" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户邮箱：</label>
            <input type="text" name="userEmail" value="${bean.userEmail}" placeholder="邮箱" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">真实姓名：</label>
            <input type="text" name="userRealname" value="${bean.userRealname}" placeholder="真实姓名" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户昵称：</label>
            <input type="text" name="userNickname" value="${bean.userNickname}" placeholder="昵称" size="20">
        </div>
		
        
		<div class="form-group">
            <label class="control-label x85">头像：</label>
            <input type="text" name="headImage" value="${bean.headImage}" placeholder="头像" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">排序：</label>
            <input type="text" name="sort" value="${bean.sort}" placeholder="头像" size="20">
        </div>
        <div class="form-group">
            <label class="control-label x85">用户性别：</label>
            <#list userSexEnums as userSex>
            <input type="radio" name="userSex" value="${userSex.code}" data-toggle="icheck" data-label="${userSex.desc}" <#if bean.userSex == userSex.code>checked="checked"</#if>/> 
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label x85">用户状态：</label>
            <#list userStatusEnums as userStatus>
            <input type="radio" name="userStatus" value="${userStatus.code}" data-toggle="icheck" data-label="${userStatus.desc}" <#if bean.userStatus == userStatus.code>checked="checked"</#if>/> 
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