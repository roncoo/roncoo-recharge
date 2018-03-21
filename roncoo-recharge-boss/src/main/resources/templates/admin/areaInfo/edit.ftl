<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/areaInfo/update" data-toggle="validate" method="post">
		<input type="hidden" name="id" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">省编号：</label>
            <input type="text" name="provinceCode" value="${bean.provinceCode!}" placeholder="省编号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">市编号：</label>
            <input type="text" name="cityCode" value="${bean.cityCode!}" placeholder="市编号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">区号：</label>
            <input type="text" name="areaCode" value="${bean.areaCode!}" placeholder="区号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">省名称：</label>
            <input type="text" name="provinceName" value="${bean.provinceName!}" placeholder="省名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">市名称：</label>
            <input type="text" name="cityName" value="${bean.cityName!}" placeholder="市名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">分类：1.省 2 市：</label>
            <input type="text" name="areaType" value="${bean.areaType!}" placeholder="分类：1.省 2 市" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>