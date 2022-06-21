package com.devsuperior.dslearnbds.entities.sevices.exceptions;

// tratar erros
public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
