<div class="bjui-pageContent">
    
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">组织名称：</label>${bean.organizationName}
		</div>
	</div>
	<br/>
	<br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">组织类型：</label>
			<#list organizationTypeEnums as organizationType>
                <#if bean.organizationType == organizationType.code>${organizationType.desc}</#if>
            </#list>
		</div>
	
        <div class="col-lg-6">
            <label class="control-label ">状态：</label>
            <#list statusIdEnums as statusId>
                <#if bean.statusId == statusId.code>${statusId.desc}</#if>
            </#list>
        </div>
    </div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">备注：</label>${bean.remark}
		</div>
	</div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>