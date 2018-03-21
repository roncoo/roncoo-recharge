<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/orderTradePay/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>账号：</label>
			<input type="text" name="number" value="" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/orderTradePay/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="orderTradePay-add" data-options="{title:'添加', height:500}">添加 </a>
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
				<th>1创建 2支付成功 3支付失败 9异常</th>
				<th>交易订单ID</th>
				<th>平台交易号</th>
				<th>用户ID</th>
				<th>账户ID</th>
				<th>账户日志ID</th>
				<th>商品ID</th>
				<th>商品编号</th>
				<th>销售价</th>
				<th>支付类型：1余额</th>
				<th>交易类型：1 入账 2 出账</th>
				<th>错误信息</th>
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
				<td>${bean.payStatus!}</td>
				<td>${bean.paySerialNo!}</td>
				<td>${bean.orderTradeNo!}</td>
				<td>${bean.userInfoId!}</td>
				<td>${bean.acctInfoId!}</td>
				<td>${bean.acctLogId!}</td>
				<td>${bean.itemId!}</td>
				<td>${bean.itemNo!}</td>
				<td>${bean.salesPrice!}</td>
				<td>${bean.payType!}</td>
				<td>${bean.tradeType!}</td>
				<td>${bean.errorMsg!}</td>
				<td>
					<a href="${base}/admin/orderTradePay/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="orderTradePay-view" data-options="{title:'查看', height:500}">查看 </a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
