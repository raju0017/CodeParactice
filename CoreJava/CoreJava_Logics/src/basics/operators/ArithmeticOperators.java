package basics.operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		
		// Arithmetic Operators :- +, -, *, /, %
		// If we apply any Arithmetic operator between two operands the result type is always 
		// max(int, type of a, type of b)
		
		byte a = 10;
		int b = 20;
		
		// a = a+b; // Compile time Error (CE): Type mismatch: cannot convert from int to byte
		b = a+b;
		System.out.println(b);
	}

}
