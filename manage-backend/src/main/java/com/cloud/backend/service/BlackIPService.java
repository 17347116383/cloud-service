package com.cloud.backend.service;

import java.util.Map;

import com.cloud.backend.model.BlackIP;
import com.cloud.model.common.Page;
/**
 * 
* <p>Title: BlackIPService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author   

* @date   

* @version 1.0
 */
public interface BlackIPService {

	void save(BlackIP blackIP);

	void delete(String ip);

	Page<BlackIP> findBlackIPs(Map<String, Object> params);

}
