package com.levelup.Model;

import jakarta.persistence.*;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
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

	@ManyToMany
	@JoinTable(
			name = "user_course",
			joinColumns = @JoinColumn(name = "user_email"),
			inverseJoinColumns = @JoinColumn(name = "courses_id"))
	private Set<Courses> userCourses = new HashSet<>();
	
	
}
