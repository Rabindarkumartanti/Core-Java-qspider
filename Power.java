

	import java.util.Scanner;

	public class Power {
	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter a number (base): ");
	      double a = input.nextDouble();
	      System.out.print("Enter another number (exponent): ");
	      int b = input.nextInt();
	      
	      double result = 1.0;
	      for(int i = 1; i <= b; i++) {
	         result *= a;
	      }
	      System.out.println(a + "^" + b + " = " + result);
	   }
	}


