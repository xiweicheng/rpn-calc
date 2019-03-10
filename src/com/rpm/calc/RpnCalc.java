package com.rpm.calc;

import java.util.Stack;

import com.rpm.calc.operator.AddOperator;
import com.rpm.calc.operator.ClearOperator;
import com.rpm.calc.operator.DivideOperator;
import com.rpm.calc.operator.MinusOperator;
import com.rpm.calc.operator.Operator;
import com.rpm.calc.operator.PlusOperator;
import com.rpm.calc.operator.SqrtOperator;
import com.rpm.calc.operator.UndoOperator;

public class RpnCalc implements ICalc {

	private Stack<String> stack = new Stack<>();
	private Stack<Step> stackUndo = new Stack<>();

	@Override
	public void process(Operator operator) {

		if (operator.equals(Operator.add)) {
			new AddOperator(stack, stackUndo).calc();
		} else if (operator.equals(Operator.minus)) {
			new MinusOperator(stack, stackUndo).calc();
		} else if (operator.equals(Operator.plus)) {
			new PlusOperator(stack, stackUndo).calc();
		} else if (operator.equals(Operator.divide)) {
			new DivideOperator(stack, stackUndo).calc();
		} else if (operator.equals(Operator.sqrt)) {
			new SqrtOperator(stack, stackUndo).calc();
		} else if (operator.equals(Operator.undo)) {
			new UndoOperator(stack, stackUndo).calc();
		} else if (operator.equals(Operator.clear)) {
			new ClearOperator(stack, stackUndo).calc();
		}

	}

	@Override
	public void add(String num) {

		this.stack.push(num);
		
		this.stackUndo.push(new Step(num));

	}

	@Override
	public void print() {
		System.out.print("stack: ");
		this.stack.forEach(item -> System.out.print(item + " "));
		System.out.println();
	}

}
