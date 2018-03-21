<div class="bjui-pageContent">
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">渠道名称：</label>${bean.channelName}
		</div>
		<div class="col-lg-6">
            <label class="control-label ">渠道类型：</label>
             <#list channelTypeEnums as channelType>
                <#if bean.channelType == channelType.code>${channelType.desc}</#if>
            </#list>
        </div>
	</div>
	<br/>
	<br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">渠道参数：</label>${bean.channelParam}
		</div>
	</div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>