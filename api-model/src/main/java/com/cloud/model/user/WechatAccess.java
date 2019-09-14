package com.cloud.model.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 *  微信网页授权access_token信息
* <p>Title: WechatAccess.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author  hzh 

* @date 2019年3月5日  

* @version 1.0
 */
@Getter
@Setter   
@ToString
public class WechatAccess implements Serializable {

    private static final long serialVersionUID = 6571363417369764704L;

    private String access_token;
    private int expires_in;
    private String refresh_token;
    private String openid;
    private String scope;
}
