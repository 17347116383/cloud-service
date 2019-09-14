package com.cloud.model.user;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 权限标识
 * 
 * @author 
 *@Data  get 与set方法  @NoArgsConstructor 无参的构造    @AllArgsConstructor有 参的构造
 */
@Data
public class SysPermission implements Serializable {

	private static final long serialVersionUID = 280565233032255804L;

	private Long id;
	private String permission;
	private String name;
	private Date createTime;
	private Date updateTime;

}
