package assignment3ex1;

public class Main {
	public static void main(String[] args) {
		float num1=5.5f;
		float num2=5f;
		Calculator calc = new Calculator();
		
		System.out.println("The addition INT result for 2 + 7 is "+ calc.addition(2, 7));
		System.out.println("The addition DOUBLE result for 2.1 + 7.3 is "+ calc.addition(2.1, 7.3));
		System.out.println("The subtraction INT result for 7 - 2 is "+ calc.subtraction(7, 2));
		System.out.println("The subtraction DOUBLE result for 2.1 + 7.3 is "+ calc.subtraction(7.3, 2.1));
		System.out.println("The subtraction LONG result for 7.2 - 2 is "+ calc.subtraction(Math.round(7.2), Math.round(2.1)));
		System.out.println("The addition LONG result for 7.2 - 2 is "+ calc.addition(Math.round(7.2), Math.round(2.1)));
		
		System.out.println("The subtraction FLOAT result for 7.2 - 2 is "+ calc.subtraction(num1, num2));
		System.out.println("The addition FLOAT result for 7.2 - 2 is "+ calc.addition(num1, num2));
	}
}
