package com.levelup.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.levelup.Services.Services;

@CrossOrigin
@RestController
@RequestMapping("/mainapp")
public class UserController {
	@Autowired
	private Services User_Service;
}
