package demo;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implicit type casting
		        System.out.println("Implicit Type Casting:");
		        int num1 = 100;
		        long num2 = num1; // Implicit casting from int to long
		        float num3 = num1; // Implicit casting from int to float
		        double num4 = num1; // Implicit casting from int to double

		        System.out.println("num1 (int): " + num1);
		        System.out.println("num2 (long): " + num2);
		        System.out.println("num3 (float): " + num3);
		        System.out.println("num4 (double): " + num4);
		        System.out.println();

		        // Explicit type casting
		        System.out.println("Explicit Type Casting:");
		        double num5 = 100.50;
		        int num6 = (int) num5; // Explicit casting from double to int
		        float num7 = (float) num5; // Explicit casting from double to float
		        char letter = (char) num6; // Explicit casting from int to char

		        System.out.println("num5 (double): " + num5);
		        System.out.println("num6 (int): " + num6);
		        System.out.println("num7 (float): " + num7);
		        System.out.println("letter (char): " + letter);
		
	}

}
