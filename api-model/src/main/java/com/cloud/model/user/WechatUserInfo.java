package com.cloud.model.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 微信个人用户信息
* <p>Title: WechatUserInfo.java</p>  

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
public class WechatUserInfo implements Serializable {

    private static final long serialVersionUID = 6750304307961875043L;

    private Long id;
    private String openid;
    private String unionid;
    private Long userId;
    private String app;
    private String nickname;
    private String sex;
    private String province;
    private String city;
    private String country;
    private String headimgurl;
    private Date createTime;
    private Date updateTime;
}
