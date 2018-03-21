<div class="bjui-pageContent">
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">交易订单：</label>${bean.tradeNo!}
		</div>
        <div class="col-lg-6">
            <label class="control-label">商户订单号：</label>${bean.orderNo!}
        </div>
    </div>
    <br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-6">
            <label class="control-label">支付流水号：</label>${bean.paySerialNo!}
        </div>
        <div class="col-lg-6">
            <label class="control-label">订单状态：</label><#list orderStatusEnums as enumvo><#if bean.orderStatus?? && bean.orderStatus==enumvo.code>${enumvo.desc}</#if></#list>
        </div>
    </div>
    <br/>
    <br/>
    <br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-6">
            <label class="control-label">供货次数：</label>${bean.supplyCount!}
        </div>
        <div class="col-lg-6">
            <label class="control-label">供货索引：</label>${bean.supplyIndex!}
        </div>
    </div>
    <br/>
    <br/>
     <div class="form-group">
        <div class="col-lg-12">
            <label class="control-label">供货摘要：</label>${bean.supplyDesc!}
        </div>
    </div>
    <br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-12">
            <label class="control-label">回调地址：</label>${bean.notifyUrl!}
        </div>
    </div>
    <br/>
    <br/>
    <br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-6">
            <label class="control-label">商品类型：</label><#list itemTypeEnums as enumvo><#if bean.itemType?? && bean.itemType==enumvo.code>${enumvo.desc}</#if></#list>
        </div>
        <div class="col-lg-6">
            <label class="control-label">运营商类型：</label><#list carrierTypeEnums as enumvo><#if bean.carrierType?? && bean.carrierType==enumvo.code>${enumvo.desc}</#if></#list>
        </div>
    </div>
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
            <label class="control-label">面值：</label>${bean.facePrice!}
        </div>
		<div class="col-lg-6">
			<label class="control-label">销售价格：</label>${bean.salesPrice/1000!}元
		</div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">成本价：</label>${bean.costPrice/1000!}元
		</div>
		<div class="col-lg-6">
            <label class="control-label">实际扣费：</label>${bean.actualCost/1000!}元
        </div>
	</div>
	<br/>
    <br/>
    <br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-6">
            <label class="control-label">流量范围：</label><#list flowScopeEnums as enumvo><#if bean.flowScope?? && bean.flowScope==enumvo.code>${enumvo.desc}</#if></#list>
        </div>
		<div class="col-lg-6">
			<label class="control-label">生效方式：</label><#list flowModeEnums as enumvo><#if bean.flowMode?? && bean.flowMode==enumvo.code>${enumvo.desc}</#if></#list>
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-6">
            <label class="control-label">包体类型：</label><#list flowPackageTypeEnums as enumvo><#if bean.flowPackageType?? && bean.flowPackageType==enumvo.code>${enumvo.desc}</#if></#list>
        </div>
        <div class="col-lg-6">
            <label class="control-label">通道类型：</label><#list flowStreamTypeEnums as enumvo><#if bean.flowStreamType?? && bean.flowStreamType==enumvo.code>${enumvo.desc}</#if></#list>
        </div>
    </div>
	<br/>
    <br/>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label">卡号：</label>${bean.cardNo!}
		</div>
		<div class="col-lg-6">
			<label class="control-label">卡密：</label>${bean.cardPwd!}
		</div>
	</div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>