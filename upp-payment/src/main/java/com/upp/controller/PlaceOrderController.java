package com.upp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upp.baseClass.Action;
import com.upp.dto.Context;
import com.upp.dto.common.InputPlaceOrder;
import com.upp.exception.UppExceptionHandler;
import com.upp.feign.dto.payment.ReqPlaceOrder;
import com.upp.feign.dto.payment.RespPlaceOrder;
import com.upp.feign.service.payment.PlaceOrder;
import com.upp.util.ValidationHandler;

@RestController
public class PlaceOrderController implements PlaceOrder{

	@Autowired
	@Qualifier("paymentCollectionAction")
	private Action paymentCollectionAction;
	
	@Autowired
	private UppExceptionHandler exceptionHandler;
	
	@Autowired
	private ValidationHandler validationHandler;
	
	/**
	 * 代收交易payment接口
	 */
	@RequestMapping("/placeOrder")
	public RespPlaceOrder placeOrder(ReqPlaceOrder req){
		Context context = new Context();
		try {
			validationHandler.validate(req);
			InputPlaceOrder input = new InputPlaceOrder(req);
			context.setInput(input);
			paymentCollectionAction.excute(context);
		} catch (Throwable e) {
//			异常处理
			exceptionHandler.handle(e, context);
		}
		RespPlaceOrder rpo = new RespPlaceOrder();
		rpo.setRespCode(context.getRespCode());
		rpo.setRespMsg(context.getRespMsg());
		rpo.setRespStatus(context.getRespStatus());
		return rpo;
	}
	
	
}
