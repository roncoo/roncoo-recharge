<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/sysUser/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>账号：</label>
			<input type="text" name="number" value="" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/sysUser/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="sysUser-add" data-options="{title:'添加', height:350}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>用户手机</th>
				<th>用户邮箱</th>
				<th>真实姓名</th>
				<th>用户昵称</th>
				<th>组织全路径名称</th>
				<th>性别</th>
				<th>用户状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.userPhone}</td>
				<td>${bean.userEmail}</td>
				<td>${bean.userRealname}</td>
				<td>${bean.userNickname}</td>
				<td>${bean.orgMergerName!}</td>
				<td>
				<#list userSexEnums as userSex>
                    <#if bean.userSex == userSex.code>${userSex.desc}</#if>
                </#list>
                </td>
				<td>
				<#list userStatusEnums as userStatus>
                    <#if bean.userStatus == userStatus.code>${userStatus.desc}</#if>
                </#list>
                </td>
				<td>
					<a href="${base}/admin/sysRoleUser/set?userId=${bean.id}" class="btn btn-orange" data-toggle="dialog" data-id="sysUser-set" data-options="{title:'设置角色', height:350}">设置角色 </a>
					<a href="${base}/admin/sysUser/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="sysUser-view" data-options="{title:'查看', height:350}">查看 </a>
					<a href="${base}/admin/sysUser/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="sysUser-edit" data-options="{title:'修改', height:350}">修改 </a>
					<a href="${base}/admin/sysUser/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="sysUser-delete" data-confirm-msg="确定要删除吗？">删除</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
