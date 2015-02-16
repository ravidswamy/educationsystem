package com.sitename.education.service;

import java.util.List;

import com.sitename.education.entity.UserEntity;

public interface UserService {

	public void save(UserEntity userEntity);
	public void update(UserEntity userEntity) ;
	public void delete(long id);
	public UserEntity findById(long id) ;
	public UserEntity findByUserId(String userId) ;
}
