package com.upp.service;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqCoreQuery;
import com.upp.feign.dto.connectors.ReqCoreRecharge;
import com.upp.feign.dto.connectors.RespCoreQuery;

public interface CoreService {

	/**
	 * 核心入账
	 * @return
	 */
	RespUppHead coreSettle(ReqCoreRecharge req);
	
	/**
	 * 核心查询
	 * @return
	 */
	RespCoreQuery coreQuery(ReqCoreQuery req);
}
