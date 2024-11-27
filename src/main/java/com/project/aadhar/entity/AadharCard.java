package com.project.aadhar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AadharCard")
public class AadharCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(nullable = false, unique = true)
	private String aadharNumber;
    
    @Column(nullable = false)
	private String name;
    
    @Column(nullable = false)
	private String address;
    
    @Column(nullable = false)
	private String phoneNumber;
    
public AadharCard() {
	// TODO Auto-generated constructor stub
}

public AadharCard(String aadharNumber, String name, String address, String phoneNumber) {
	super();
	this.aadharNumber = aadharNumber;
	this.name = name;
	this.address = address;
	this.phoneNumber = phoneNumber;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getAadharNumber() {
	return aadharNumber;
}

public void setAadharNumber(String aadharNumber) {
	this.aadharNumber = aadharNumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

}
