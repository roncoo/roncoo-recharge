<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/acctLog/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>账号：</label>
			<input type="text" name="number" value="" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/acctLog/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="acctLog-add" data-options="{title:'添加', height:500}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th></th>
				<th></th>
				<th>用户ID</th>
				<th>账户ID</th>
				<th>交易单类型 1支付单 2充值单 3退款单 4提现单</th>
				<th>账单状态：1 成功 2 异常</th>
				<th>交易类型：1 入账 2 出账</th>
				<th>支付交易订单号</th>
				<th>余额</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.gmtCreate!}</td>
				<td>${bean.gmtModified!}</td>
				<td>${bean.userInfoId!}</td>
				<td>${bean.acctInfoId!}</td>
				<td>${bean.billType!}</td>
				<td>${bean.billStatus!}</td>
				<td>${bean.tradeType!}</td>
				<td>${bean.paySerialNo!}</td>
				<td>${bean.totalBalance!}</td>
				<td>
					<a href="${base}/admin/acctLog/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="acctLog-view" data-options="{title:'查看', height:500}">查看 </a>
					<a href="${base}/admin/acctLog/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="acctLog-edit" data-options="{title:'修改', height:500}">修改 </a>
					<a href="${base}/admin/acctLog/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="acctLog-delete" data-confirm-msg="确定要删除吗？">删除</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
