<!-- 应用上下文 -->
<#assign base=request.contextPath /> 

<#macro navbar menuList>
<ul id="bjui-hnav-navbar">
    <#list menuList as menu>
     <li <#if menu_index+1 == 1> class="active" </#if>>
        <a href="javascript:;" data-toggle="slidebar">
            <i class="fa fa-table"></i> ${menu.menuName}
        </a>
        <div class="items hide" data-noinit="true">
            <ul id="bjui-hnav-tree${menu_index+1}" class="ztree ztree_main" data-toggle="ztree" data-on-click="MainMenuClick" data-expand-all="true" data-faicon="table">
                <#list menu.list as me>
                    <li data-id="ss${me.id}" data-pid="ss${me.parentId}" data-faicon="folder-open-o" data-faicon-close="folder-o">${me.menuName}</li>
                    <#list me.list as m>
                        <li data-id="ss${m.id}" data-pid="ss${m.parentId}" data-url="${base}${m.menuUrl}" data-tabid="${m.targetName}" data-faicon="list-alt">${m.menuName}</li>
                    </#list>
                </#list>
            </ul>
        </div>
    </li>
    </#list>
    
    <!-- <li>
        <a href="javascript:;" data-toggle="slidebar">
            <i class="fa fa-cog"></i> 系统管理
        </a>
        <div class="items hide" data-noinit="true">
            <ul id="bjui-hnav-tree2" class="ztree ztree_main" data-toggle="ztree" data-on-click="MainMenuClick" data-expand-all="true" data-faicon="table">
                <li data-id="5" data-pid="0" data-faicon="folder-open-o" data-faicon-close="folder-o">权限管理</li>
                <li data-id="50" data-pid="5" data-url="${base}/sys/user/list" data-tabid="sys-user-list" data-faicon="list-alt">后台用户</li>
                <li data-id="51" data-pid="5" data-url="${base}/sys/role/list" data-tabid="sys-role-list" data-faicon="list-alt">角色管理</li>
                <li data-id="52" data-pid="5" data-url="${base}/sys/menu/list" data-tabid="sys-menu-list" data-faicon="list-alt">菜单管理</li>
                
                <li data-id="555" data-pid="0" data-faicon="folder-open-o" data-faicon-close="folder-o">组织管理</li>
                <li data-id="5551" data-pid="555" data-url="${base}/sys/organization/list" data-tabid="sys-organization-list" data-faicon="list-alt">组织列表</li>
                
                <li data-id="553" data-pid="0" data-faicon="folder-open-o" data-faicon-close="folder-o">行业管理</li>
                <li data-id="5531" data-pid="553" data-url="${base}/sys/trade/list" data-tabid="sys-trade-list" data-faicon="list-alt">行业列表</li>
                
                <li data-id="554" data-pid="0" data-faicon="folder-open-o" data-faicon-close="folder-o">通知管理</li>
                <li data-id="5541" data-pid="554" data-url="${base}/sys/notify/config/list" data-tabid="sys-notify-config-list" data-faicon="list-alt">业务通知配置</li>
                <li data-id="5541" data-pid="554" data-url="${base}/sys/notify/log/list" data-tabid="sys-notify-log-list" data-faicon="list-alt">业务通知记录</li>
                
                <li data-id="5555" data-pid="0" data-faicon="folder-open-o" data-faicon-close="folder-o">日志信息</li>
                <li data-id="55551" data-pid="5555" data-url="${base}/sys/operation/log/list" data-tabid="sys-operation-log-list" data-faicon="list-alt">操作日志列表</li>
                <li data-id="55552" data-pid="5555" data-url="${base}/sys/log/list" data-tabid="sys-log-list" data-faicon="list-alt">平台日志列表</li>
            </ul>
        </div>
    </li> -->
</ul>
</#macro>
