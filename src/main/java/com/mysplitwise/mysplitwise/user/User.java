package com.mysplitwise.mysplitwise.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.mysplitwise.mysplitwise.group.Group;

@Entity
@Table(name = "SUser")
public class User{

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "firstname")
private String firstName;
@Column(name = "lastname")
private String lastName;
@ManyToMany(mappedBy="users")
private List<Group> groups;
//Setters, getters and constructors
}