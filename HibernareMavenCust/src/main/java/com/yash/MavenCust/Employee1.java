package com.yash.MavenCust;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="harshada")
public class Employee1 {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" ,columnDefinition="INTEGER")
private int id;
	@Column(name="fName" ,columnDefinition="VARCHAR(25)")
private String firstName;
	@Column(name="lName" ,columnDefinition="VARCHAR(25)")
private String lastName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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



}
