import java.util.Scanner;
public class perfectNo {
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
              if(sum==num){
                  System.out.println("Given No is a Perfect No");
                }
                else{
                    System.out.println("Given No is Not a Perfect No"); 
              }
        input.close();
}
}
