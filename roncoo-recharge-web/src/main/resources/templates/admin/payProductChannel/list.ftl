<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/payProductChannel/list?payProductId=${bean.payProductId}&payProductName=${bean.payProductName}&payProductType=${bean.payProductType}" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>支付渠道名称：</label>
			<input type="text" name="payChannelName" value="${bean.payChannelName!}" class="form-control" size="10">&nbsp;
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/payProductChannel/add?payProductId=${bean.payProductId}&payProductName=${bean.payProductName}&payProductType=${bean.payProductType}" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="payProductChannel-add" data-options="{title:'添加', height:200}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>支付渠道名称</th>
				<th>支付渠道</th>
				<th>支付渠道类型</th>
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
				<td>${bean.payChannelName}</td>
				<td>${bean.payChannel}</td>
				<td>
				<#list channelTypeEnums as channelType>
                    <#if bean.payChannelType == channelType.code>${channelType.desc}</#if>
                </#list>
                </td>
				<td>${bean.sort}</td>
				<td>
				<#list statusIdEnums as statusId>
                    <#if bean.statusId == statusId.code>${statusId.desc}</#if>
                </#list>
                </td>
				<td>
					<!--a href="${base}/admin/payProductChannel/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="payProductChannel-view" data-options="{title:'查看', height:500}">查看 </a-->
					<a href="${base}/admin/payProductChannel/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="payProductChannel-edit" data-options="{title:'修改', height:200}">修改 </a>
					<a href="${base}/admin/payProductChannel/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="payProductChannel-delete" data-confirm-msg="确定要删除吗？">删除</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
