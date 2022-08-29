package com.mpokketapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Loan {
	
	private Double amount;
	private String  loanType;
	@ManyToMany
	Set<User> user;
	
}
