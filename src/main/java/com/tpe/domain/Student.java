package com.tpe.domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "First name can not be null")
	@NotBlank(message = "First Name can not be white space")
	@Size(min = 1,max = 100,message = "First Name '${validatedValue}' must be between {min} and {max} chars long")
	@Column(length = 100,nullable = false)
	private String fistName;

	@Column(length = 100,nullable = false)
	private String lastName;

	private Integer grade;



	@Email(message = "Provide valid Email")
	@Column(length = 100,nullable = false,unique = true)
	private String email;

	//555-555-5555  'regullar expression'
	@Pattern(regexp = "^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$", message = "Please provide valid phone number")
	@Column(length = 14)
	private String phoneNumber;

	private LocalDateTime createDate=LocalDateTime.now();



}