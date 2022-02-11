package com.example.lesson06.model;

import java.util.Date;

public class Booking {
	private int id;
	private String name;
	private Integer num_days; 
	private Integer num_guests;
	private String phoneNumber;
	private String status;
	private Date createdAt;
	private Date updatedAt;
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
	public Integer getNum_days() {
		return num_days;
	}
	public void setNum_days(Integer num_days) {
		this.num_days = num_days;
	}
	public Integer getNum_guests() {
		return num_guests;
	}
	public void setNum_guests(Integer num_guests) {
		this.num_guests = num_guests;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
