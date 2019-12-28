package com.upp.feign.service.fundprocess;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.upp.feign.dto.fundprocess.ReqFundCollection;
import com.upp.feign.dto.fundprocess.ReqRecharge;
import com.upp.feign.dto.fundprocess.RespFundCollection;
import com.upp.feign.dto.fundprocess.RespRecharge;

/**
 * 资金交易dubbo接口
 * @author Administrator
 *
 */
@FeignClient(name = "upp-fundprocess")
public interface FundTrans {

	/**
	 * 代收交易
	 * @param req
	 * @return
	 */
	@PostMapping(value = "/fundCollection")
	public RespFundCollection fundCollection(ReqFundCollection req);
	
	/**
	 * 充值交易
	 * @param req
	 * @return
	 */
	@PostMapping(value = "/recharge")
	public RespRecharge recharge(ReqRecharge req);
}
