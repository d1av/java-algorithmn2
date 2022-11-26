package entities;

public class User {
	private String name;
	private String email;
	private Double salary;

	public User(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalaray(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", salaray=" + salary + "]";
	}
	
	

}
