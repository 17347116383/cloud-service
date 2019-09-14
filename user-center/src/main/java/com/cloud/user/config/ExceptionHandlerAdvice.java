package com.cloud.user.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
/**
 * 
* <p>Title: ExceptionHandlerAdvice.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author 

* @date 2019年3月5日  
* 全局异常
* @version 1.0
 */
@RestControllerAdvice   //)拦截异常并统一处理
public class ExceptionHandlerAdvice {

	@ExceptionHandler({ IllegalArgumentException.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String, Object> badRequestException(IllegalArgumentException exception) {
		Map<String, Object> data = new HashMap<>();
		data.put("code", HttpStatus.BAD_REQUEST.value());
		data.put("message", exception.getMessage());

		return data;
	}
}
