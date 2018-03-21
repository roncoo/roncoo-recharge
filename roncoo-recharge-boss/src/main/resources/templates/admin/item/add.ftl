<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/item/save" data-toggle="validate" method="post">
	   <div class="form-group">
            <label for="itemCategory" class="control-label x85">商品类别：</label>
            <#list itemCategoryEnums as enumvo>
            <input type="radio" id="itemCategory${enumvo.code}" name="itemCategory" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
        <div class="form-group">
            <label for="itemType" class="control-label x85">商品类型：</label>
            <#list itemTypeEnums as enumvo>
            <input type="radio" id="itemType${enumvo.code}" name="itemType" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
        <div class="form-group">
            <label for="carrierType" class="control-label x85">运营商：</label>
            <#list carrierTypeEnums as enumvo>
            <input type="radio" id="carrierType${enumvo.code}" name="carrierType" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
		<div class="form-group">
            <label class="control-label x85">商品面值：</label>
            <input type="text" name="facePrice" value="" placeholder="商品面值" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label class="control-label x85">成本价格：</label>
            <input type="text" name="costPrice" value="" placeholder="成本价格" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label class="control-label x85">销售价格1：</label>
            <input type="text" name="salesPrice1" value="" placeholder="销售价格1" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label class="control-label x85">销售价格2：</label>
            <input type="text" name="salesPrice2" value="" placeholder="销售价格2" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label class="control-label x85">销售价格3：</label>
            <input type="text" name="salesPrice3" value="" placeholder="销售价格3" size="20" data-rule="required">
        </div>
		<div class="form-group">
            <label for="salesArea" class="control-label x85">销售地区：</label>
            <select name="salesArea" data-toggle="selectpicker">
                <#list salesAreaList as salesArea>
                    <option value="${salesArea.provinceCode}">${salesArea.provinceName}</option> 
                </#list>
            </select>
        </div>
        
        <div class="form-group">
            <label for="flowScope" class="control-label x85">使用范围：</label>
            <#list flowScopeEnums as enumvo>
            <input type="radio" id="flowScope${enumvo.code}" name="flowScope" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
        <div class="form-group">
            <label for="flowStreamType" class="control-label x85">通道类型：</label>
            <#list flowStreamTypeEnums as enumvo>
            <input type="radio" id="flowStreamType${enumvo.code}" name="flowStreamType" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
        <div class="form-group">
            <label for="flowPackageType" class="control-label x85">包体类型：</label>
            <#list flowPackageTypeEnums as enumvo>
            <input type="radio" id="flowPackageType${enumvo.code}" name="flowPackageType" value="${enumvo.code}" data-toggle="icheck" data-label="${enumvo.desc}" size="20">
            </#list>
        </div>
		
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>