package com.upp.feign.service.payment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.upp.feign.dto.payment.ReqPlaceOrder;
import com.upp.feign.dto.payment.RespPlaceOrder;

@FeignClient(name = "upp-payment")
public interface PlaceOrder {
	
	/**
	 * 订单登记
	 * @param req
	 * @return
	 */
	@PostMapping(value = "/placeOrder")
	public RespPlaceOrder placeOrder(ReqPlaceOrder req);
}
