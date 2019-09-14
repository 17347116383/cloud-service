package com.cloud.file.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
/**
 * 
* <p>Title: FileInfo.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author   

* @date 

* @version 1.0
 */
@Data
public class FileInfo implements Serializable {

	private static final long serialVersionUID = -1438078028040922174L;

	/** 文件的md5 */
	private String id;
	/** 原始文件名 */
	private String name;
	/** 是否是图片 */
	private Boolean isImg;
	private String contentType;
	private long size;
	private String path;
	private String url;
	/**
	 * 文件来源
	 * 
	 * @see FileSource
	 */
	private String source;
	private Date createTime;
}
