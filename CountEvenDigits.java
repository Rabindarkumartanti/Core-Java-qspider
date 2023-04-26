
	import java.util.Scanner;

	public class CountEvenDigits {
	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter a number: ");
	      int num = input.nextInt();
	      
	      int evenCount = 0;
	      while(num != 0) {
	         int digit = num % 10;
	         if(digit % 2 == 0) {
	            evenCount++;
	         }
	         num /= 10;
	      }
	      System.out.println("The input number has " + evenCount + " even digits.");
	   }
	}



