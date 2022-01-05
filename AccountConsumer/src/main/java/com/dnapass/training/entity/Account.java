package com.dnapass.training.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "account100")

public class Account implements Serializable {
    
    @Id
    
    private Integer id;
    private String name;
    private Double salary;
    private String type;
    
    private LocalDate createDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public Account(Integer id, String name, Double salary, String type, LocalDate createDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.type = type;
		this.createDate = createDate;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    

 

}
