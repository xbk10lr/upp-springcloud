package com.upp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqNetsUnionDs;
import com.upp.feign.dto.connectors.ReqNetsUnionQuery;
import com.upp.feign.dto.connectors.RespNetsUnionQuery;
import com.upp.feign.service.connectors.NetsunionConnectorService;
import com.upp.service.NetsunionService;

@RestController
public class NetunionController implements NetsunionConnectorService{
	
	@Autowired
	private NetsunionService netsunionService;
	
	@RequestMapping("/netsDS")
	public RespUppHead netsDS(@RequestBody ReqNetsUnionDs req){
		RespUppHead netsDS = netsunionService.netsDS(req);
		return netsDS;
	}
	
	@RequestMapping("/netsQuery")
	public RespNetsUnionQuery netsQuery(@RequestBody ReqNetsUnionQuery req){
		RespNetsUnionQuery netsQuery = netsunionService.netsQuery(req);
		return netsQuery;
	}
	
}
