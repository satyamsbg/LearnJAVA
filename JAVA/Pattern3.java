// import java.util.Scanner;
public class Pattern3 {   
    public static void main(String [] args){
        // Scanner sc= new Scanner(System.in);
        
        // int n= sc.nextInt();
        int k=1;
        for(int i=1; i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                
                System.out.print(k++ +" ");
                

            }
            System.out.println();
        }

    }
}