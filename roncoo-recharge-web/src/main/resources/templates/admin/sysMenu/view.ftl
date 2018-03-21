<div class="bjui-pageContent">
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">菜单名称：</label>${bean.menuName}
		</div>
	</div>
	<br/>
	<br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">菜单路径：</label>${bean.menuUrl}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">目标名称：</label>${bean.targetName}
		</div>
		<div class="col-lg-6">
			<label class="control-label ">菜单图标：</label>${bean.menuIcon}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">排序：</label>${bean.sort}
		</div>
        <div class="col-lg-6">
            <label class="control-label ">状态：</label>${bean.statusId}
        </div>
    </div>
    <br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-6">
            <label class="control-label ">备注：</label>${bean.remark!}
        </div>
    </div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>