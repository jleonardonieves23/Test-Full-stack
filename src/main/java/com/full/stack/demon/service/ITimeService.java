package com.full.stack.demon.service;

import com.full.stack.demon.domain.Request;
import com.full.stack.demon.domain.Response;

public interface ITimeService {
	
	Response getTimeUtc(Request request) throws Exception;

}
