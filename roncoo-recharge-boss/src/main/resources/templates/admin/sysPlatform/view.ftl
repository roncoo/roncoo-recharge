<div class="bjui-pageContent">
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label">平台APPID：</label>${bean.platformAppId!}
		</div>
	</div>
	<br/>
	<br/>
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label">平台APPSECRET：</label>${bean.platformAppSecret!}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label">平台名称：</label>${bean.platformName!}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-12">
            <label class="control-label">备注：</label>${bean.remark!}
        </div>
	</div>
	<br/>
    <br/>
	<div class="form-group">
        <div class="col-lg-6">
            <label class="control-label">状态：</label><#list statusIdEnums as enumvo><#if bean.statusId?? && bean.statusId==enumvo.code>${enumvo.desc}</#if></#list>
        </div>
    </div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>