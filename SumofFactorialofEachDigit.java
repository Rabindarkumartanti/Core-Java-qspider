import java.util.Scanner;
public class SumofFactorialofEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int a;
        int fact=1;
        int sum=0;
        while (num != 0) {
            a=num%10;
            for(int i=1; i<=a; i++){
                fact=fact*i;
            };
            sum=sum+fact;
            System.out.println("Factorial of "+a );
            System.out.println("is "+ fact);
            num /= 10;
            fact=1;
        }
        System.out.println("Sum Of Factorials is " +sum);
        sc.close();
    }
}
