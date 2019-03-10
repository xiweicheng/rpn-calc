package com.rpm.calc.operator;

import java.util.Stack;

import com.rpm.calc.Step;

public class UndoOperator extends AbstractOperator {

	public UndoOperator(Stack<String> stack, Stack<Step> stackUndo) {
		super(stack, stackUndo);
	}

	@Override
	public void calc() {

		if (this.stackUndo.size() < 1) {
			return;
		}

		Step step = this.stackUndo.pop();

		if (step.operator == null) {
			this.stack.pop();
		} else {
			if (step.a != null && step.b != null) {
				this.stack.pop();
				this.stack.push(step.a);
				this.stack.push(step.b);
			}
		}

	}

}
