import java.util.Scanner;

public class WhileLoop {   
    public static void main(String [] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number;");
        int n= sc.nextInt();
        
        int sum=0;
        int a=n;

        while(a>0){
            int temp= a%10;
            a=a/10;
            sum= sum+ temp;
        }
        System.out.println("Sum of digits:" +sum);
        sc.close();

    }
}