package com.mysplitwise.mysplitwise.balance;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.mysplitwise.mysplitwise.group.Group;
import com.mysplitwise.mysplitwise.user.User;

@Embeddable
public class Groupuserembeded implements Serializable {
	 @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	  @JoinColumn( referencedColumnName ="id")
	private User user;
	 
	public Groupuserembeded() {
		super();
		// TODO Auto-generated constructor stub
	}

	 @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	  @JoinColumn(referencedColumnName ="id")
	private Group group;

	
	public Groupuserembeded (User user,Group group) {
		super();
		this.user=user;
		this.group=group;
	}

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Group getGroup() {
		return group;
	}


	public void setGroup(Group group) {
		this.group = group;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	
}
