import java.util.Scanner;

public class fibonicci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print fibonacci count: ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < num; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        input.close();
    }
}
