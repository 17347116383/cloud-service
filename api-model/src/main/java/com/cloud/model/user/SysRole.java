package com.cloud.model.user;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 角色
* <p>Title: SysRole.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author  hzh 

* @date 

* @version 1.0
 */
@Data
public class SysRole implements Serializable {

	private static final long serialVersionUID = -2054359538140713354L;

	private Long id;
	private String code;
	private String name;
	private Date createTime;
	private Date updateTime;
}
