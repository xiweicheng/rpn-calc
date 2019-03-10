package com.rpm.calc.operator;

import java.util.Stack;

import com.rpm.calc.Step;
import com.rpm.calc.Util;
import com.rpm.calc.ex.OperatorErrException;

public class SqrtOperator extends AbstractOperator {

	public SqrtOperator(Stack<String> stack, Stack<Step> stackUndo) {
		super(stack, stackUndo);
	}

	@Override
	public void calc() {

		if (this.stack.size() < 1) {
			throw new OperatorErrException("sqrt");
		}

		String a = this.stack.pop();

		Double r = Math.sqrt(Util.toDouble(a));

		this.stackUndo.push(new Step(a, Operator.sqrt));

		this.stack.push(Util.subZeroAndDot(r));

	}

}
