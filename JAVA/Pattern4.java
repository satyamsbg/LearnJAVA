import java.util.Scanner;
public class Pattern4 {   
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int k=2*n-1;
        for(int i=1; i<=k;i++){
            if(i<=n){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=1; j<=k-i+1;j++){
                    System.out.print("* ");
                }
            }


            
            System.out.println();
        }
            sc.close();
    }
}