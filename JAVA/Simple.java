import java.util.Scanner;
public class Simple {
    public static void main(String [] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Hello this is my second Simple Intrest Prog");

        int p = sc.nextInt();
        double r= sc.nextDouble();
        int t= sc.nextInt();

        double si= p*r*t/100;
        System.out.println(si);
        sc.close();
    }
}