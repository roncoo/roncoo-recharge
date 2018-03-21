<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/mobileInfo/update" data-toggle="validate" method="post">
		<input type="hidden" name="id" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">号码片段：</label>
            <input type="text" name="mobilePrefix" value="${bean.mobilePrefix!}" placeholder="号码片段" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">省份代码：</label>
            <input type="text" name="provinceCode" value="${bean.provinceCode!}" placeholder="省份代码" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">省份：</label>
            <input type="text" name="provinceName" value="${bean.provinceName!}" placeholder="省份" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">市代码：</label>
            <input type="text" name="cityCode" value="${bean.cityCode!}" placeholder="市代码" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">市：</label>
            <input type="text" name="cityName" value="${bean.cityName!}" placeholder="市" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">区号：</label>
            <input type="text" name="areaCode" value="${bean.areaCode!}" placeholder="区号" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">运营商名称：</label>
            <input type="text" name="carrierName" value="${bean.carrierName!}" placeholder="运营商名称" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">运营商类型：</label>
            <input type="text" name="carrierType" value="${bean.carrierType!}" placeholder="运营商类型" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>