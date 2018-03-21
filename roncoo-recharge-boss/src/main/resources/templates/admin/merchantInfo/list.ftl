<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
	<form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/merchantInfo/list" method="post">
		<@pageHeadr />
		<div class="bjui-searchBar">
			<label>账号：</label>
			<input type="text" name="number" value="" class="form-control" size="10">&nbsp;
			
			<button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
			<a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
			
			<br />
			<br />
			<a href="${base}/admin/merchantInfo/add" class="btn btn-default" data-toggle="dialog" data-icon="plus" data-id="merchantInfo-add" data-options="{title:'添加', height:500}">添加 </a>
		</div>
	</form>
</div>
<div class="bjui-pageContent tableContent">
	<table class="table table-bordered table-hover table-top" data-toggle="tablefixed" data-selected-multi="true">
		<thead>
			<tr>
				<th width="30">序号</th>
				<th>APPID</th>
				<th>价格级别</th>
				<th>昵称</th>
				<th>公司全称</th>
				<th>充值限制</th>
				<th>余额阈值</th>
				<th>保证金</th>
				<th>接口校验类型</th>
				<th>提现校验类型</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<#if page??>
			<#list page.list as bean>
			<tr>
				<td align="center">${bean_index+1}</td>
				<td>${bean.appId!}</td>
				<td><#list priceLevelEnums as enumvo><#if bean.priceLevel?? && bean.priceLevel==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td>${bean.nickName!}</td>
				<td>${bean.compayName!}</td>
				<td>${bean.chargingLimit!}</td>
				<td>${bean.warningBalance!}</td>
				<td>${bean.depositBalance!}</td>
				<td><#list apiVerifyTypeEnums as enumvo><#if bean.apiVerifyType?? && bean.apiVerifyType==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td><#list txVerifyTypeEnums as enumvo><#if bean.txVerifyType?? && bean.txVerifyType==enumvo.code>${enumvo.desc}</#if></#list></td>
				<td><#list statusIdEnums as enumvo><#if bean.statusId?? && bean.statusId==enumvo.code>${enumvo.desc}</#if></#list></td>
                <td>
					<a href="${base}/admin/merchantInfo/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="merchantInfo-view" data-options="{title:'查看', height:500}">查看 </a>
					<a href="${base}/admin/merchantInfo/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="merchantInfo-edit" data-options="{title:'修改', height:500}">修改 </a>
					<a href="${base}/admin/merchantInfo/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="merchantInfo-delete" data-confirm-msg="确定要删除吗？">删除</a>
				</td>
			</tr>
			</#list>
			</#if>
		</tbody>
	</table>
</div>
<@pageFooter />
