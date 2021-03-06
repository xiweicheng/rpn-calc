package com.rpm.calc.operator;

import java.util.Stack;

import com.rpm.calc.Step;
import com.rpm.calc.Util;
import com.rpm.calc.ex.OperatorErrException;

public class DivideOperator extends AbstractOperator {

	public DivideOperator(Stack<String> stack, Stack<Step> stackUndo) {
		super(stack, stackUndo);
	}

	@Override
	public void calc() {

		if (this.stack.size() < 2) {
			throw new OperatorErrException("/");
		}

		String b = this.stack.pop();
		String a = this.stack.pop();

		Double r = Util.toDouble(a) / Util.toDouble(b);
		
		this.stackUndo.push(new Step(a, b, Operator.divide));

		this.stack.push(Util.subZeroAndDot(r));

	}

}
