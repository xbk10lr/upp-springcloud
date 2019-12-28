package com.upp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqCoreRecharge;
import com.upp.feign.service.connectors.CoreConnectorService;

@RestController
public class TestConnectorsController {
	
	@Autowired
	private CoreConnectorService coreService;
	
	@RequestMapping("/test")
	public RespUppHead testCoreService(){
		ReqCoreRecharge req = new ReqCoreRecharge();
		req.setNbr("testFeign");
		return coreService.coreSettle(req);
	}
}
