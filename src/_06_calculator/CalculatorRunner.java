package _06_calculator;

public class CalculatorRunner {
	public static void main(String[]args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(83, 57));
		System.out.println(calculator.subtract(72, 47));
		System.out.println(calculator.multiply(65, 19));
		System.out.println(calculator.divide(864, 72));
	}
}
