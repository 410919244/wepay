package me.hao0.wepay.model.component;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 企业付款
 * @author zJun
 * @date 2019年4月19日 下午4:20:52
 */
public class ParamResponse {

	/** 商户订单号 */
	@JsonProperty("partner_trade_no")
	private String partnerTradeNo;
	/** 微信付款单号 */
	@JsonProperty("payment_no")
	private String paymentNo;
	/** 付款成功时间 */
	@JsonProperty("payment_time")
	private String paymentTime;

	public String getPartnerTradeNo() {
		return partnerTradeNo;
	}

	public void setPartnerTradeNo(String partnerTradeNo) {
		this.partnerTradeNo = partnerTradeNo;
	}

	public String getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

	public String getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

}