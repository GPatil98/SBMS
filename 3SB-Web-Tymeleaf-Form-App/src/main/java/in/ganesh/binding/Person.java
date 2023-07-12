package in.ganesh.binding;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Person {
	
	@NotNull
	@Min(18)
	private Integer age;

	@NotNull
	@Size(min = 3, max = 8)
	private String name;
	
	
	public Person() {
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	

}
