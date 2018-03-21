<div class="bjui-pageContent">
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">类别：</label><#list supplyCategoryEnums as enumvo><#if bean.supplyCategory?? && bean.supplyCategory==enumvo.code>${enumvo.desc}</#if></#list>
		</div>
	</div>
	<br/>
	<br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">上游编码：</label>${bean.supplyCode!}
		</div>
		<div class="col-lg-6">
            <label class="control-label">名称：</label>${bean.supplyName!}
        </div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-12">
            <label class="control-label">公司名：</label>${bean.compayName!}
        </div>
    </div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label">请求URl：</label>${bean.paraRequestUrl!}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label">订单url：</label>${bean.paraOrderUrl!}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label">余额URL：</label>${bean.paraBalanceUrl!}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">用户ID：</label>${bean.paraUserId!}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">key：</label>${bean.paraKey!}
		</div>
		<div class="col-lg-6">
			<label class="control-label">seceret：</label>${bean.paraSeceret!}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">扩展参数1：</label>${bean.paraExt1!}
		</div>
		<div class="col-lg-6">
			<label class="control-label">扩展参数2：</label>${bean.paraExt2!}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">扩展参数3：</label>${bean.paraExt3!}
		</div>
		<div class="col-lg-6">
			<label class="control-label">扩展参数4：</label>${bean.paraExt4!}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">扩展参数5：</label>${bean.paraExt5!}
		</div>
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