<!-- 菜单递归显示 -->
<#macro listMenu children label>
	<#if children??>
		<#list children as bean>
			<tr>
			    <td align="center"></td>
                <td>${label} ${bean.menuName}</td>
                <td>${bean.menuUrl}</td>
                <td>${bean.targetName}</td>
                <td>${bean.menuIcon}</td>
                <td>${bean.sort}</td>
                <td>
                <#list statusIdEnums as statusId>
                    <#if bean.statusId == statusId.code>${statusId.desc}</#if>
                </#list>
                </td>
                <td>
                    <a href="${base}/admin/sysMenu/view?id=${bean.id}" class="btn btn-blue" data-toggle="dialog" data-id="sysMenu-view" data-options="{title:'查看', height:350}">查看 </a>
                    <a href="${base}/admin/sysMenu/edit?id=${bean.id}" class="btn btn-green" data-toggle="dialog" data-id="sysMenu-edit" data-options="{title:'修改', height:350}">修改 </a>
                    <a href="${base}/admin/sysMenu/delete?id=${bean.id}" class="btn btn-red" data-toggle="doajax" data-id="sysMenu-delete" data-confirm-msg="确定要删除吗？">删除</a>
                    <a href="${base}/admin/sysMenu/add?parentId=${bean.id}" class="btn btn-default" data-toggle="dialog" data-id="sysMenu-add" data-options="{title:'添加', height:350}">添加 </a>
                </td>
			</tr>
			<@listMenu children=bean.list label="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+label/>
		</#list>
	</#if>
</#macro>

<!-- 菜单递归显示 -->
<#macro menuListForRole children>
    <#if children?? && children?size gt 0>
        <#list children as bean>
            <li data-id="${bean.id}" data-pid="${bean.parentId}" <#if bean.isShow == 1>data-checked="true"</#if>>${bean.menuName}</li>
            <@menuListForRole children=bean.list/>
        </#list>
    </#if>
</#macro>
