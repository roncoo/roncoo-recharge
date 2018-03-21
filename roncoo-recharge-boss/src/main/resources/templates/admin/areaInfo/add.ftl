<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/areaInfo/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">省编号：</label>
            <input type="text" name="provinceCode" value="" placeholder="省编号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">市编号：</label>
            <input type="text" name="cityCode" value="" placeholder="市编号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">区号：</label>
            <input type="text" name="areaCode" value="" placeholder="区号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">省名称：</label>
            <input type="text" name="provinceName" value="" placeholder="省名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">市名称：</label>
            <input type="text" name="cityName" value="" placeholder="市名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">分类：1.省 2 市：</label>
            <input type="text" name="areaType" value="" placeholder="分类：1.省 2 市" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>