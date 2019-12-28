package com.upp.feign.service.connectors;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqNetsUnionDs;
import com.upp.feign.dto.connectors.ReqNetsUnionQuery;
import com.upp.feign.dto.connectors.RespNetsUnionQuery;

/**
 * 网联通道
 * @author Administrator
 *
 */
@FeignClient(name = "upp-connectors")
public interface NetsunionConnectorService {
	
	/**
	 * 网联代收
	 * @return
	 */
	@PostMapping(value = "/netsDS")
	public RespUppHead netsDS(@RequestBody ReqNetsUnionDs req);
	
	/**
	 * 网联查询
	 * @return
	 */
	@PostMapping(value = "/netsQuery")
	public RespNetsUnionQuery netsQuery(@RequestBody ReqNetsUnionQuery req);
}
