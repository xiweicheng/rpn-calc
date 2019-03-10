package com.rpm.calc.operator;

import java.util.Stack;

import com.rpm.calc.Step;

public abstract class AbstractOperator implements IOperator {

	protected Stack<String> stack;
	protected Stack<Step> stackUndo;

	public AbstractOperator(Stack<String> stack, Stack<Step> stackUndo) {
		this.stack = stack;
		this.stackUndo = stackUndo;
	}

}
