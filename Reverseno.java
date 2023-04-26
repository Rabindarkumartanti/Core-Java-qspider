import java.util.Scanner;

public class Reverseno {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int a;
        int rev=0;
        while(num!=0){
            a=num%10;
            rev=rev*10+a;
            num=num/10;
        }
        System.out.println("Reversed Number = " +rev);
        input.close();
    }
}
