<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/payChannel/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">渠道类型：</label>
            <select name="channelType" data-toggle="selectpicker" data-rule="required" data-width="100">
                <#list channelTypeEnums as channelType>
                <option value="${channelType.code}">${channelType.desc}</option>
                </#list>
            </select>
        </div>
		<div class="form-group">
            <label class="control-label x85">渠道名称：</label>
            <input type="text" name="channelName" value="" placeholder="渠道名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">渠道参数：</label>
            <input type="text" name="channelParam" value="" placeholder="渠道参数（json格式）" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>