
public class CountNumbersDivisibleBy4AndEndsWith4 {
	   public static void main(String[] args) {
		      int count = 0;
		      for(int i=4; i<=100; i+=10) {
		         if(i % 4 == 0) {
		            count++;
		         }
		      }
		      System.out.println("There are " + count + " numbers up to 100 that are divisible by 4 and end with 4");
		   }
		

}
