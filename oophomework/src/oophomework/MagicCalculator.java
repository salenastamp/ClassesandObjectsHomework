package oophomework;

public class MagicCalculator extends Calculator {

	public double squareRoot(double num1) {
		return Math.sqrt(num1);
	}

	public double sin(double num1) {
		return Math.sin(num1);
	}

	public double cosine(double num1) {
		return Math.cos(num1);
	}

	public double tan(double num1) {
		return Math.tan(num1);
	}

	public static int factorial(int num1) {
		int result = num1;
		for (int i = result - 1; i > 0; i--) {
			result = result * i;
		}
		return result;
	}
}
