package com.full.stack.demon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.full.stack.demon.domain.Request;
import com.full.stack.demon.domain.Response;
import com.full.stack.demon.service.ITimeService;

@Controller
public class TimeController {
	
	@Autowired
	private ITimeService timeService;
	
	@PostMapping(value = "timeUtc")
	public ResponseEntity<Response> getTimeUtc(@RequestBody Request request) throws Exception{
		Response response = timeService.getTimeUtc(request);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
