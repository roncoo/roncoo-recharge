<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/payChannel/update" data-toggle="validate" method="post">
		<input name="id" type="hidden" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">渠道标识：</label>
            <input type="text" name="channelName" value="${bean.channel}" placeholder="渠道名称" size="20" disabled>
        </div>
        <div class="form-group">
            <label class="control-label x85">渠道名称：</label>
            <input type="text" name="channelName" value="${bean.channelName}" placeholder="渠道名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">渠道类型：</label>
            <select name="channelType" data-toggle="selectpicker" data-rule="required" data-width="100">
                <#list channelTypeEnums as channelType>
                <option value="${channelType.code}" <#if bean.channelType == channelType.code>selected="selected"</#if>>${channelType.desc}</option>
                </#list>
            </select>
        </div>
		<div class="form-group">
            <label class="control-label x85">渠道参数：</label>
            <input type="text" name="channelParam" value="${bean.channelParam}" placeholder="渠道参数（json格式）" size="20">
        </div>
        <div class="form-group">
            <label class="control-label x85">状态：</label>
            <#list statusIdEnums as statusId>
            <input type="radio" name="statusId" value="${statusId.code}" data-toggle="icheck" data-label="${statusId.desc}" <#if bean.statusId == statusId.code>checked="checked"</#if>/> 
            </#list>
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>