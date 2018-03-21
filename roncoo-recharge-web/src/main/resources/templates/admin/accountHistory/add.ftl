<#assign base=request.contextPath />
<div class="bjui-pageContent">
	<form action="${base}/admin/accountHistory/save" data-toggle="validate" method="post">
		<div class="form-group">
            <label class="control-label x85">：</label>
            <input type="text" name="id" value="" placeholder="" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">创建时间：</label>
            <input type="text" name="gmtCreate" value="" placeholder="创建时间" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">资金变动方向：</label>
            <input type="text" name="fundDirection" value="" placeholder="资金变动方向" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">金额：</label>
            <input type="text" name="amount" value="" placeholder="金额" size="20">
        </div>
		<div class="form-group">
            <label class="control-label x85">账户余额：</label>
            <input type="text" name="balance" value="" placeholder="账户余额" size="20">
        </div>
	</form>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
        <li><button type="submit" class="btn-default">添加</button></li>
    </ul>
</div>