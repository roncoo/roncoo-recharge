<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/sysMenuRole/set" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>账号：</label>
			<input type="text" name="number" value="" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/sysRole/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="sysRole-add" data-options="{title:'添加', height:200}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>名称</th>
				<th>排序</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.roleName}</td>
				<td>${bean.sort}</td>
				<td>${bean.statusId}</td>
				<td>
					<a href="${base}/admin/sysMenuRole/set?roleId=${bean.id}" class="btn btn-orange" data-toggle="dialog" data-id="sysRole-set" data-options="{title:'设置菜单', height:350}">设置菜单 </a>
					<a href="${base}/admin/sysRole/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="sysRole-view" data-options="{title:'查看', height:200}">查看 </a>
					<a href="${base}/admin/sysRole/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="sysRole-edit" data-options="{title:'修改', height:250}">修改 </a>
					<a href="${base}/admin/sysRole/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="sysRole-delete" data-confirm-msg="确定要删除吗？">删除</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
