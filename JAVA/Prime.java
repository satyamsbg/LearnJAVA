// important to note that it is a proprty of a Prime number that factor if exist
// it will come if we check under root n
// i= root n will be  i*i=n
import java.util.Scanner;

public class Prime {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        boolean isPrime =true;
        for(int i=2; i*i<=n; i++){
            if(n%2==0){
                isPrime=false;
                break;
            }   
        }
        if(n<2)
        isPrime=false;

        System.out.println("Is Prime    " +isPrime);
        sc.close();
    }
    

  
}