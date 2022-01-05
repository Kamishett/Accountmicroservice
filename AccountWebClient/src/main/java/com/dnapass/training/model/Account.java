package com.dnapass.training.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;





//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Account implements Serializable{
	private int id;
	@NotEmpty(message="{name.not.empty}")
	@Size(min=6,max=12,message="{name.size}")
	private String name;
    @NotNull(message="{salary.not.null}")
	private double salary;
    
	private String type;
	@NotNull(message="{createDate.not.null}")
	@Past(message="{createDate.past}")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate createDate;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
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
	public Account(int id, String name, double salary, String type, LocalDate createDate) {
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
