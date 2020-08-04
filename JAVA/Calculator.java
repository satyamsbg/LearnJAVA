import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Choice:");
        char o= sc.nextLine().charAt(0);
        int a= sc.nextInt();
        int b= sc.nextInt();

        switch(o){
        case '+':
        int sum=0;
        sum=a+b;
        System.out.println(sum);
        break;
        
        case '-':
        int sub=0;
        sub=a-b;
        System.out.println(sub);
        break;

        case '*':
        int mul=1;
        mul=a*b;
        System.out.println(mul);
        break;

        case '/':
        int div=1;
        div=a*b;
        System.out.println(div);
        break;

        default:
        System.out.println("Operation not found");
        sc.close();
        }

    }

    
    
}