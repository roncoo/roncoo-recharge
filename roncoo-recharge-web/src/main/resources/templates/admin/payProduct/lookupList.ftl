<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/payProduct/lookupList?mchInfoId=${mchInfoId}&statusId=1" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label class="control-label">支付产品名称：</label>
            <input type="text" name="productName" value="${bean.productName!}" class="form-control" size="10">&nbsp;
            
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
			<a href="${base}/admin/payProduct/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="payProduct-add" data-options="{title:'添加', height:500}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>产品名称</th>
				<th>产品类型</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.productName}</td>
				<td>
				<#list productTypeEnums as productType>
                    <#if bean.productType == productType.code>${productType.desc}</#if>
                </#list>
                </td>
				<td>
				<#list statusIdEnums as statusId>
                    <#if bean.statusId == statusId.code>${statusId.desc}</#if>
                </#list>
                </td>
				<td>
                    <a href="javascript:;" class="btn btn-blue" data-toggle="lookupback" data-args="{payProductName:'${bean.productName}', payProductId:'${bean.id}', payProductType:'${bean.productType}'}" data-icon="check" title="选择本项">选择</a>
                </td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
