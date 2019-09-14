package com.cloud.user.config;

import com.cloud.model.user.WechatInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
/**
 * 
* <p>Title: WechatConfig.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author

* @date 2019年3月5日  

* @version 1.0
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "wechat")
public class WechatConfig {

    private String domain;
    private Map<String, WechatInfo> infos;

}
