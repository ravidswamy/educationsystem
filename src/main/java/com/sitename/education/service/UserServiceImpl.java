package com.sitename.education.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sitename.education.dao.UserDao;
import com.sitename.education.entity.UserEntity;

@SuppressWarnings("unused")
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao ;
	
	@Transactional
	public void save(UserEntity userEntity) {
		userDao.save(userEntity);
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void update(UserEntity userEntity) {
		// TODO Auto-generated method stub
		userDao.update(userEntity);
		
	}

	@Transactional
	public void delete(long id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
		
	}

	@Transactional
	public UserEntity findById(long id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	public UserEntity findByUserId(String userId) {
		// TODO Auto-generated method stub
		return userDao.findByUserId(userId) ;
	}


}
