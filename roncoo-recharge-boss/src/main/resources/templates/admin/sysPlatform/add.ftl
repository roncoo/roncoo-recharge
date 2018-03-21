<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/sysPlatform/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">平台名称：</label>
            <input type="text" name="platformName" value="" placeholder="平台名称" size="20">
        </div>
        <div class="form-group">
            <label class="control-label x85">备注：</label>
            <textarea name="remark" data-toggle="autoheight" cols="20"></textarea>
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>