package me.hao0.wepay.model.redpack;

import com.fasterxml.jackson.annotation.JsonProperty;

import me.hao0.wepay.model.enums.RedPackField;

/**
 * 
 * @author zJun
 * @date 2018年7月13日 上午10:02:34
 */
public class RedPackResponse {

	/** 商户订单号 (必填) */
	@JsonProperty(RedPackField.MCH_BILNO)
	private String mchBillno;

	/** 商户号 */
	@JsonProperty(RedPackField.MCH_ID)
	private String mchId;

	/** 公众账号appid */
	@JsonProperty(RedPackField.WXAPPID)
	private String wxappid;

	/** 用户openid (必填) */
	@JsonProperty(RedPackField.RE_OPENID)
	private String reOpenid;

	/** 付款金额 (必填) */
	@JsonProperty(RedPackField.TOTAL_AMOUNT)
	private Integer totalAmount;

	/** 微信单号 */
	@JsonProperty(RedPackField.SEND_LISTID)
	private String sendListid;

	/** 商户订单号 (必填) */
	public String getMchBillno() {
		return mchBillno;
	}

	/** 商户订单号 (必填) */
	public void setMchBillno(String mchBillno) {
		this.mchBillno = mchBillno;
	}

	/** 商户号 */
	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	/** 商户号 */
	public String getMechId() {
		return mchId;
	}

	/** 公众账号appid */
	public void setWxappid(String wxappid) {
		this.wxappid = wxappid;
	}

	/** 公众账号appid */
	public String getWxappid() {
		return wxappid;
	}

	/** 用户openid (必填) */
	public String getReOpenid() {
		return reOpenid;
	}

	/** 用户openid (必填) */
	public void setReOpenid(String reOpenid) {
		this.reOpenid = reOpenid;
	}

	/** 付款金额 (必填) */
	public Integer getTotalAmount() {
		return totalAmount;
	}

	/** 付款金额 (必填) */
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	/** 微信单号 */
	public void setSendListid(String sendListid) {
		this.sendListid = sendListid;
	}

	/** 微信单号 */
	public String getSendListid() {
		return sendListid;
	}

}
