<div class="bjui-pageContent">
   
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">商户名称：</label>${bean.mchInfoName}
		</div>
	</div>
    <br/>
    <br/>
    <div class="form-group">
		<div class="col-lg-6">
			<label class="control-label ">支付产品名称：</label>${bean.payProductName}
		</div>
		<div class="col-lg-6">
			<label class="control-label ">支付渠道名称：</label>${bean.payChannelName}
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
			<label class="control-label ">支付订单流水状态：</label>
			<#list orderSerialStatusEnums as orderSerialStatus>
                <#if bean.payOrderSerialStatus == orderSerialStatus.code>${orderSerialStatus.desc}</#if>
            </#list>
		</div>
	</div>
</div>
<div class="bjui-pageFooter">
    <ul>
        <li><button type="button" class="btn-close">取消</button></li>
    </ul>
</div>