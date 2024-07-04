package com.levelup.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.levelup.Services.Services;


@Controller
public class UserController {
	@Autowired
	private Services User_Service;
}
