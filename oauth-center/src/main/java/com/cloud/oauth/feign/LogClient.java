package com.cloud.oauth.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cloud.model.log.Log;
/**
 * 
* <p>Title: LogClient.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author  hzh 

* @date 2019年3月5日  

* @version 1.0
 */
@FeignClient("log-center")
public interface LogClient {

	@PostMapping("/logs-anon/internal")
	void save(@RequestBody Log log);
}
