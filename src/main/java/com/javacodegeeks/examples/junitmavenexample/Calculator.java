package com.javacodegeeks.examples.junitmavenexample;

public class Calculator implements ICalculator {

	@Override
	public int sum(int a, int b, int c) { /*added c*/
		return a + b;
	}

	@Override
	public int subtraction(int a, int b, int d) { /*added d*/
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public int divison(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;
	}

	@Override
	public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
		/*return null;  /* commneted the above line and added 3 lines random value and datatype */
		/*return int;*/
		/*return float;*/
	}
}
