<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/payChannel/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>账号：</label>
			<input type="text" name="number" value="" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/payChannel/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="payChannel-add" data-options="{title:'添加', height:250}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>渠道名称</th>
				<th>渠道标识</th>
				<th>渠道类型</th>
				<th>渠道参数（json格式）</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.channelName}</td>
				<td>${bean.channel}</td>
				<td>
				<#list channelTypeEnums as channelType>
                    <#if bean.channelType == channelType.code>${channelType.desc}</#if>
                </#list>
				</td>
				<td>${bean.channelParam}</td>
				<td>
				<#list statusIdEnums as statusId>
                    <#if bean.statusId == statusId.code>${statusId.desc}</#if>
                </#list>
                </td>
				<td>
					<a href="${base}/admin/payChannel/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="payChannel-view" data-options="{title:'查看', height:200}">查看 </a>
					<a href="${base}/admin/payChannel/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="payChannel-edit" data-options="{title:'修改', height:300}">修改 </a>
					<a href="${base}/admin/payChannel/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="payChannel-delete" data-confirm-msg="确定要删除吗？">删除</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
