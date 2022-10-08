package com.masai.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private String content;
	private LocalDate date;
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Comment> comments;
	
	
}
