package com.example.demo.layer2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="subject")
public class Subject {

	@Id
	@Column(name="s_id")
	private int subjectId;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="levels")
	private int levels;
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subject") //one subject has Many question
//	private Set<Question> queSet = new HashSet<Question>();
//		
//		
//		
//		
//	public Set<Question> getQueSet() {
//	return queSet;
//		}
//		public void setQueSet(Set<Question> queSet) {
//			this.queSet = queSet;
//		}
//	
	
	

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getLevels() {
		return levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "subject") //one subject has Many question
	//private Set<Question> queSet = new HashSet<Question>();
	
	
	
	
//public Set<Question> getQueSet() {
	//	return queSet;
	//}
	//public void setQueSet(Set<Question> queSet) {
		//this.queSet = queSet;
	//}

}