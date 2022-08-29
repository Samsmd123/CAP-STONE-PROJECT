package com.mpokketapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	private String bankName;
	private Integer bankId;
	private String branch;
	@OneToMany
	Set<Loan> loan;
	@OneToMany
	Set<User> user;

}
