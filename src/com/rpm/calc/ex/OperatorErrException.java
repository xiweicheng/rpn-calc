package com.rpm.calc.ex;

public class OperatorErrException extends RuntimeException {

	private static final long serialVersionUID = -3050984813526935655L;

	public OperatorErrException() {
		super();
	}

	public OperatorErrException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public OperatorErrException(String message, Throwable cause) {
		super(message, cause);
	}

	public OperatorErrException(String message) {
		super(message);
	}

	public OperatorErrException(Throwable cause) {
		super(cause);
	}

}
