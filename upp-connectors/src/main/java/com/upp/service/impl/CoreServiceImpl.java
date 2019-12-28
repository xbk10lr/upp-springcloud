package com.upp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.upp.constant.EaccountRespStatus;
import com.upp.constant.TransStatus;
import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqCoreQuery;
import com.upp.feign.dto.connectors.ReqCoreRecharge;
import com.upp.feign.dto.connectors.RespCoreQuery;
import com.upp.service.CoreService;
import com.upp.transport.Transport;

@Service
public class CoreServiceImpl implements CoreService {
	
	@Autowired
	@Qualifier("CoreTransport")
	private Transport transport;
	
	/**
	 * 核心入账
	 * @return
	 */
	@Override
	public RespUppHead coreSettle(ReqCoreRecharge req){
		
		RespUppHead resp = new RespUppHead();
		resp.setRespCode("000000");
		resp.setRespMsg("交易成功");
		resp.setRespStatus(TransStatus.SUCCESS);
		return resp;
	}
	
	/**
	 * 核心查询
	 * @return
	 */
	@Override
	public RespCoreQuery coreQuery(ReqCoreQuery req){
		RespCoreQuery resp = new RespCoreQuery();
		resp.setRespCode("000000");
		resp.setRespMsg("查询成功");
		resp.setRespStatus(EaccountRespStatus.SUCCESS);
		resp.setOrigRespStatus(EaccountRespStatus.SUCCESS);
		resp.setOrigRespMsg("原交易成功");
		resp.setOrigRespCode("000000");
		return resp;
	}
}
