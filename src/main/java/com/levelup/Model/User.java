package com.levelup.Model;

import jakarta.persistence.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

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
	
	@Column(name="User_Points")
	private long User_Points;


	@ManyToMany
	@JoinTable(
			name = "user_course",
			joinColumns = @JoinColumn(name = "user_email"),
			inverseJoinColumns = @JoinColumn(name = "courses_id"))
	private Set<Courses> userCourses = new HashSet<>();
	

    public void completeQuiz(Courses course, int points) {
        if (userCourses.contains(course)) {
            this.User_Points += points;
        }
    }

}
