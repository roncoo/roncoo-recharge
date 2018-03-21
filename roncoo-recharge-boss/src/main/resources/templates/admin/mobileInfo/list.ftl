<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/mobileInfo/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>账号：</label>
			<input type="text" name="number" value="" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/mobileInfo/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="mobileInfo-add" data-options="{title:'添加', height:500}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>号码片段</th>
				<th>省份代码</th>
				<th>省份</th>
				<th>市代码</th>
				<th>市</th>
				<th>区号</th>
				<th>运营商名称</th>
				<th>运营商类型</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.mobilePrefix!}</td>
				<td>${bean.provinceCode!}</td>
				<td>${bean.provinceName!}</td>
				<td>${bean.cityCode!}</td>
				<td>${bean.cityName!}</td>
				<td>${bean.areaCode!}</td>
				<td>${bean.carrierName!}</td>
				<td>${bean.carrierType!}</td>
				<td>
					<a href="${base}/admin/mobileInfo/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="mobileInfo-view" data-options="{title:'查看', height:500}">查看 </a>
					<a href="${base}/admin/mobileInfo/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="mobileInfo-edit" data-options="{title:'修改', height:500}">修改 </a>
					<a href="${base}/admin/mobileInfo/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="mobileInfo-delete" data-confirm-msg="确定要删除吗？">删除</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
