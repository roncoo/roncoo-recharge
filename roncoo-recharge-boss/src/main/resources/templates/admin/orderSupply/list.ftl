<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/orderSupply/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>供货流水号：</label>
            <input type="text" name="supplySerialNo" value="${bean.supplySerialNo!}" class="form-control" size="12" />&nbsp;
			<label>平台交易号：</label>
            <input type="text" name="orderTradeNo" value="${bean.orderTradeNo!}" class="form-control" size="12" />&nbsp;
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
				<th>供货流水号</th>
				<th>平台交易号</th>
				<th>商户名称</th>
				<th>商品面值</th>
				<th>实际价</th>
				<th>状态</th>
				<th>供货信息</th>
				<th>商品编号</th>
				<th>商品名称</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>
				  <a href="${base}/admin/orderSupply/view?id=${bean.id}" data-toggle="dialog" data-id="orderTrade-view" data-options="{title:'查看', height:500, width:600}">${bean.supplySerialNo}</a>
                </td>
				<td>${bean.orderTradeNo!}</td>
				<td>${bean.supplyName!}</td>
				<td>${bean.supplyFacePrice!}</td>
				<td>${bean.supplyActualCost/1000!}元</td>
				<td><#list orderStatusEnums as enumvo><#if bean.orderStatus?? && bean.orderStatus==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td>${bean.supplyDesc!}</td>
				<td>${bean.itemNo!}</td>
				<td>${bean.itemName!}</td>
				<td>
					<a href="${base}/admin/orderSupply/check?supplySerialNo=${bean.supplySerialNo}&itemCategory=${bean.itemCategory!}" class="btn btn-green" data-toggle="doajax" data-id="orderSupply-check" data-confirm-msg="确定要核单吗？">核单</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
