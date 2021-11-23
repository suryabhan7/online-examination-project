package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class StudentTable {
	
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String fullName;
	
	@Column(name="phoneno")
	private int phoneNumber;
	
	@Column(name="dob")
	private int dob;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="year")
	private int yearOfQualification;
	
	@Column(name="locid")
	private int locID;
	
		@OneToOne
		private UserID userid;
		
		public UserID getUserid() {
			return userid;
		}

		public void setUserid(UserID userid) {
			this.userid = userid;
		}
		
		
		
		
		

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public int getDob() {
			return dob;
		}

		public void setDob(int dob) {
			this.dob = dob;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public int getYearOfQualification() {
			return yearOfQualification;
		}

		public void setYearOfQualification(int yearOfQualification) {
			this.yearOfQualification = yearOfQualification;
		}

		public int getLocID() {
			return locID;
		}

		public void setLocID(int locID) {
			this.locID = locID;
		}

//		public UserID getUserid() {
//			return userid;
//		}
//
//		public void setUserid(UserID userid) {
//			this.userid = userid;
//		}
		
		

	
	
	
	

}
