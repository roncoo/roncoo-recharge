<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/sysOrganization/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>组织名称：</label>
			<input type="text" name="organizationName" value="${bean.organizationName!}" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/sysOrganization/add?parentId=0&organizationType=0" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="sysOrganization-add" data-options="{title:'添加', height:200}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>组织名称</th>
				<th>组织类型</th>
				<th>状态</th>
				<th>备注</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.organizationName}</td>
				<td><#list organizationTypeEnums as organizationType><#if bean.organizationType == organizationType.code>${organizationType.desc}</#if></#list></td>
				<td><#list statusIdEnums as statusId><#if bean.statusId == statusId.code>${statusId.desc}</#if></#list></td>
				<td>${bean.remark!}</td>
				<td>
					<a href="${base}/admin/sysOrganization/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="sysOrganization-view" data-options="{title:'查看', height:200}">查看 </a>
					<a href="${base}/admin/sysOrganization/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="sysOrganization-edit" data-options="{title:'修改', height:300}">修改 </a>
					<a href="${base}/admin/sysOrganization/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="sysOrganization-delete" data-confirm-msg="确定要删除吗？">删除</a>
					<a href="${base}/admin/sysOrganization/add?parentId=${bean.id}&organizationType=${bean.organizationType}" class="btn btn-default" data-toggle="dialog" data-id="sysOrganization-add" data-options="{title:'添加', height:200}">添加 </a>
				</td>
				<#if bean.list??>
				<#list bean.list as be>
		        <tr>
		            <td align="center"></td>
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--&nbsp;${be.organizationName}</td>
                    <td><#list organizationTypeEnums as organizationType><#if be.organizationType == organizationType.code>${organizationType.desc}</#if></#list></td>
                    <td><#list statusIdEnums as statusId><#if be.statusId == statusId.code>${statusId.desc}</#if></#list></td>
                    <td>${be.remark!}</td>
                    <td>
                        <a href="${base}/admin/sysOrganization/view?id=${be.id}" class="btn btn-blue" data-toggle="dialog" data-id="sysOrganization-view" data-options="{title:'查看', height:200}">查看 </a>
                        <a href="${base}/admin/sysOrganization/edit?id=${be.id}" class="btn btn-green" data-toggle="dialog" data-id="sysOrganization-edit" data-options="{title:'修改', height:300}">修改 </a>
                        <a href="${base}/admin/sysOrganization/delete?id=${be.id}" class="btn btn-red" data-toggle="doajax" data-id="sysOrganization-delete" data-confirm-msg="确定要删除吗？">删除</a>
                        <a href="${base}/admin/sysOrganization/add?parentId=${be.id}&organizationType=${be.organizationType}" class="btn btn-default" data-toggle="dialog" data-id="sysOrganization-add" data-options="{title:'添加', height:200}">添加 </a>
                    </td>
                    <#if be.list??>
                    <#list be.list as b>
                    <tr>
                        <td align="center"></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--&nbsp;${b.organizationName}</td>
                        <td><#list organizationTypeEnums as organizationType><#if b.organizationType == organizationType.code>${organizationType.desc}</#if></#list></td>
                        <td><#list statusIdEnums as statusId><#if b.statusId == statusId.code>${statusId.desc}</#if></#list></td>
                        <td>${b.remark!}</td>
                        <td>
                            <a href="${base}/admin/sysOrganization/view?id=${b.id}" class="btn btn-blue" data-toggle="dialog" data-id="sysOrganization-view" data-options="{title:'查看', height:200}">查看 </a>
                            <a href="${base}/admin/sysOrganization/edit?id=${b.id}" class="btn btn-green" data-toggle="dialog" data-id="sysOrganization-edit" data-options="{title:'修改', height:300}">修改 </a>
                            <a href="${base}/admin/sysOrganization/delete?id=${b.id}" class="btn btn-red" data-toggle="doajax" data-id="sysOrganization-delete" data-confirm-msg="确定要删除吗？">删除</a>
                        </td>
                     </tr>
                     </#list>
                     </#if>
                 </tr>
				</#list>
				</#if>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
