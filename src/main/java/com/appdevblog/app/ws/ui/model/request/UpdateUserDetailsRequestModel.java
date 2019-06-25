package com.appdevblog.app.ws.ui.model.request;

import javax.validation.constraints.NotNull;

public class UpdateUserDetailsRequestModel {
	    @NotNull(message = "Primer nombre no puede ser nulo")
		private String firsNameString;
	    @NotNull(message = "Apellido no puede ser nulo")
		private String lastName;
	    
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
}
