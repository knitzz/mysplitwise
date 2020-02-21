package com.mysplitwise.mysplitwise.balance;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="balance")
public class balance {
	
	@Column(name="id", insertable=false, updatable=false)
	@EmbeddedId 
	private Groupuserembeded id;
	
	private double balance;
	public Groupuserembeded getGroupuserembeded() {
		return id;
	}

	public void setGroupuserembeded(Groupuserembeded groupuserembeded) {
		this.id = groupuserembeded;
	}
	public balance() {}

	public balance(Groupuserembeded groupuserembeded, double balance) {
		super();
		this.id = groupuserembeded;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	} 
}
