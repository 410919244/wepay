package me.hao0.wepay.core;

import static me.hao0.common.util.Preconditions.checkNotNullAndEmpty;

import java.util.Map;
import java.util.TreeMap;

import me.hao0.wepay.model.component.ParamRequest;
import me.hao0.wepay.model.component.ParamResponse;
import me.hao0.wepay.model.enums.WepayField;
import me.hao0.wepay.util.RandomStrs;

public class Company extends Component {

	protected Company(Wepay wepay) {
		super(wepay);
	}

	/** 企业支付 */
	private static final String TRANSFERS_URL = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";
	
	
	public ParamResponse componentPay(ParamRequest req) {
		checkNotNullAndEmpty(req.getOpenid(), "openId");
		Map<String, String> payParams = buildPayParams(req);
		
		return doPay(payParams);
	}
	
	private ParamResponse doPay(Map<String, String> payParams) {
        buildSignParams(payParams);
        return doHttpsPost(TRANSFERS_URL, payParams, ParamResponse.class);
    }
	
	/**
     * 构建公共支付参数
     * @param request 支付请求对象
     * @param tradeType 交易类型
     * @return 支付MAP参数
     */
    private Map<String, String> buildPayParams(ParamRequest request) {
        Map<String, String> payParams = new TreeMap<>();

        // 配置参数
        buildConfigCompanyParams(payParams);

        // 业务必需参数
        put(payParams, WepayField.PARTNER_TRADE_NO, request.getPartnerTradeNo());
        put(payParams, WepayField.OPEN_ID, request.getOpenid());
        put(payParams, WepayField.CHECK_NAME, request.getCheckName().name());
        put(payParams, WepayField.AMOUNT, String.valueOf(request.getAmount()));
        put(payParams, WepayField.DESC, request.getDesc());
        put(payParams, WepayField.SPBILL_CREATE_IP, request.getSpbillCreateIp());
        put(payParams, WepayField.NONCE_STR, RandomStrs.generate(16));

        // 业务可选参数
        putIfNotEmpty(payParams, WepayField.DEVICE_INFO, request.getDeviceInfo());
        putIfNotEmpty(payParams, WepayField.RE_USER_NAME, request.getReUserName());
        return payParams;
    }
}
