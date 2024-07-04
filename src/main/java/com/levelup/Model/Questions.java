package com.levelup.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Questions {
	@Id
	private int Question_Id;
	private String Question;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String Correct_Answer;
	
}
