<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/sysUser/save" data-toggle="validate" method="post">
		
		<div class="form-group">
            <label class="control-label x85">用户手机：</label>
            <input type="text" name="userPhone" value="" placeholder="手机" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户邮箱：</label>
            <input type="text" name="userEmail" value="" placeholder="邮箱" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">真实姓名：</label>
            <input type="text" name="userRealname" value="" placeholder="真实姓名" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户昵称：</label>
            <input type="text" name="userNickname" value="" placeholder="昵称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">用户密码：</label>
            <input type="text" name="pwd" value="" placeholder="用户密码" size="20">
        </div>
        <div class="form-group">
            <label class="control-label x85">性别：</label>
            <#list userSexEnums as userSex>
            <input type="radio" name="userSex" value="${userSex.code}" data-toggle="icheck" data-label="${userSex.desc}" /> 
            </#list>
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