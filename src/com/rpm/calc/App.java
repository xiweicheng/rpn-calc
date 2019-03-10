package com.rpm.calc;

import java.util.Scanner;

public class App {

	static ICalc calc = new RpnCalc();

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			int index = 0;

			try {
				String line = scanner.nextLine();

				String item = "";

				for (int i = 0; i < line.length(); i++) {
					index = i;
					char s = line.charAt(index);
					if (s != ' ') {
						item = item + s;

						if (index == line.length() - 1) {
							calc(item);
							item = "";
						}
					} else {

						calc(item);
						item = "";
					}
				}

			} catch (Exception e) {
				System.err
						.println("operator " + e.getMessage() + " (position: " + index + "): insufficient parameters");
			}

			calc.print();

		}

	}

	public static void calc(String item) {

		if (!item.equals("")) {
			if (Util.isNumber(item)) {
				calc.add(item);
			} else if (Util.isOperator(item)) {
				calc.process(Util.toOperator(item));
			}
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