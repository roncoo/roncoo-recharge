<div class="bjui-pageContent">
    <div class="form-group">
        <div class="col-lg-12">
            <label class="control-label ">商户名称：</label>${bean.mchInfoName}
        </div>
    </div>
	<br/>
	<br/>
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label ">支付订单号：</label>${bean.payOrderNo}
		</div>
    </div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label ">订单流水号：</label>${bean.payOrderSerialNo}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">支付次数：</label>${bean.payCount}
		</div>

		<div class="col-lg-6">
			<label class="control-label ">支付索引：</label>${bean.payIndex}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">订单状态：</label>
			<#list orderStatusEnums as orderStatus>
                <#if bean.orderStatus == orderStatus.code>${orderStatus.desc}</#if>
            </#list>
		</div>

		<div class="col-lg-6">
			<label class="control-label ">订单号：</label>${bean.orderNo}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">订单价格：</label>${bean.orderPrice}
		</div>

		<div class="col-lg-6">
			<label class="control-label ">订单商品：</label>${bean.orderProduct}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">订单IP：</label>${bean.orderIp}
		</div>

		<div class="col-lg-6">
			<label class="control-label ">订单时间：</label>${bean.orderTime}
		</div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-12">
			<label class="control-label ">页面通知地址：</label>${bean.returnUrl}
		</div>
	</div>
	<br/>
    <br/>
	<div class="form-group">
		<div class="col-lg-12">
            <label class="control-label ">异步通知地址：</label>${bean.notifyUrl}
        </div>
	</div>
	<br/>
    <br/>
    <div class="form-group">
        <div class="col-lg-12">
            <label class="control-label ">备注：</label>${bean.remark!}
        </div>
    </div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>