<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
    <form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/supplyInfo/lookupUser" method="post">
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
                <th>Bean</th>
                <th>名称</th>
                <th>公司名</th>
                <th>状态</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
            <#if page??>
            <#list page.list as bean>
            <tr>
                <td align="center">${bean_index+1}</td>
                <td>${bean.supplyCode!}</td>
                <td>${bean.supplyName!}</td>
                <td>${bean.compayName!}</td>
                <td><#list statusIdEnums as enumvo><#if bean.statusId?? && enumvo.code==bean.statusId>${enumvo.desc}</#if></#list></td>
                <td>
                    <a href="javascript:;" data-toggle="lookupback" data-args="{supplyInfoId:'${bean.id!}', supplyCode:'${bean.supplyCode!}', supplyName:'${bean.supplyName!}'}" class="btn btn-blue" title="选择本项" data-icon="check">选择</a>
                </td>
            </tr>
            </#list>
            </#if>
        </tbody>
    </table>
</div>
<@pageFooter />
