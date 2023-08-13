package com.briz.validateDT;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity(name="student")
public class Student 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;

@Temporal(TemporalType.DATE)
@JsonFormat(pattern="dd-MM-yyyy") // works well with postman
// above annotation must be used with temporal and month name must be in capital
@PastOrPresent(message="date must be into past")
private Date dob;

@Temporal(TemporalType.TIME)
private Date createdtime;

@Temporal(TemporalType.TIMESTAMP)
private Date updatedtime;

@JsonFormat(pattern="yyyy-MM-dd")
//@DateTimeFormat (pattern = "dd-mm-yyyy")
private Date created_At;

public Date getCreated_At() {
	return created_At;
}
public void setCreated_At(Date created_At) {
	this.created_At = created_At;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Date getCreatedtime() {
	return createdtime;
}
public void setCreatedtime(Date createdtime) {
	this.createdtime = createdtime;
}
public Date getUpdatedtime() {
	return updatedtime;
}
public void setUpdatedtime(Date updatedtime) {
	this.updatedtime = updatedtime;
}
}
