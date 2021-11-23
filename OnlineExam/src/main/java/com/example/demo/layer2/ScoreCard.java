package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="scorecard")
public class ScoreCard {
	
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="subjectid")
	private int subjectId;
	
	@Column(name="score")
	private int score;
	
	@Column(name="DOE")
	private LocalDate dateOfExam;
	
	@Column(name="status")
	private String status;
	
//	@ManyToOne
//	@JoinColumn(name="subject") // FK 
//	private Subject subj;
//	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LocalDate getDateOfExam() {
		return dateOfExam;
	}

	public void setDateOfExam(LocalDate dateOfExam) {
		this.dateOfExam = dateOfExam;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	//@ManyToOne
	//@JoinColumn(name="subject") // FK for emp table
	//private Subject subj;
	
	



}