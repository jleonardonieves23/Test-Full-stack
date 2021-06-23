package com.full.stack.demon.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

import com.full.stack.demon.domain.Request;
import com.full.stack.demon.domain.Response;

@Service
public class TimeServiceImpl implements ITimeService {

	@Override
	public Response getTimeUtc(Request request) throws Exception {
		
		 SimpleDateFormat sdfOriginal = new SimpleDateFormat("HH:mm:ss");
	        sdfOriginal.setTimeZone(TimeZone.getTimeZone("GMT"));
	        Date date1 = sdfOriginal.parse(request.getTime());

	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(date1);
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	        
	        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		
		Response response = new Response();
		response.setTime(sdf.format(calendar.getTime()));
		response.setTimezone("utc");
		return response;
	}

}
