<div class="bjui-pageContent">
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">平台交易号：</label>${bean.orderTradeNo!}
		</div>
		<div class="col-lg-6">
            <label class="control-label">供货流水号：</label>${bean.supplySerialNo!}
        </div>
	</div>
	<br/>
	<br/>
	<br/>
    <br/>   
    <div class="form-group">
        <div class="col-lg-12">
            <label class="control-label">供货信息：</label>${bean.supplyDesc!}
        </div>
    </div>
    <br/>
    <br/> 
	<div class="form-group">
        <div class="col-lg-6">
            <label class="control-label">上游商户名称：</label>${bean.supplyName!}
        </div>
        <div class="col-lg-6">
            <label class="control-label">是否补充：</label>${bean.repeatType!}
        </div>
    </div>
    <br/>
    <br/>
    <br/>
    <br/>    
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">商品编号：</label>${bean.itemNo!}
		</div>

		<div class="col-lg-6">
			<label class="control-label">商品名称：</label>${bean.itemName!}
		</div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">商品面值：</label>${bean.supplyFacePrice!}
		</div>
		<div class="col-lg-6">
			<label class="control-label">平台录入成本价：</label>${bean.supplyCostPrice/1000!}元
		</div>
	</div>
    <br/>
    <br/>	
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">上游实际扣款价：</label>${bean.supplyActualCost/1000!}元
		</div>
	</div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>