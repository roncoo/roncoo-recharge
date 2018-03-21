<#include "/macro/base.ftl" />
<#include "/macro/menu.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/sysMenu/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>账号：</label>
			<input type="text" name="number" value="" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/sysMenu/add?parentId=0" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="sysMenu-add" data-options="{title:'添加', height:350}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>菜单名称</th>
				<th>菜单路径</th>
				<th>目标名称</th>
				<th>菜单图标</th>
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
				<td>${bean.menuName}</td>
				<td>${bean.menuUrl}</td>
				<td>${bean.targetName}</td>
				<td>${bean.menuIcon}</td>
				<td>${bean.sort}</td>
				<td>
				<#list statusIdEnums as statusId>
                    <#if bean.statusId == statusId.code>${statusId.desc}</#if>
                </#list>
                </td>
				<td>
				    <@shiro.hasPermission name="/admin/sysMenu/view">
					<a href="${base}/admin/sysMenu/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="sysMenu-view" data-options="{title:'查看', height:350}">查看 </a>
					</@shiro.hasPermission>
					<a href="${base}/admin/sysMenu/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="sysMenu-edit" data-options="{title:'修改', height:350}">修改 </a>
					<a href="${base}/admin/sysMenu/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="sysMenu-delete" data-confirm-msg="确定要删除吗？">删除</a>
					<a href="${base}/admin/sysMenu/add?parentId=${bean.id}" class="btn btn-default" data-toggle="dialog" data-id="sysMenu-add" data-options="{title:'添加', height:350}">添加 </a>
				</td>
			</tr>
			
			<#if bean.list?? && bean.list?size gt 0>
            <@listMenu children=bean.list label="&nbsp;&nbsp;|--"/>
            </#if>
            
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
