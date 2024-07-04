package com.levelup.Model;

import jakarta.persistence.Id;

public class Answer {
	@Id
	private String Email;
	private long Course_Id;
	private long Total_Marks;
	private long Obtained_Marks;
	
}
