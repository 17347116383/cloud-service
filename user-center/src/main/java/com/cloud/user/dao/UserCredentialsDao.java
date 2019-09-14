package com.cloud.user.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cloud.model.user.AppUser;
import com.cloud.model.user.UserCredential;
/**
 * 
* <p>Title: UserCredentialsDao.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author  hzh 

* @date 2019年3月5日  

* @version 1.0
 */
@Mapper
public interface UserCredentialsDao {

	@Insert("insert into user_credentials(username, type, userId) values(#{username}, #{type}, #{userId})")
	int save(UserCredential userCredential);

	@Select("select * from user_credentials t where t.username = #{username}")
	UserCredential findByUsername(String username);

	@Select("select u.* from app_user u inner join user_credentials c on c.userId = u.id where c.username = #{username}")
	AppUser findUserByUsername(String username);
}
