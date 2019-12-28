package com.upp.feign.service.connectors;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqCoreQuery;
import com.upp.feign.dto.connectors.ReqCoreRecharge;
import com.upp.feign.dto.connectors.RespCoreQuery;

@FeignClient(name = "upp-connectors")
public interface CoreConnectorService {
	
	/**
	 * 核心入账
	 * @return
	 */
	@PostMapping(value = "/coreSettle")
	public RespUppHead coreSettle(@RequestBody ReqCoreRecharge req);
	
	/**
	 * 核心查询
	 * @return
	 */
	@PostMapping(value = "/coreQuery")
	public RespCoreQuery coreQuery(@RequestBody ReqCoreQuery req);
}
