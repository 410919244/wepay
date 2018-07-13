package me.hao0.wepay.model.enums;

/**
 * 发红包字段
 * @author zJun
 * @date 2018年7月12日 下午2:49:48
 */
public class RedPackField {
	
	/** 随机字符串 */
	public final static String NONCE_STR = "nonce_str";
	
	/** 签名 */
	public final static String SIGN = "sign";
	
	/** 商户订单号 */
	public final static String MCH_BILNO = "mch_billno";
	
	/** 商户号 */
	public final static String MCH_ID = "mch_id";
	
	/** 公众账号appid */
	public final static String WXAPPID = "wxappid";
	
	/** 商户名称 */
	public final static String SEND_NAME = "send_name";
	
	/** 用户openid */
	public final static String RE_OPENID = "re_openid";
	
	/** 付款金额，单位分 */
	public final static String TOTAL_AMOUNT = "total_amount";
	
	/** 红包发放总人数 */
	public final static String TOTAL_NUM = "total_num";
	
	/** 红包祝福语 */
	public final static String WISHING = "wishing";
	
	/** Ip地址 */
	public final static String CLIENT_IP = "client_ip";
	
	/** 活动名称 */
	public final static String ACT_NAME = "act_name";
	
	/** 备注 */
	public final static String REMARK = "remark";
	
	/** 场景id */
	public final static String SCENE_ID  = "scene_id";
	
	/** 活动信息 */
	public final static String RISK_INFO = "risk_info";
	
	/** 资金授权商户号 */
	public final static String CONSUME_MCH_ID = "consume_mch_id";
	
	/** 微信单号 */
	public final static String SEND_LISTID = "send_listid";
	
	/** 红包金额设置方式  */
	public final static String AMT_TYPE = "amt_type";
}
