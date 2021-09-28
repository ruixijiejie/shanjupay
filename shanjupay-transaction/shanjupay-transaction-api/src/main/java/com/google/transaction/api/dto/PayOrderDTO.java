package com.google.transaction.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 下单请求对象
 */
@Data
public class PayOrderDTO implements Serializable {

    private Long storeId;//商户下门店，如果未指定，默认是根门店
    private String appId;//此处使用业务id，服务内部使用主键id，服务与服务之间用业务id--appId
    private String channel;//聚合支付的渠道 此处使用渠道编码
    private String outTradeNo;//商户订单号
    private String subject;//商品标题
    private String body;//订单描述
    private String currency;//币种CNY
    private Integer totalAmount;//订单总金额，单位为分
    private String optional;//自定义数据
    private String analysis;//用于统计分析的数据,用户自定义
    private String extra;//特定渠道发起时额外参数
    private String openId;//c端付款用户身份标识
    private String authCode;//付款条码，支付宝或者微信点“付款”产生的付款条码    在b扫c时，应由前端传过来
    private String device;//设备,存放UA等信息
	private String payChannel;//详细原始支付渠道编码
	private String clientIp; //请求IP

}