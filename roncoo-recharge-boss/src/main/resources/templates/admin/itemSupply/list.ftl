<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/itemSupply/list" method="post">
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
				<th>商品名称</th>
				<th>面值</th>
				<th>供货价</th>
				<th>供应商</th>
				<th>上游商品编号</th>
				<th>供货优先级</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.itemName!}</td>
				<td>${bean.facePrice!}</td>
				<td>${bean.costPrice/1000!}元</td>
				<td>${bean.supplyName!}</td>
				<td>${bean.supplyProductCode!}</td>
				<td>${bean.priority!}</td>
				<td><#list itemStatusEnums as enumvo><#if bean.itemStatus?? && bean.itemStatus==enumvo.code><b>${enumvo.desc}</b></#if></#list></td>
                <td>
					<a href="${base}/admin/itemSupply/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="itemSupply-edit" data-options="{title:'修改', height:300}">修改 </a>
					<a href="${base}/admin/itemSupply/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="itemSupply-delete" data-confirm-msg="确定要删除吗？">删除</a>
					
					<#if bean.itemStatus == 1 || bean.itemStatus == 3>
					<a href="${base}/admin/itemSupply/status?id=${bean.id}&itemStatus=2" class="btn btn-blue" data-toggle="doajax" data-id="itemSupply-update" data-confirm-msg="确定要上架吗？">上架</a>
					</#if>
				    <#if bean.itemStatus == 2>
					<a href="${base}/admin/itemSupply/status?id=${bean.id}&itemStatus=3" class="btn btn-blue" data-toggle="doajax" data-id="itemSupply-update" data-confirm-msg="确定要下架吗？">下架</a>
                    </#if>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
