package com.cloud.model.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 *  微信appid和secret对象
* <p>Title: WechatInfo.java</p>  

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
public class WechatInfo implements Serializable {

    private static final long serialVersionUID = 3511834512371404079L;

    private String appid;
    private String secret;
}
