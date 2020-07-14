import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator operation = new Calculator();
		double num1, num2;
		String operator;

		System.out.println("Enter your first number: ");
		num1 = input.nextDouble();
		System.out.println("Choose which operation (Use one of these 4 symbols: + - * /):");
		operator = input.next();
		System.out.println("Enter your second number: ");
		num2 = input.nextDouble();

		if (operator.equals("+")) {
			System.out.println(operation.add(num1, num2));
		}
		if (operator.equals("-")) {
			System.out.println(operation.minus(num1, num2));
		}
		if (operator.equals("*")) {
			System.out.println(operation.multiply(num1, num2));
		}
		if (operator.equals("/")) {
			System.out.println(operation.divide(num1, num2));
		}
	}
}

class Calculator {
	double result;

	public double add(double a, double b) {
		result = a + b;
		return result;
	}

	public double minus(double a, double b) {
		result = a + b;
		return result;
	}

	public double multiply(double a, double b) {
		result = a + b;
		return result;
	}

	public double divide(double a, double b) {
		result = a + b;
		return result;
	}
}