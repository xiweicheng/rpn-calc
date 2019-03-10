package com.rpm.calc;

import java.util.stream.Stream;

import com.rpm.calc.operator.Operator;

public final class Util {

	private Util() {
	}

	public static Operator toOperator(String operator) {

		return Stream.of(Operator.values()).filter(item -> item.getValue().equals(operator)).findFirst().get();

	}

	public static Double toDouble(String s) {

		return Double.parseDouble(s);

	}

	public static boolean isNumber(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			//			e.printStackTrace();

			return false;
		}
	}

	public static boolean isOperator(String operator) {
		return Stream.of(Operator.values()).anyMatch(item -> item.getValue().equals(operator));
	}

	public static String subZeroAndDot(Double v) {

		String s = v.toString();

		if (s.indexOf(".") > 0) {
			s = s.replaceAll("0+?$", "");//去掉多余的0
			s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
		}
		return s;
	}
}
