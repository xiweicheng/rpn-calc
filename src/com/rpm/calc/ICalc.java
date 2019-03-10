package com.rpm.calc;

import com.rpm.calc.operator.Operator;

interface ICalc {
	
	void add(String num);

	void process(Operator operator);
	
	void print();

}
