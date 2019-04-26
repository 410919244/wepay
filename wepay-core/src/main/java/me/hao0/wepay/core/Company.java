package me.hao0.wepay.core;

import static me.hao0.common.util.Preconditions.checkNotNullAndEmpty;

import java.util.Map;
import java.util.TreeMap;

import me.hao0.wepay.model.component.GettransferinfoResponse;
import me.hao0.wepay.model.component.ParamRequest;
import me.hao0.wepay.model.component.ParamResponse;
import me.hao0.wepay.model.enums.WepayField;
import me.hao0.wepay.util.RandomStrs;

/**
 * 企业付款
 * @author zJun
 * @date 2019年4月26日 下午3:54:16
 */
public class Company extends Component {

	protected Company(Wepay wepay) {
		super(wepay);
	}

	/** 企业支付 */
	private static final String TRANSFERS_URL = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";
	
	/** 企业支付查询 */
	private static final String GETTRANSFERINFO = "https://api.mch.weixin.qq.com/mmpaymkttransfers/gettransferinfo";
	
	/**
	 * 企业支付
	 * @param req
	 * @return
	 * @author zJun
	 * @date 2019年4月26日 下午4:17:23
	 */
	public ParamResponse componentPay(ParamRequest req) {
		checkNotNullAndEmpty(req.getOpenid(), "openId");
		
		Map<String, String> payParams = new TreeMap<>();

        // 业务必需参数
        put(payParams, WepayField.PARTNER_TRADE_NO, req.getPartnerTradeNo());
        put(payParams, WepayField.OPEN_ID, req.getOpenid());
        put(payParams, WepayField.CHECK_NAME, req.getCheckName().name());
        put(payParams, WepayField.AMOUNT, String.valueOf(req.getAmount()));
        put(payParams, WepayField.DESC, req.getDesc());
        put(payParams, WepayField.SPBILL_CREATE_IP, req.getSpbillCreateIp());

        // 业务可选参数
        putIfNotEmpty(payParams, WepayField.DEVICE_INFO, req.getDeviceInfo());
        putIfNotEmpty(payParams, WepayField.RE_USER_NAME, req.getReUserName());
		
        buildQueryParams(payParams);
		return doHttpsPost(TRANSFERS_URL, payParams, ParamResponse.class);
	}
	
	/**
	 * 查询企业付款
	 * @param partnerTradeNo
	 * @return
	 * @author zJun
	 * @date 2019年4月26日 下午4:15:54
	 */
	public GettransferinfoResponse gettransferinfo(String partnerTradeNo) {
		checkNotNullAndEmpty(partnerTradeNo, "partnerTradeNo");
		Map<String, String> payParams = new TreeMap<>();
		payParams.put("partner_trade_no", partnerTradeNo);
		buildQueryParams(payParams);
		return doHttpsPost(GETTRANSFERINFO, payParams, GettransferinfoResponse.class);
	}
	
	/**
	 * 构建api调用参数
	 * @param params
	 * @author zJun
	 * @date 2019年4月26日 下午4:16:14
	 */
    private void buildQueryParams(Map<String, String> params) {
    	buildConfigCompanyParams(params);
        put(params, WepayField.NONCE_STR, RandomStrs.generate(16));
        buildSignParams(params);
    }
}
