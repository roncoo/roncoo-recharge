<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/accountInfo/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>账号：</label>
			<input type="text" name="number" value="" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>商户名称</th>
				<th>总收益</th>
				<th>总支出</th>
				<th>今日收益</th>
				<th>今日支出</th>
				<th>可用账户余额</th>
				<th>不可用账户余额</th>
				<th>保证金</th>
				<th>结算金额</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.mchInfoName}</td>
				<td>${bean.totalIncome}</td>
				<td>${bean.totalExpend}</td>
				<td>${bean.todayIncome}</td>
				<td>${bean.todayExpend}</td>
				<td>${bean.enableBalance}</td>
				<td>${bean.unableBalance}</td>
				<td>${bean.securityMoney}</td>
				<td>${bean.settleAmount}</td>
				<td>${bean.statusId}</td>
				<td>
					<a href="${base}/admin/accountInfo/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="accountInfo-view" data-options="{title:'查看', height:350}">查看 </a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
