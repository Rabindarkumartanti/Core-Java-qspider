
public class PrintNumbersDivisibleBy7OrEndsWith7 {
	   public static void main(String[] args) {
		      for(int i=1; i<=1000; i++) {
		         if(i % 7 == 0 || i % 10 == 7) {
		            System.out.print(i + " ");
		         }
		      }
		   }
		}

