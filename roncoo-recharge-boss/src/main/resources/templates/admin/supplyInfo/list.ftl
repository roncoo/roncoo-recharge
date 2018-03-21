<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/supplyInfo/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>账号：</label>
			<input type="text" name="number" value="" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/supplyInfo/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="supplyInfo-add" data-options="{title:'添加', height:500,width:900}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>上游编码</th>
				<th>类别</th>
				<th>名称</th>
				<th>公司名</th>
				<th>参数【URl】</th>
				<th>参数【用户ID】</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td><a href="${base}/admin/supplyInfo/view?id=${bean.id}" data-toggle="dialog" data-id="supplyInfo-view" data-options="{title:'查看', height:500}">${bean.supplyCode!}</a></td>
				<td><#list supplyCategoryEnums as enumvo><#if bean.supplyCategory?? && bean.supplyCategory==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td>${bean.supplyName!}</td>
				<td>${bean.compayName!}</td>
				<td>
				    请求URL: <a target="_blank" href="${bean.paraRequestUrl!}">${bean.paraRequestUrl!}</a>
				    <div class="line"></div>
				    查询URL: <a target="_blank" href="${bean.paraOrderUrl!}">${bean.paraOrderUrl!}</a>
				    <div class="line"></div>
				    余额URL: <a target="_blank" href="${bean.paraBalanceUrl!}">${bean.paraBalanceUrl!}</a>
				</td>
				<td>${bean.paraUserId!}</td>
				<td><#list statusIdEnums as enumvo><#if bean.statusId?? && bean.statusId==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td>
					<a href="${base}/admin/supplyInfo/balance?supplyCode=${bean.supplyCode}" class="btn btn-blue" data-toggle="doajax" data-id="supplyInfo-balance" data-confirm-msg="确定要查询吗？">余额查询</a>
					<a href="${base}/admin/supplyInfo/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="supplyInfo-edit" data-options="{title:'修改', height:500,width:900}">修改 </a>
					<a href="${base}/admin/supplyInfo/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="supplyInfo-delete" data-confirm-msg="确定要删除吗？">删除</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
