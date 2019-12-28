package com.upp.service;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqNetsUnionDs;
import com.upp.feign.dto.connectors.ReqNetsUnionQuery;
import com.upp.feign.dto.connectors.RespNetsUnionQuery;

/**
 * 网联通道
 * @author Administrator
 *
 */
public interface NetsunionService {
	
	/**
	 * 网联代收
	 * @return
	 */
	public RespUppHead netsDS(ReqNetsUnionDs req);
	
	/**
	 * 网联查询
	 * @return
	 */
	public RespNetsUnionQuery netsQuery(ReqNetsUnionQuery req);
}
