package com.ecodoc.backend.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class RestForbidden extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RestForbidden(String message) {
		super(message);
	}


}
