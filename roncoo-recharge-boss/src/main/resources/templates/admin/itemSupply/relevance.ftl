<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/itemSupply/set" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">商品名称：</label>
            <input type="text" name="itemName" value="${item.itemName!}" placeholder="商品名称" size="20" data-rule="required" readonly="readonly">
            <input type="hidden" name="itemId" value="${item.id!}">
            <input type="hidden" name="itemNo" value="${item.itemNo!}">
        </div>
		<div class="form-group">
            <label class="control-label x85">面值：</label>
            <input type="text" name="facePrice" value="${item.facePrice!}" placeholder="面值" size="20" readonly="readonly">
        </div>
        <div class="form-group">
            <label class="control-label x85">供货商：</label>
            <input type="text" name="supplyName" data-toggle="lookup" data-url="${base}/admin/supplyInfo/lookup" size="20">
            <input type="hidden" name="supplyInfoId">
            <input type="hidden" name="supplyCode">
        </div>
		<div class="form-group">
            <label class="control-label x85">成本价格：</label>
            <input type="text" name="costPrice" value="${item.costPrice/1000!}" placeholder="成本价格" size="20">
        </div>
         <div class="form-group">
            <label class="control-label x90">上游商品编号：</label>
            <input type="text" name="supplyProductCode" value="" placeholder="上游商品编号" size="20">
        </div>
        <div class="form-group">
            <label class="control-label x85">供货优先级：</label>
            <input type="text" name="priority" value="10" placeholder="供货优先级" size="20">
        </div>
       
        <!--
        <div class="form-group">
            <label for="lossType" class="control-label x85">是否可以折损：</label>
            <#list lossTypeEnums as enumvo>
            <input type="radio" id="lossType${enumvo.code}" name="lossType" value="${enumvo.code}" <#if item.lossType?? && item.lossType==enumvo.code>checked</#if> data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label x85">折损次数：</label>
            <input type="text" name="lossTime" value="" placeholder="折损次数" size="20">
        </div>
        -->
        <div class="form-group">
            <label for="itemStatus" class="control-label x85">状态：</label>
            <#list itemStatusEnums as enumvo>
            <input type="radio" id="itemStatus${enumvo.code}" name="itemStatus" value="${enumvo.code}" <#if item.itemStatus?? && item.itemStatus==enumvo.code>checked</#if> data-toggle="icheck" data-label="${enumvo.desc}" size="20">
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