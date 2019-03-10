package com.rpm.calc;

public enum Operator {

	// 运算符号包括+, -, *, /, sqrt, undo, clear

	add("+"), minus("-"), plus("*"), divide("/"), sqrt("sqrt"), undo("undo"), clear("clear");

	private String value;

	private Operator(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
