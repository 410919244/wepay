package me.hao0.wepay.model.redpack;

import com.fasterxml.jackson.annotation.JsonProperty;

import me.hao0.wepay.model.enums.AmtType;
import me.hao0.wepay.model.enums.RedPackField;

/**
 * 裂变红包request
 * @author zJun
 * @date 2018年7月13日 上午10:27:25
 */
public class RedPackGroupRequest extends RedPackRequest {

	private static final long serialVersionUID = 1L;
	
	/** 红包金额设置方式  */
	@JsonProperty(RedPackField.AMT_TYPE)
	private AmtType amtType;

	/** 红包金额设置方式  */
	public AmtType getAmtType() {
		return amtType;
	}

	/** 红包金额设置方式  */
	public void setAmtType(AmtType amtType) {
		this.amtType = amtType;
	}
	
}
