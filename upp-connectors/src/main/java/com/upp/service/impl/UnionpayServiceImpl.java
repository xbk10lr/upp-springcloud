package com.upp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqUnionPayDs;
import com.upp.feign.dto.connectors.ReqUnionPayQuery;
import com.upp.feign.dto.connectors.RespUnionQuery;
import com.upp.service.UnionpayService;
import com.upp.transport.Transport;
import com.upp.util.UppBeanUtils;

/**
 * 银联通信类
 * @author Administrator
 *
 */
@Service
public class UnionpayServiceImpl implements UnionpayService {
	
	@Autowired
	@Qualifier("UnionpayTransport")
	private Transport transport;
	
	/**
	 * 银联代收
	 * @return
	 */
	public RespUppHead unionDS(ReqUnionPayDs req){
		HashMap<String, Object> map = new HashMap<>();
		UppBeanUtils.transBean2Map(req, map);
		Map<String, Object> respMap = transport.send(map);
		RespUppHead resp = new RespUppHead();
		UppBeanUtils.transMap2Bean(respMap, resp);
		return resp;
	}
	
	
	/**
	 * 银联查询
	 * @return
	 */
	public RespUnionQuery unionQuery(ReqUnionPayQuery req){
		HashMap<String, Object> map = new HashMap<>();
		UppBeanUtils.transBean2Map(req, map);
		Map<String, Object> respMap = transport.send(map);
		RespUnionQuery resp = new RespUnionQuery();
		UppBeanUtils.transMap2Bean(respMap, resp);
		return resp;
	}
}
