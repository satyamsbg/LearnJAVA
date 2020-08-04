import java.util.Scanner;

public class Arrays {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students:");
        int n= sc.nextInt();
        double sum=0;
        double avg;
        double marks[]=new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the marks of "+ (i+1) + " Student:");
            marks[i]= sc.nextInt();
            sum=sum+marks[i];
        }

    avg=sum/n;
    System.out.println("Average marks= "+avg );
    sc.close();

    }
    
}