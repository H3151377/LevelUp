package com.levelup.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.levelup.Dao.Dao;



@Service
public class UserService implements Services {
	@Autowired
	private Dao User_Dao;
}
