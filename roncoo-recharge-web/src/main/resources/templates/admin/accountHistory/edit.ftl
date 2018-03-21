<#assign base=request.contextPath /> 
<div class="bjui-pageContent">
	<form action="${base}/admin/accountHistory/update" data-toggle="validate" method="post">
		<input name="id" type="hidden" value="${bean.id}"/>
		<div class="form-group">
            <label class="control-label x85">创建时间：</label>
            <input type="text" name="gmtCreate" value="${bean.gmtCreate}" placeholder="创建时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">资金变动方向：</label>
            <input type="text" name="fundDirection" value="${bean.fundDirection}" placeholder="资金变动方向" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">修改</button></li>
    </ul>
</div>