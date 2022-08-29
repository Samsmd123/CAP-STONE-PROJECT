package com.mpokketapp.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class User {
	private String userName;
	private String userId;
	private LocalDate dob;
	private String  userType;

	@ManyToOne
	private Bank bank;

}
