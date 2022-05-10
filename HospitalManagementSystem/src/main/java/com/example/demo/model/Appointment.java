package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String date;
private String mno;
private String problem;
private String status;


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getMno() {
	return mno;
}
public void setMno(String mno) {
	this.mno = mno;
}
public String getProblem() {
	return problem;
}
public void setProblem(String problem) {
	this.problem = problem;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Appointment() {
	super();
	
}
public Appointment(Long id, String name, String date, String mno, String problem, String status) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
	this.mno = mno;
	this.problem = problem;
	this.status = status;
}


}
