
	import java.util.Scanner;

	public class PrintEvenDigits {
	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter a number: ");
	      int num = input.nextInt();
	      
	      System.out.print("The even digits in the input number are: ");
	      while(num != 0) {
	         int digit = num % 10;
	         if(digit % 2 == 0) {
	            System.out.print(digit + " ");
	         }
	         num /= 10;
	      }
	   }
	}


