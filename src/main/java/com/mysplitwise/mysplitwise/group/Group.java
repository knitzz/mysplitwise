package com.mysplitwise.mysplitwise.group;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.mysplitwise.mysplitwise.user.User;

@Entity
@Table(name = "Groups")
public class Group {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	public long getId() {
		return id;
	}
	@Column(name = "groupName")
	private String groupName;
	
	@ManyToMany
	private List<User> users;
	
	public void addUser(User user) {
		this.users.add(user);
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}
