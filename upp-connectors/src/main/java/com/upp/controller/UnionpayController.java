package com.upp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqUnionPayDs;
import com.upp.feign.dto.connectors.ReqUnionPayQuery;
import com.upp.feign.dto.connectors.RespUnionQuery;
import com.upp.feign.service.connectors.UnionpayConnectorService;
import com.upp.service.UnionpayService;

@RestController
public class UnionpayController implements UnionpayConnectorService{
	
	@Autowired
	private UnionpayService unionpayService;
	
	@RequestMapping("/unionDS")
	public RespUppHead unionDS(ReqUnionPayDs req){
		RespUppHead unionDS = unionpayService.unionDS(req);
		return unionDS;
	}
	
	@RequestMapping("/unionQuery")
	public RespUnionQuery unionQuery(ReqUnionPayQuery req){
		RespUnionQuery unionQuery = unionpayService.unionQuery(req);
		return unionQuery;
	}
	
}
