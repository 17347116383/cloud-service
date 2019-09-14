package com.cloud.file.service;

import org.springframework.web.multipart.MultipartFile;

import com.cloud.file.model.FileInfo;
/**
 * 
* <p>Title: FileService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author  上传文件

* @date  

* @version 1.0
 */
public interface FileService {

	/**
	 * 上传文件
	 *
	 * @param file
	 * @return
	 * @throws Exception
	 */
	FileInfo upload(MultipartFile file) throws Exception;

	/**
	 * 删除文件
	 *
	 * @param fileInfo
	 */
	void delete(FileInfo fileInfo);

}
