package com.upp.transport;

import java.util.Map;

public interface Transport {

	public Map<String,Object> send(Map<String,Object> req);
}
