package com.sitename.education.dao;

import java.util.List;

import com.sitename.education.entity.UserEntity;

public interface UserDao {

		//TODO :   Need to return long Id from for save, update
	
		public void save(UserEntity userEntity);
		public void update(UserEntity userEntity) ;
		public void delete(long id);
		public UserEntity findById(long id) ;
		public UserEntity findByUserId(String userId) ;
}
