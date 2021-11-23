package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {
	
	
	@Id
	@Column(name="subjectid")
	private int subject_id;
	
	@Column(name="que")
	private String question;
	
	@Column(name="op1")
	private String option1;
	
	@Column(name="op2")
	private String option2;
	
	@Column(name="op3")
	private String option3;
	
	@Column(name="op4")
	private String option4;
	
	@Column(name="ans")
	private String answer;

	
//	@ManyToOne
//	@JoinColumn(name="subject") // FK for  table
//	private Subject subj;
//	
	

//
	public int getSubject_id() {
		return subject_id;
	}


	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getOption1() {
		return option1;
	}


	public void setOption1(String option1) {
		this.option1 = option1;
	}


	public String getOption2() {
		return option2;
	}


	public void setOption2(String option2) {
		this.option2 = option2;
	}


	public String getOption3() {
		return option3;
	}


	public void setOption3(String option3) {
		this.option3 = option3;
	}


	public String getOption4() {
		return option4;
	}


	public void setOption4(String option4) {
		this.option4 = option4;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	
	
	
}
