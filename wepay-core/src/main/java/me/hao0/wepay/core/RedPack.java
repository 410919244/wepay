package me.hao0.wepay.core;

import java.util.Map;
import java.util.TreeMap;

import me.hao0.common.util.Strings;
import me.hao0.wepay.model.enums.RedPackField;
import me.hao0.wepay.model.redpack.RedPackGroupRequest;
import me.hao0.wepay.model.redpack.RedPackRequest;
import me.hao0.wepay.model.redpack.RedPackResponse;
import me.hao0.wepay.util.RandomStrs;

public class RedPack extends Component {
	
	/** 发放普通红包 */
	private final static String SEND_RED_PACK  = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendredpack";
	
	/** 发放裂变红包 */
	private final static String  SEND_GROUP_RED_PACK = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendgroupredpack";

	protected RedPack(Wepay wepay) {
		super(wepay);
	}
	
	/**
	 * 发送裂变红包
	 * @param request
	 * @return
	 * @author zJun
	 * @date 2018年7月13日 上午10:29:59
	 */
	public RedPackResponse sendGroupRedPack(RedPackGroupRequest request) {
		Map<String, String> payParams = buildPayParams(request);
		put(payParams, RedPackField.AMT_TYPE, request.getAmtType().name());
		buildSignParams(payParams);
		return doHttpsPost(SEND_GROUP_RED_PACK, payParams, RedPackResponse.class);
	}
	
	/**
	 * 发送普通红包
	 * @param request
	 * @return
	 * @author zJun
	 * @date 2018年7月12日 下午4:07:28
	 */
	public RedPackResponse sendRedPack(RedPackRequest request) {
		Map<String, String> payParams = buildPayParams(request);
		buildSignParams(payParams);
		return doHttpsPost(SEND_RED_PACK, payParams, RedPackResponse.class);
	}
	
	/**
     * 构建公共支付参数
     * @param request 支付请求对象
     * @param tradeType 交易类型
     * @return 支付MAP参数
     */
    private Map<String, String> buildPayParams(RedPackRequest request) {
        Map<String, String> payParams = new TreeMap<>();

        // 配置参数
        buildConfigParams2(payParams);

        // 业务必需参数
        put(payParams, RedPackField.MCH_BILNO, request.getMchBillno());
        put(payParams, RedPackField.SEND_NAME, request.getSendName());
        put(payParams, RedPackField.RE_OPENID, request.getReOpenid());
        put(payParams, RedPackField.TOTAL_AMOUNT, String.valueOf(request.getTotalAmount()));
        put(payParams, RedPackField.TOTAL_NUM, String.valueOf(request.getTotalNum()));
        put(payParams, RedPackField.WISHING, request.getWishing());
        put(payParams, RedPackField.CLIENT_IP, request.getClientIp());
        put(payParams, RedPackField.ACT_NAME, request.getActName());
        put(payParams, RedPackField.REMARK, request.getRemark());

        // 业务可选参数
        putIfNotEmpty(payParams, RedPackField.SCENE_ID, request.getSceneId());
        putIfNotEmpty(payParams, RedPackField.RISK_INFO, request.getRiskInfo());
        putIfNotEmpty(payParams, RedPackField.CONSUME_MCH_ID, request.getConsumeMchId());

        put(payParams, RedPackField.NONCE_STR, RandomStrs.generate(32));
        return payParams;
    }
    
    /**
     * 构建配置参数
     * @param params
     * @author zJun
     * @date 2018年7月12日 下午3:58:14
     */
    private void buildConfigParams2(final Map<String, String> params){
        params.put(RedPackField.WXAPPID, wepay.getAppId());
        params.put(RedPackField.MCH_ID, wepay.getMchId());
        if(!Strings.isNullOrEmpty(wepay.getSubMchId())) {
        	params.put(RedPackField.SUB_APP_ID, wepay.getSubAppId());
        	params.put(RedPackField.SUB_MCH_ID, wepay.getSubMchId());
        }
    }
}
