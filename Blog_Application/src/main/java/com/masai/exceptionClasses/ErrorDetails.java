package com.masai.exceptionClasses;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorDetails {

	private LocalDate date;
	private String message;
	private String description;
	
}
