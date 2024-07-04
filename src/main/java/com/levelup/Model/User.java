package com.levelup.Model;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@Repository
public class User {
	
	@Id
	@Column(name="User_Email")
	private String User_Email;
	@Column(name="User_Name")
	private String User_Name;
	@Column(name="User_Password")
	private String User_Password;
	@Column(name="User_UserType")
	private String User_UserType;
	
	@Column(name="User_Course")
	private List User_Course;
	
	
	
	
	
}
