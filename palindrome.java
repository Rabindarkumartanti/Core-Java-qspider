import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int a;
        int rev=0;
        int num2 = num;
        while(num!=0){
            a=num%10;
            rev=rev*10+a;
            num=num/10;
        }
        if(rev==num2){
            System.out.println("Entered No is Palindrome Number");
        }
        else{
            System.out.println("Entered No is not a Palindrome Number");
        }
        input.close();
    }
}

