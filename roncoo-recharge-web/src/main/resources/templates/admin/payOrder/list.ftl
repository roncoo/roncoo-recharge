<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/payOrder/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>支付订单号：</label>
			<input type="text" name="payOrderNo" value="${bean.payOrderNo!}" class="form-control" size="20">&nbsp;
			
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
				<th>支付订单号</th>
				<th>支付订单流水号</th>
				<th>订单状态</th>
				<th>订单号</th>
				<th>订单价格</th>
				<th>订单商品</th>
				<th>订单IP</th>
				<th>订单时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.mchInfoName}</td>
				<td>${bean.payOrderNo}</td>
				<td>${bean.payOrderSerialNo}</td>
				<td>
				<#list orderStatusEnums as orderStatus>
                    <#if bean.orderStatus == orderStatus.code>${orderStatus.desc}</#if>
                </#list>
				</td>
				<td>${bean.orderNo}</td>
				<td>${bean.orderPrice}</td>
				<td>${bean.orderProduct}</td>
				<td>${bean.orderIp}</td>
				<td>${bean.orderTime}</td>
				<td>
					<a href="${base}/admin/payOrder/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="payOrder-view" data-options="{title:'查看', height:500}">查看 </a>
					<!--
					<a href="${base}/admin/payOrder/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="payOrder-edit" data-options="{title:'修改', height:500}">修改 </a>
					<a href="${base}/admin/payOrder/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="payOrder-delete" data-confirm-msg="确定要删除吗？">删除</a>
				    -->
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
