<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/orderTrade/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>平台交易号：</label>
            <input type="text" name="tradeNo" value="${bean.tradeNo!}" class="form-control" size="12">&nbsp;
            <label>商户订单号：</label>
            <input type="text" name="orderNo" value="${bean.orderNo!}" class="form-control" size="12">&nbsp;
			
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
				<th>交易订单</th>
                <th>商户订单号</th>
                <th>商品类别</th>
                <th>商品类型</th>
				<th>运营商类型</th>
				<th>商品面值</th>
				<th>销售价格</th>
				<th>状态</th>
				<th>商品编号</th>
				<th>商品名称</th>
				<th>供货摘要</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>
				    <a href="${base}/admin/orderSupply/list?orderTradeNo=${bean.tradeNo}" data-toggle="dialog" data-width="1200" data-height="500">${bean.tradeNo}</a>
				</td>
				<td>
				    <a href="${base}/admin/orderTrade/view?id=${bean.id}" data-toggle="dialog" data-id="orderTrade-view" data-options="{title:'查看', height:600, width:600}">${bean.orderNo}</a>
				</td>
				<td><#list itemCategoryEnums as enumvo><#if bean.itemCategory?? && bean.itemCategory==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td><#list itemTypeEnums as enumvo><#if bean.itemType?? && bean.itemType==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td><#list carrierTypeEnums as enumvo><#if bean.carrierType?? && bean.carrierType==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td>${bean.facePrice!}</td>
				<td>${bean.salesPrice/1000!}元</td>
                <td><#list orderStatusEnums as enumvo><#if bean.orderStatus?? && bean.orderStatus==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td>${bean.itemNo!}</td>
				<td>${bean.itemName!}</td>
                <td>${bean.supplyDesc!''}</td>
				<td>
				    <a href="${base}/admin/orderSupply/check?supplySerialNo=${bean.supplySerialNo!}&itemCategory=${bean.itemCategory!}" class="btn btn-green" data-toggle="doajax" data-id="orderSupply-check" data-confirm-msg="确定要核单吗？">核单</a>
					<a href="${base}/admin/orderTrade/notify?tradeNo=${bean.tradeNo}&itemCategory=${bean.itemCategory}" class="btn btn-blue" data-toggle="doajax" data-id="supplyInfo-delete" data-confirm-msg="确定要补通知吗？">补通知</a>
					<a href="${base}/admin/orderTrade/repair?tradeNo=${bean.tradeNo}&itemCategory=${bean.itemCategory}" class="btn btn-red" data-toggle="doajax" data-id="supplyInfo-delete" data-confirm-msg="确定要补单吗？">补单</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
