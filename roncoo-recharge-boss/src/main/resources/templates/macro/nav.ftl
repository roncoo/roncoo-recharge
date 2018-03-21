<#macro navbar>
<ul id="bjui-hnav-navbar">

    <#list menuList as menu>
     <li <#if menu_index+1 ==1> class="active" </#if>>
        <a href="javascript:;" data-toggle="slidebar">
            <i class="fa fa-table"></i> ${menu.menuName}
        </a>
        <div class="items hide" data-noinit="true">
            <ul id="bjui-hnav-tree${menu_index+1}" class="ztree ztree_main" data-toggle="ztree" data-on-click="MainMenuClick" data-expand-all="true" data-faicon="table">
                <#list menu.list as me>
                    <li data-id="${me.id}" data-pid="${me.parentId}" data-faicon="folder-open-o" data-faicon-close="folder-o">${me.menuName}</li>
                    <#list me.list as m>
                        <li data-id="${m.id}" data-pid="${m.parentId}" data-url="${base}${m.menuUrl}" data-tabid="${m.targetName}" data-faicon="list-alt">${m.menuName}</li>
                    </#list>
                </#list>
            </ul>
        </div>
    </li>
    </#list>

</ul>
</#macro>
