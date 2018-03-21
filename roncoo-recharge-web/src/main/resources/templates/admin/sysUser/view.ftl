<div class="bjui-pageContent">
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">用户手机：</label>${bean.userPhone}
		</div>
		<div class="col-lg-6">
			<label class="control-label ">用户邮箱：</label>${bean.userEmail}
		</div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">真实姓名：</label>${bean.userRealname}
		</div>
		<div class="col-lg-6">
			<label class="control-label ">用户昵称：</label>${bean.userNickname}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">组织全路径名称：</label>${bean.orgMergerName!}
		</div>
	</div>
	<br/>
    <br/>
     <div class="form-group">
        <div class="col-lg-6">
            <label class="control-label ">性别：</label>
            <#list userSexEnums as userSex>
                <#if bean.userSex == userSex.code>${userSex.desc}</#if>
            </#list>
        </div>
		<div class="col-lg-6">
			<label class="control-label ">头像：</label>${bean.headImage}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-6">
            <label class="control-label ">排序：</label>${bean.sort}
        </div>

        <div class="col-lg-6">
            <label class="control-label ">用户状态：</label>
            <#list userStatusEnums as userStatus>
                <#if bean.userStatus == userStatus.code>${userStatus.desc}</#if>
            </#list>
        </div>
    </div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>