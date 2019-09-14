package com.cloud.model.user;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户账号类型
 * 
 * @author 
 *
 */

@Data //@Data  get 与set方法  @NoArgsConstructor 无参的构造    @AllArgsConstructor有 参的构造
@NoArgsConstructor
@AllArgsConstructor
public class UserCredential implements Serializable {

	private static final long serialVersionUID = -958701617717204974L;

	private String username;
	/**
	 * @see com.cloud.model.user.constants.CredentialType
	 */
	private String type;
	private Long userId;

}
