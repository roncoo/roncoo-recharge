<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/item/update" data-toggle="validate" method="post">
		<input type="hidden" name="id" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">商品名称：</label>
            <input type="text" value="${bean.itemName!}" placeholder="商品名称" size="20" data-rule="required" disabled="disabled">
        </div>
		<div class="form-group">
            <label class="control-label x85">成本价格：</label>
            <input type="text" name="costPrice" value="${bean.costPrice/1000!}" placeholder="成本价格" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">销售价格1：</label>
            <input type="text" name="salesPrice1" value="${bean.salesPrice1/1000!}" placeholder="销售价格" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">销售价格2：</label>
            <input type="text" name="salesPrice2" value="${bean.salesPrice2/1000!}" placeholder="销售价格" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">销售价格3：</label>
            <input type="text" name="salesPrice3" value="${bean.salesPrice3/1000!}" placeholder="销售价格" size="20">
        </div>
         <div class="form-group">
            <label for="itemStatus" class="control-label x85">商品状态：</label>
            <#list itemStatusEnums as enumvo>
            <input type="radio" id="itemStatus${enumvo.code}" name="itemStatus" value="${enumvo.code}" <#if bean.itemStatus?? && bean.itemStatus==enumvo.code>checked</#if> data-toggle="icheck" data-label="${enumvo.desc}" size="20">
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