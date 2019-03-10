package com.rpm.calc.operator;

import java.util.Stack;

import com.rpm.calc.Step;

public class ClearOperator extends AbstractOperator {

	public ClearOperator(Stack<String> stack, Stack<Step> stackUndo) {
		super(stack, stackUndo);
	}

	@Override
	public void calc() {

		this.stack.clear();
		this.stackUndo.clear();

	}

}
