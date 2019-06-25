package com.appdevblog.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
    @NotNull(message = "Primer nombre no puede ser nulo")
	private String firsNameString;
    @NotNull(message = "Apellido no puede ser nulo")
	private String lastName;
    @NotNull(message = "Email no puede ser nulo")
    @Email
	private String email;
    @NotNull(message = "Password nombre no puede ser nulo")
    @Size(min=8,max = 16 , message = "El passworde debe tener entre 8 y 16 caracteres")
	private String password;
	public String getFirsNameString() {
		return firsNameString;
	}
	public void setFirsNameString(String firsNameString) {
		this.firsNameString = firsNameString;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
}
