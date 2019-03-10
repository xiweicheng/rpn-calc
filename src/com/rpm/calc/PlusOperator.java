package com.rpm.calc;

import java.util.Stack;

public class PlusOperator extends AbstractOperator {

	public PlusOperator(Stack<String> stack) {
		super(stack);
	}

	@Override
	public void calc() {

		// operator <operator> (position: <pos>): insufficient parameters
		if (this.stack.size() < 2) {
			System.err.println("operator + (position: " + this.stack.size() + "): insufficient parameters");
			print();
			return;
		}

		String b = this.stack.pop();
		String a = this.stack.pop();

		Double r = Util.toDouble(a) + Util.toDouble(b);
		
		System.out.println(r);

		this.stack.push(Util.subZeroAndDot(r));

	}

}
