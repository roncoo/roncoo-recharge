<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/item/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>商品编号：</label>
			<input type="text" name="itemNo" value="${bean.itemNo!}" class="form-control" size="12">&nbsp;
			<label>商品名称：</label>
            <input type="text" name="itemName" value="${bean.itemName!}" class="form-control" size="12">&nbsp;
            
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			<br />
			<br />
			<a href="${base}/admin/item/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="item-add" data-options="{title:'添加', height:500}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>商品编号</th>
				<th>商品名称</th>
				<th>销售地区</th>
				<th>运营商</th>
				<th>商品类别</th>
				<th>商品类型</th>
				<th>面值</th>
				<th>成本价格</th>
				<th>销售价格</th>
				<th>使用范围</th>
				<th>通道类型</th>
				<th>包体类型</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.itemNo!}</td>
				<td>${bean.itemName!}</td>
				<td><#list salesAreaList as salesArea><#if bean.salesArea?? && bean.salesArea ==salesArea.provinceCode>${salesArea.provinceName}</#if></#list></td>
				<td><#list carrierTypeEnums as enumvo><#if bean.carrierType?? && bean.carrierType==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td><#list itemCategoryEnums as enumvo><#if bean.itemCategory?? && bean.itemCategory==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td><#list itemTypeEnums as enumvo><#if bean.itemType?? && bean.itemType==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td>${bean.facePrice!}</td>
				<td>${bean.costPrice/1000!} 元</td>
				<td>
                                                        价格1: ${bean.salesPrice1/1000!} 元
                    <div class="line"></div>
                                                        价格2: ${bean.salesPrice2/1000!} 元
                    <div class="line"></div>
                                                        价格3: ${bean.salesPrice3/1000!} 元
                </td>
				<td><#list flowScopeEnums as enumvo><#if bean.flowScope?? && bean.flowScope==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td><#list flowStreamTypeEnums as enumvo><#if bean.flowStreamType?? && bean.flowStreamType==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td><#list flowPackageTypeEnums as enumvo><#if bean.flowPackageType?? && bean.flowPackageType==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td><#list itemStatusEnums as enumvo><#if bean.itemStatus?? && bean.itemStatus==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td>
					<a href="${base}/admin/item/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="item-edit" data-options="{title:'修改', height:300}">修改 </a>
					<a href="${base}/admin/item/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="item-delete" data-confirm-msg="确定要删除吗？">删除</a>
					<div class="line"></div>
					<a href="${base}/admin/itemSupply/relevance?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="item-edit" data-options="{title:'关联供货商', height:500}">关联 </a>
					<a href="${base}/admin/itemSupply/list?itemId=${bean.id}" class="btn btn-green" data-toggle="navtab" data-id="admin-itemSupply">供货商商品 </a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
