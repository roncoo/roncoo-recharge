<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/payChannel/lookupList?channelType=${bean.channelType}&payProductId=${payProductId}" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>支付渠道名称：</label>
            <input type="text" name="channelName" value="${bean.channelName!}" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/payChannel/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="payChannel-add" data-options="{title:'添加', height:300}">添加 </a>
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
                    <a href="javascript:;" class="btn btn-blue" data-toggle="lookupback" data-args="{payChannel:'${bean.channel}', payChannelId:'${bean.id}', payChannelType:'${bean.channelType}', payChannelName:'${bean.channelName}'}" data-icon="check" title="选择本项">选择</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
