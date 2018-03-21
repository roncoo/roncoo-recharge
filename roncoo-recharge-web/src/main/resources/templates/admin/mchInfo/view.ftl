<div class="bjui-pageContent">
	<div class="form-group">
        <div class="col-lg-12">
            <label class="control-label ">商户名称：</label>${bean.infoName}
        </div>
    </div>
    <br />
    <br />
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">商户类型：</label>
			<#list infoTypeEnums as infoType>
                <#if bean.infoType == infoType.code>${infoType.desc}</#if>
            </#list>
		</div>
        <div class="col-lg-6">
            <label class="control-label ">状态：</label>
            <#list statusIdEnums as statusId>
                <#if bean.statusId == statusId.code>${statusId.desc}</#if>
            </#list>
        </div>
    </div>
    <br />
    <br />
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label ">ClientId：</label>${bean.clientId}
		</div>
	</div>
	<br />
    <br />
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label ">ClientSecret：</label>${bean.clientSecret}
		</div>
	</div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>