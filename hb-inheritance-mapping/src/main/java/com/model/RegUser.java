package com.model;
import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;
@Entity
@DiscriminatorValue(value="regular")
public class RegUser extends user 
{
	float salary;
	String dept;
	public RegUser(float salary, String dept, String name) 
	{
		super(name);
		this.salary = salary;
		this.dept = dept;
	}
	public float getSalary()
	{
		return salary;
	}
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	

}
