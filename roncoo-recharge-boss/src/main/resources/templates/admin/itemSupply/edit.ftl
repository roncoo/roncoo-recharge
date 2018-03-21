<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/itemSupply/update" data-toggle="validate" method="post">
		<input type="hidden" name="id" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">成本价：</label>
            <input type="text" name="costPrice" value="${bean.costPrice/1000}" placeholder="成本价" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">上游商品ID：</label>
            <input type="text" name="supplyProductCode" value="${bean.supplyProductCode}" placeholder="上游商品ID" size="20">
        </div>
        <div class="form-group">
            <label class="control-label x85">供货优先级：</label>
            <input type="text" name="priority" value="10" placeholder="供货优先级" size="20">
        </div>
        <div class="form-group">
            <label for="itemStatus" class="control-label x85">状态：</label>
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