package me.hao0.wepay.model.component;

/**
 * 企业付款
 * @author zJun
 * @date 2019年4月19日 下午4:20:52
 */
public class ParamRequest {

	/** 设备号 */
	private String deviceInfo;
	/** 随机字符串 */
	private String nonceStr;
	/** 商户订单号 */
	private String partnerTradeNo;
	/** 用户openid */
	private String openid;
	/** 校验用户姓名选项 */
	private CheckeName checkName;
	/** 收款用户姓名 */
	private String reUserName;
	/** 金额-企业付款金额，单位为分 */
	private Integer amount;
	/** 企业付款备注 */
	private String desc;
	/** Ip地址 */
	private String spbillCreateIp;

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getPartnerTradeNo() {
		return partnerTradeNo;
	}

	public void setPartnerTradeNo(String partnerTradeNo) {
		this.partnerTradeNo = partnerTradeNo;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public CheckeName getCheckName() {
		return checkName;
	}

	public void setCheckName(CheckeName checkName) {
		this.checkName = checkName;
	}

	public String getReUserName() {
		return reUserName;
	}

	public void setReUserName(String reUserName) {
		this.reUserName = reUserName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSpbillCreateIp() {
		return spbillCreateIp;
	}

	public void setSpbillCreateIp(String spbillCreateIp) {
		this.spbillCreateIp = spbillCreateIp;
	}

}