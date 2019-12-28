package com.upp.service;

import com.upp.feign.dto.RespUppHead;
import com.upp.feign.dto.connectors.ReqUnionPayDs;
import com.upp.feign.dto.connectors.ReqUnionPayQuery;
import com.upp.feign.dto.connectors.RespUnionQuery;

/**
 * 银联通信类
 * @author Administrator
 *
 */
public interface UnionpayService {
	
	/**
	 * 银联代收
	 * @return
	 */
	public RespUppHead unionDS(ReqUnionPayDs req);
	
	
	/**
	 * 银联查询
	 * @return
	 */
	public RespUnionQuery unionQuery(ReqUnionPayQuery req);
}
