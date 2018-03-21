<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/mchInfoProduct/list?mchInfoId=${bean.mchInfoId}" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label class="control-label">支付产品名称：</label>
			<input type="text" name="payProductName" value="${bean.payProductName!}" class="form-control" size="10">&nbsp;
			
			<label class="control-label">支付产品类型：</label>
            <select name="payProductType" data-toggle="selectpicker" data-width="100">
                <option value="">全部</option>
                <#list productTypeEnums as productType>
                <option value="${productType.code}" <#if bean.payProductType?? && bean.payProductType == productType.code>selected="selected"</#if>>${productType.desc}</option>
                </#list>
            </select>
            
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/mchInfoProduct/add?mchInfoId=${bean.mchInfoId}" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="mchInfoProduct-add" data-options="{title:'添加', height:200}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>支付产品名称</th>
				<th>支付产品类型</th>
				<th>排序</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.payProductName}</td>
				<td>
				<#list productTypeEnums as productType>
                    <#if bean.payProductType == productType.code>${productType.desc}</#if>
                </#list>
				</td>
				<td>${bean.sort}</td>
				<td>
				<#list statusIdEnums as statusId>
                    <#if bean.statusId == statusId.code>${statusId.desc}</#if>
                </#list>
                </td>
				<td>
					<!-- a href="${base}/admin/mchInfoProduct/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="mchInfoProduct-view" data-options="{title:'查看', height:200}">查看 </a -->
					<a href="${base}/admin/mchInfoProduct/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="mchInfoProduct-edit" data-options="{title:'修改', height:200}">修改 </a>
					<a href="${base}/admin/mchInfoProduct/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="mchInfoProduct-delete" data-confirm-msg="确定要删除吗？">删除</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
