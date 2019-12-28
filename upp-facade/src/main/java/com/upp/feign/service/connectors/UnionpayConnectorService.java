package com.upp.feign.service.connectors;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqUnionPayDs;
import com.upp.feign.dto.connectors.ReqUnionPayQuery;
import com.upp.feign.dto.connectors.RespUnionQuery;

/**
 * 银联通信类
 * @author Administrator
 *
 */
@FeignClient(name = "upp-connectors")
public interface UnionpayConnectorService {
	
	/**
	 * 银联代收
	 * @return
	 */
	@PostMapping(value = "/unionDS")
	public RespUppHead unionDS(@RequestBody ReqUnionPayDs req);
	
	
	/**
	 * 银联查询
	 * @return
	 */
	@PostMapping(value = "/unionQuery")
	public RespUnionQuery unionQuery(@RequestBody ReqUnionPayQuery req);
}
