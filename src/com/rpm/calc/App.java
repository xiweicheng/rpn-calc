package com.rpm.calc;

import java.util.Scanner;

public class App {

	static ICalc calc = new RpnCalc();

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			String line = scanner.nextLine();

			String[] items = line.split("\\s+");

			for (String item : items) {

				if (Util.isNumber(item)) {
					calc.add(item);
				} else if (Util.isOperator(item)) {
					calc.process(Util.toOperator(item));
				}

			}

			calc.print();
			
			System.out.println();
			System.err.println();
		}

	}

}

//测试用例：
//==
//1.
//输入：1 2 3 4 5
//输出：stack: 1 2 3 4 5 
//输入：*
//输出：stack: 1 2 3 20 
//输入：clear 3 4 - 
//输出：stack: - 1