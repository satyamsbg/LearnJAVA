import java.util.Scanner;

public class Intrest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Intrest");

        int p = sc.nextInt();
       
        double r = sc.nextDouble();
        int t = sc.nextInt();

        double si;
        si= (p*r*t)/100;

        System.out.println("Simple Intrest Calculate is" +si);
        sc.close();
    }
}