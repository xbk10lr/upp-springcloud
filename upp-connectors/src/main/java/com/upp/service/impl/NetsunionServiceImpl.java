package com.upp.service.impl;

import org.springframework.stereotype.Service;

import com.upp.constant.UnionpayRespStatus;
import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqNetsUnionDs;
import com.upp.feign.dto.connectors.ReqNetsUnionQuery;
import com.upp.feign.dto.connectors.RespNetsUnionQuery;
import com.upp.service.NetsunionService;

/**
 * 网联通道
 * @author Administrator
 *
 */
@Service
public class NetsunionServiceImpl implements NetsunionService {
	
	/**
	 * 网联代收
	 * @return
	 */
	public RespUppHead netsDS(ReqNetsUnionDs req){
		RespUppHead resp = new RespUppHead();
		resp.setRespCode("000000");
		resp.setRespMsg("交易成功");
		return resp;
	}
	
	/**
	 * 网联查询
	 * @return
	 */
	public RespNetsUnionQuery netsQuery(ReqNetsUnionQuery req){
		RespNetsUnionQuery resp = new RespNetsUnionQuery();
		resp.setRespCode("000000");
		resp.setRespMsg("查询成功");
		resp.setRespStatus(UnionpayRespStatus.SUCCESS);
		resp.setOrigRespStatus(UnionpayRespStatus.SUCCESS);
		resp.setOrigRespMsg("原交易成功");
		resp.setOrigRespCode("000000");
		return resp;
	}
}
