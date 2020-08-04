import java.util.Scanner;
public class Nested {
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter values of a ,b, c: ");
        long a= sc.nextLong();
        long b= sc.nextLong();
        long c= sc.nextLong();
        if(a>b){
            if(a>c){
                System.out.println(a +" is greater than" +b +"and" +c);

            }else{
                if(b>c && b>a){
                    System.out.println(b +" is greater than" +a +"and" +c);
                }
            }
        }else{
            System.out.println(c +" is greater than" +b +"and" +a);
            sc.close();
        }

    }
    
}