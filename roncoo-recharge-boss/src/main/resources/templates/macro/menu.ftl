<!-- 角色设置菜单功能，递归显示 -->
<#macro menuListForRole children>
    <#if children?? && children?size gt 0>
        <#list children as bean>
            <li data-id="${bean.id}" data-pid="${bean.parentId}" <#if bean.isShow == 1>data-checked="true"</#if>>${bean.menuName}</li>
            <@menuListForRole children=bean.list/>
        </#list>
    </#if>
</#macro>
