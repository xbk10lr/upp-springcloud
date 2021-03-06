package com.upp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upp.baseClass.BaseAction;
import com.upp.constant.FundchannelCode;
import com.upp.constant.TransCode;
import com.upp.dto.Context;
import com.upp.dto.common.InputFundTrans;
import com.upp.exception.UppException;
import com.upp.feign.dto.fundprocess.RespRecharge;
import com.upp.service.RechargeService;

/**
 * 电子账户入账action
 * @author Administrator
 *
 */
@Component
public class CoreRechargeAction extends BaseAction {
	
	@Autowired
	private RechargeService rs;
	
	
	@Override
	public void excute(Context context) throws UppException {
		InputFundTrans input = (InputFundTrans) context.getInput();
		
		try {
			input.setFundchannelcode(FundchannelCode.CORE);
			input.setTranscode(TransCode.CORESETTLE);
			//落库
			rs.insertFundtrans(input);
			//发送下游
			RespRecharge resp = rs.sendEaccountRecharge(input, context);
			//更新库表
			rs.updateFundtrans(resp, input);
			rs.formatrespcontext(context, resp);
		} catch (Exception e) {
			exceptionHandler.handle(e, context);
		}
	}

}
