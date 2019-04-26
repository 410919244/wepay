package me.hao0.wepay.model.component;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GettransferinfoResponse {

	/** 商户订单号 */
	@JsonProperty("partner_trade_no")
	private String partnerTradeNo;
	
	/** Appid  */
	@JsonProperty("appid")
	private String appid;
	
	/** 商户号 */
	@JsonProperty("mch_id")
	private String mchid;
	
	/** 付款单号  */
	@JsonProperty("detail_id")
	private String detailId;
	
	/** 转账状态 */
	@JsonProperty("status")
	private String status;
	
	/** 失败原因 */
	@JsonProperty("reason")
	private String reason;
	
	/** openid */
	@JsonProperty("openid")
	private String openid;
	
	/** 收款用户姓名 */
	@JsonProperty("transfer_name")
	private String transferName;
	
	/** 付款金额 */
	@JsonProperty("payment_amount")
	private Integer paymentAmount;
	
	/** 转账时间 */
	@JsonProperty("transfer_time")
	private String transferTime;
	
	/** 付款成功时间  */
	@JsonProperty("payment_time")
	private String paymentTime;
	
	/** 企业付款备注 */
	@JsonProperty("desc")
	private String desc;

	public String getPartnerTradeNo() {
		return partnerTradeNo;
	}

	public void setPartnerTradeNo(String partnerTradeNo) {
		this.partnerTradeNo = partnerTradeNo;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMchid() {
		return mchid;
	}

	public void setMchid(String mchid) {
		this.mchid = mchid;
	}

	public String getDetailId() {
		return detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getTransferName() {
		return transferName;
	}

	public void setTransferName(String transferName) {
		this.transferName = transferName;
	}

	public Integer getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Integer paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getTransferTime() {
		return transferTime;
	}

	public void setTransferTime(String transferTime) {
		this.transferTime = transferTime;
	}

	public String getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * 转账状态
	 * 
	 * @author zJun
	 * @date 2019年4月26日 下午4:04:51
	 */
	public static enum Status {
		/** 转账成功 */
		SUCCESS,
		/** 转账失败 */
		FAILED,
		/** 处理中 */
		PROCESSING
	}
}
