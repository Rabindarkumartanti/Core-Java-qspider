import java.util.Scanner;
public class Strongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int a;
        int num2=num;
        int fact=1;
        int sum=0;
        while (num != 0) {
            a=num%10;
            for(int i=1; i<=a; i++){
                fact=fact*i;
            };
            sum=sum+fact;
            num /= 10;
            fact=1;
        }
        if (num2==sum) {
            System.out.println("Entered No is a Strong Number");
        }
        else{
            System.out.println("Entered No is not a Strong Number");
        }
        sc.close();
    }
}

