package me.hao0.wepay.model.redpack;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import me.hao0.wepay.model.enums.RedPackField;

/**
 * 发送普通红包
 * @author zJun
 * @date 2018年7月12日 下午2:37:58
 */
public class RedPackRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 商户订单号 (必填) */
	@JsonProperty(RedPackField.MCH_BILNO)
	private String mchBillno;

	/** 商户名称 (必填) */
	@JsonProperty(RedPackField.SEND_NAME)
	private String sendName;

	/** 用户openid (必填) */
	@JsonProperty(RedPackField.RE_OPENID)
	private String reOpenid;

	/** 付款金额 (必填) */
	@JsonProperty(RedPackField.TOTAL_AMOUNT)
	private Integer totalAmount;

	/** 红包发放总人数 (必填) */
	@JsonProperty(RedPackField.TOTAL_NUM)
	private Integer totalNum;

	/** 红包祝福语 (必填) */
	@JsonProperty(RedPackField.WISHING)
	private String wishing;

	/** Ip地址 (必填) */
	@JsonProperty(RedPackField.CLIENT_IP)
	private String clientIp;

	/** 活动名称 (必填) */
	@JsonProperty(RedPackField.ACT_NAME)
	private String actName;

	/** 备注 (必填) */
	@JsonProperty(RedPackField.REMARK)
	private String remark;

	/** 场景id */
	@JsonProperty(RedPackField.SCENE_ID)
	private String sceneId;

	/** 活动信息 */
	@JsonProperty(RedPackField.RISK_INFO)
	private String riskInfo;

	/** 资金授权商户号 */
	@JsonProperty(RedPackField.CONSUME_MCH_ID)
	private String consumeMchId;

	/** 商户订单号 (必填) */
	public String getMchBillno() {
		return mchBillno;
	}

	/** 商户订单号 (必填) */
	public void setMchBillno(String mchBillno) {
		this.mchBillno = mchBillno;
	}

	/** 商户名称 (必填) */
	public String getSendName() {
		return sendName;
	}

	/** 商户名称 (必填) */
	public void setSendName(String sendName) {
		this.sendName = sendName;
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

	/** 红包发放总人数 (必填) */
	public Integer getTotalNum() {
		return totalNum;
	}

	/** 红包发放总人数 (必填) */
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	/** 红包祝福语 (必填) */
	public String getWishing() {
		return wishing;
	}

	/** 红包祝福语 (必填) */
	public void setWishing(String wishing) {
		this.wishing = wishing;
	}

	/** Ip地址 (必填) */
	public String getClientIp() {
		return clientIp;
	}

	/** Ip地址 (必填) */
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	/** 活动名称 (必填) */
	public String getActName() {
		return actName;
	}

	/** 活动名称 (必填) */
	public void setActName(String actName) {
		this.actName = actName;
	}

	/** 备注 (必填) */
	public String getRemark() {
		return remark;
	}

	/** 备注 (必填) */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/** 场景id */
	public String getSceneId() {
		return sceneId;
	}

	/** 场景id */
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	/** 活动信息 */
	public String getRiskInfo() {
		return riskInfo;
	}

	/** 活动信息 */
	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

	/** 资金授权商户号 */
	public String getConsumeMchId() {
		return consumeMchId;
	}

	/** 资金授权商户号 */
	public void setConsumeMchId(String consumeMchId) {
		this.consumeMchId = consumeMchId;
	}
}
