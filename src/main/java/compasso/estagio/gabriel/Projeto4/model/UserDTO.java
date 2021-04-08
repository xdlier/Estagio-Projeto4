package compasso.estagio.gabriel.Projeto4.model;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class UserDTO {

	@NotBlank
	private String name;

	@NotBlank
	private String lastname;

	@NotBlank
	private String email;

	@NotBlank
	@Length(max = 20, min = 8)
	private String password;

//	@NotBlank
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser(User user) {
		user.setEmail(this.email);
		user.setName(this.name);
		user.setLastname(this.lastname);
		user.setPassword(this.password);
		Role role = new Role();
		role.setRole(this.role);
		user.getRole().add(role);
		return user;
	}

}
