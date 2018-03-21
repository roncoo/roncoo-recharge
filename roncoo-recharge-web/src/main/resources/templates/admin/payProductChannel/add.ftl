<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/payProductChannel/save" data-toggle="validate" method="post">
		<input name="payProductId" type="hidden" value="${bean.payProductId}"/>
		<input name="payProductName" type="hidden" value="${bean.payProductName}"/>
		<input name="payProductType" type="hidden" value="${bean.payProductType}"/>
		<div class="form-group">
            <label class="control-label x85">支付渠道：</label>
            <input type="text" name="payChannelName" placeholder="请选择支付渠道" size="20" data-toggle="lookup" data-url="${base}/admin/payChannel/lookupList?channelType=${bean.payProductType}&payProductId=${bean.payProductId}" data-rule="required" data-width="800" data-height="500">
            <input type="hidden" name="payChannelId" />
            <input type="hidden" name="payChannel"/>
            <input type="hidden" name="payChannelType"/>
        </div>
		
		<div class="form-group">
            <label class="control-label x85">排序：</label>
            <input type="text" name="sort" value="" placeholder="排序" size="20">
        </div>
		
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>