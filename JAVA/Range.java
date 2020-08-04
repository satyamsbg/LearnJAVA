import java.util.Scanner;

public class Range {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number to find the range: ");

        int n= sc.nextInt();
        if(n>=0 && n<=10)
            System.out.println("0-10"); 

        else if(n>=11 && n<=20)
        
            System.out.println("11-20");
        
        else
            System.out.println("21-100");
sc.close();
        
    }
}