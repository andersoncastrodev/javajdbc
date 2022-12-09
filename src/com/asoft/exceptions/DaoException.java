package com.asoft.exceptions;

public class DaoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DaoException(String mens, Throwable t) {
		super(mens, t);
	}
}
