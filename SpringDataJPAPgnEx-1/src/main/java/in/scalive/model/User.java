package in.scalive.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	private Integer id;
	private String name;
	private Double sal;
	private String email;
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
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sal=" + sal + ", email=" + email + "]";
	}

	
	
}
