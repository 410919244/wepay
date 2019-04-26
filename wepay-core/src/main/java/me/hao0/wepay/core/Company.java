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
		
		Map<String, String> params = new TreeMap<>();

        // 业务必需参数
        put(params, WepayField.PARTNER_TRADE_NO, req.getPartnerTradeNo());
        put(params, WepayField.OPEN_ID, req.getOpenid());
        put(params, WepayField.CHECK_NAME, req.getCheckName().name());
        put(params, WepayField.AMOUNT, String.valueOf(req.getAmount()));
        put(params, WepayField.DESC, req.getDesc());
        put(params, WepayField.SPBILL_CREATE_IP, req.getSpbillCreateIp());

        // 业务可选参数
        putIfNotEmpty(params, WepayField.DEVICE_INFO, req.getDeviceInfo());
        putIfNotEmpty(params, WepayField.RE_USER_NAME, req.getReUserName());
		
        buildConfigCompanyParams(params);
        buildQueryParams(params);
		return doHttpsPost(TRANSFERS_URL, params, ParamResponse.class);
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
		Map<String, String> params = new TreeMap<>();
		params.put("partner_trade_no", partnerTradeNo);
		buildConfigParams(params);
		buildQueryParams(params);
		return doHttpsPost(GETTRANSFERINFO, params, GettransferinfoResponse.class);
	}
	
	/**
	 * 构建api调用参数
	 * @param params
	 * @author zJun
	 * @date 2019年4月26日 下午4:16:14
	 */
    private void buildQueryParams(Map<String, String> params) {
        put(params, WepayField.NONCE_STR, RandomStrs.generate(16));
        buildSignParams(params);
    }
}
