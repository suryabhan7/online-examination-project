package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="userid")
public class UserID {
	
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private String userId;
	
	@Column(name="sno")
	private int sNo;
	
	@Column(name="pass")
	private String password;
	
	@OneToOne
	private StudentTable studenttable;
	
	
	

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public StudentTable getStudenttable() {
		return studenttable;
	}

	public void setStudenttable(StudentTable studenttable) {
		this.studenttable = studenttable;
	}
	
	

	
	
	//@OneToOne
	//private StudentTable studenttable;
	
	
	//
	

}
