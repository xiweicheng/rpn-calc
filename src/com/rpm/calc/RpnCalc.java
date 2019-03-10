package com.rpm.calc;

import java.util.Stack;

public class RpnCalc implements ICalc {

	//	private Queue<String> stack = new LinkedList<>();

	private Stack<String> stack = new Stack<>();

	@Override
	public void process(Operator operator) {

		if (operator.equals(Operator.add)) {
			new AddOperator(stack).calc();
		} else if (operator.equals(Operator.minus)) {
			new MinusOperator(stack).calc();
		}

	}

	@Override
	public void add(String num) {

		this.stack.push(num);

	}

	@Override
	public void print() {
		this.stack.forEach(item -> System.out.println(item));
		//		this.stack.stream().peek(System.out::println);
	}

}
