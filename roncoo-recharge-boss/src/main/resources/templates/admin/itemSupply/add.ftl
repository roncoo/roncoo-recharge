<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/itemSupply/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="gmtCreate" value="" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="gmtModify" value="" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">供应商编号：</label>
            <input type="text" name="supplyInfoId" value="" placeholder="供应商编号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">名称：</label>
            <input type="text" name="supplyName" value="" placeholder="名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">商品ID：</label>
            <input type="text" name="itemId" value="" placeholder="商品ID" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">状态：1 初始，2正常，3下架：</label>
            <input type="text" name="itemStatus" value="" placeholder="状态：1 初始，2正常，3下架" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">是否折损：</label>
            <input type="text" name="lossType" value="" placeholder="是否折损" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">折损次数：</label>
            <input type="text" name="lossTime" value="" placeholder="折损次数" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">成本价：</label>
            <input type="text" name="costPrice" value="" placeholder="成本价" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">上游商品ID：</label>
            <input type="text" name="supplyProductCode" value="" placeholder="上游商品ID" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>