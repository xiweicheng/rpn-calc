package com.rpm.calc.ex;

public class OperatorErrExecption extends RuntimeException {

	private static final long serialVersionUID = -3050984813526935655L;

	public OperatorErrExecption() {
		super();
	}

	public OperatorErrExecption(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public OperatorErrExecption(String message, Throwable cause) {
		super(message, cause);
	}

	public OperatorErrExecption(String message) {
		super(message);
	}

	public OperatorErrExecption(Throwable cause) {
		super(cause);
	}

}
