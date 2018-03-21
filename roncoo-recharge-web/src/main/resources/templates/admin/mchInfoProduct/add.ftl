<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/mchInfoProduct/save" data-toggle="validate" method="post">
	   <input name="mchInfoId" type="hidden" value="${bean.mchInfoId}"/>
		<div class="form-group">
            <label class="control-label x85">支付渠道：</label>
            <input type="text" name="payProductName" placeholder="请选择支付产品" size="20" data-toggle="lookup" data-url="${base}/admin/payProduct/lookupList?mchInfoId=${bean.mchInfoId}&statusId=1" data-rule="required" data-width="800" data-height="500">
            <input type="hidden" name="payProductId" />
            <input type="hidden" name="payProductType"/>
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