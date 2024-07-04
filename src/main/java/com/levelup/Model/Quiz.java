package com.levelup.Model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Quiz {
	@Id
	private int Quiz_Id;
	private String Title;
	private int Total_Score;
	private long Points;
	
	@OneToMany
	private Set<Questions> Questions = new HashSet<>();
	
}
