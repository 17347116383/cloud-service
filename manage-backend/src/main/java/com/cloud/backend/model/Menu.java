package com.cloud.backend.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
/**
 * 
* <p>Title: Menu.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author  

* @date   

* @version 1.0
 */
@Data
public class Menu implements Serializable {

	private static final long serialVersionUID = 749360940290141180L;

	private Long id;
	private Long parentId;
	private String name;
	private String css;
	private String url;
	private Integer sort;
	private Date createTime;
	private Date updateTime;

	private List<Menu> child;
}
