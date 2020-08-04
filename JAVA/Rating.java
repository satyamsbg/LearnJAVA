import java.util.Scanner;

public class Rating {
    public static void main(String [] args){
        
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the rating:");
    int r = sc. nextInt();

    switch(r){
        case 1:
        case 2:
        System.out.println("bad");
        break;
        case 3:
        System.out.println("Average");
        break;
        case 4:
        case 5:
        System.out.println("Good");
        break;
        default:
        System.out.println("Undefined");
        break;
        
    }
    sc.close();
    }
    
}