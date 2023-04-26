
	import java.util.Scanner;

	public class PrintDigitsGreaterThanFive {
	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter a number: ");
	      int num = input.nextInt();
	      
	      System.out.print("The digits greater than or equal to 5 in the input number are: ");
	      while(num != 0) {
	         int digit = num % 10;
	         if(digit >= 5) {
	            System.out.print(digit + " ");
	         }
	         num /= 10;
	      }
	   }
	}


