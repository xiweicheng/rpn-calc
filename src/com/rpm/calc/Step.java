package com.rpm.calc;

import com.rpm.calc.operator.Operator;

public class Step {

	public String a;
	public String b;

	public Operator operator;

	public Step(String a, String b, Operator operator) {
		super();
		this.a = a;
		this.b = b;
		this.operator = operator;
	}

	public Step(String a, Operator operator) {
		super();
		this.a = a;
		this.operator = operator;
	}

	public Step(String a) {
		super();
		this.a = a;
	}

}
