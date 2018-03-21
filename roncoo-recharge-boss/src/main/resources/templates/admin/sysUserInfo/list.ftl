<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/sysUserInfo/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>登录名：</label>
			<input type="text" name="loginName" value="${bean.loginName!}" class="form-control" size="12">&nbsp;
			<label>手机：</label>
            <input type="text" name="mobile" value="${bean.mobile!}" class="form-control" size="12">&nbsp;
			<label>类型：</label>
            <select name="userType" data-toggle="selectpicker">
                <option value="">全部</option>
                <#list userTypeEnums as enumvo>
                    <option value="${enumvo.code}" <#if bean.userType?? && enumvo.code == bean.userType>selected="selected"</#if>>${enumvo.desc!}</option> 
                </#list>
            </select>&nbsp;
            
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/sysUserInfo/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="sysUserInfo-add" data-options="{title:'添加', height:350}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>登录名</th>
				<th>用户名</th>
				<th>邮箱</th>
				<th>手机</th>
				<th>地址</th>
				<th>类型</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.loginName!}</td>
				<td>${bean.nickName!}</td>
				<td>${bean.email!}</td>
				<td>${bean.mobile!}</td>
				<td>${bean.addr!}</td>
				<td><#list userTypeEnums as enumvo><#if bean.userType?? && bean.userType==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td><#list statusIdEnums as enumvo><#if bean.statusId?? && bean.statusId==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td>
					<a href="${base}/admin/sysUserInfo/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="sysUserInfo-view" data-options="{title:'查看', height:350}">查看 </a>
					<a href="${base}/admin/sysUserInfo/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="sysUserInfo-edit" data-options="{title:'修改', height:400}">修改 </a>
					<a href="${base}/admin/sysUserInfo/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="sysUserInfo-delete" data-confirm-msg="确定要删除吗？">删除</a>
					<#if bean.userType == 1>
				    <a href="${base}/admin/sysRoleUser/set?userInfoId=${bean.id}" class="btn btn-orange" data-toggle="dialog" data-id="sysUser-set" data-options="{title:'设置角色', height:350, width:800}">设置角色 </a>
                    </#if>
                </td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
