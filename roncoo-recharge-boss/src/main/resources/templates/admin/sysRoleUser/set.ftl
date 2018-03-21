<#include "/macro/base.ftl" />
<div class="bjui-pageHeader">
        <form id="pagerForm" data-toggle="ajaxsearch" action="${base}/admin/sysRoleUser/set?userInfoId=${bean.userInfoId}" method="post">
        <div class="bjui-searchBar">
            <label>角色：</label>
            <input type="text" name="roleName" value="" class="form-control" size="10">&nbsp;
            
            <button type="submit" class="btn-default" data-icon="search">查询</button>&nbsp;
            <a class="btn btn-orange" href="javascript:;" data-toggle="reloadsearch" data-clear-query="true" data-icon="undo">清空查询</a>
            
            <div class="pull-right">
                <input type="checkbox" class="checkboxCtrl" data-group="ids" data-toggle="icheck" data-label="全选">
                <a href="${base}/admin/sysRoleUser/save?userInfoId=${bean.userInfoId}" class="btn btn-orange" data-toggle="doajaxchecked" data-confirm-msg="确定要添加选中的角色？" data-idname="ids" data-group="ids">设置角色</a>
            </div>
        </div>
    </form>
</div>
<br />
<div class="bjui-pageContent tableContent">
    <table class="table table-bordered table-hover table-striped table-top" data-toggle="tablefixed" data-selected-multi="true">
        <thead>
            <tr>
                <th>序号</th>
                <th>所属平台</th>
                <th>角色名称</th>
                <th>状态</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
            <#if roleList??>
            <#list roleList as bean>
            <tr>
                <td align="center">${bean_index+1}</td>
                <td><#list sysPlatformList as sysPlatform><#if bean.platformId?? && sysPlatform.id == bean.platformId>${sysPlatform.platformName}</#if></#list></td>
                <td>${bean.roleName!}</td>
                <td><#list statusIdEnums as enumvo><#if bean.statusId?? && bean.statusId==enumvo.code>${enumvo.desc}</#if></#list></td>
                <td>
                    <input type="checkbox" name="ids" data-toggle="icheck" value="${bean.id}" <#if bean.isShow == 1>checked="checked"</#if>>
                </td>
            </tr>
            </#list>
            </#if>
        </tbody>
    </table>
</div>

