package com.rpm.calc;

import java.util.Stack;

public abstract class AbstractOperator implements IOperator {

	protected Stack<String> stack;

	public AbstractOperator(Stack<String> stack) {
		this.stack = stack;
	}

	@Override
	public void print() {
		this.stack.forEach(item -> System.out.println(item));
	}

}
