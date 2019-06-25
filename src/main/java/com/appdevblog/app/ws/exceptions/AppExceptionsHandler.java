package com.appdevblog.app.ws.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.appdevblog.app.ws.ui.model.response.ErrorMessage;


@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value= {NullPointerException.class})
	public ResponseEntity<Object> handleNullpointer(NullPointerException ex,WebRequest request){
		
		String errorMessageString=ex.getLocalizedMessage();
		
		if(errorMessageString==null) errorMessageString=ex.toString();
		
		ErrorMessage errorMessage = new ErrorMessage(new Date(),errorMessageString);
		
		return new ResponseEntity<>(
				errorMessage,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
