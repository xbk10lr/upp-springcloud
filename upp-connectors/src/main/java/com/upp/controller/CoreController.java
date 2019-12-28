package com.upp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqCoreQuery;
import com.upp.feign.dto.connectors.ReqCoreRecharge;
import com.upp.feign.dto.connectors.RespCoreQuery;
import com.upp.feign.service.connectors.CoreConnectorService;
import com.upp.service.CoreService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class CoreController implements  CoreConnectorService{
	
	@Autowired
	private CoreService coreService;
	
	@RequestMapping("/coreSettle")
	public RespUppHead coreSettle(@RequestBody ReqCoreRecharge req){
		log.info(req.getNbr());
		RespUppHead coreSettle = coreService.coreSettle(req);
		return coreSettle;
	}
	
	@RequestMapping("/coreQuery")
	public RespCoreQuery coreQuery(@RequestBody ReqCoreQuery req){
		RespCoreQuery coreQuery = coreService.coreQuery(req);
		return coreQuery;
	}
	
}
