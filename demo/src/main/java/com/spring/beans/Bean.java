package com.spring.beans;

public class Bean {
	
	private Integer id;
	private String Name;
	private Integer DepId;
	private Double salary;
	
	public Bean() {
		
	}

	public Bean(Integer id, String name, Integer depId, Double salary) {
		super();
		this.id = id;
		Name = name;
		DepId = depId;
		this.salary = salary;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getDepId() {
		return DepId;
	}

	public void setDepId(Integer depId) {
		DepId = depId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Bean [id=" + id + ", Name=" + Name + ", DepId=" + DepId + ", salary=" + salary + "]";
	}
	

}
