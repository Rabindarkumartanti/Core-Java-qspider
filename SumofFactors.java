import java.util.Scanner;
public class SumofFactors {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            int sum=0;
            for(int i=1; i<num; i++) {
               if(num % i == 0) {
    
                  sum=sum+i;
               }
            }
            System.out.println(sum);
            input.close();
    }
}
