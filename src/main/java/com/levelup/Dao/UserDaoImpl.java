package com.levelup.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.levelup.Jpa.UserJpa;

@Repository
public class UserDaoImpl implements Dao{
	@Autowired
	private UserJpa User_Jpa;

}
