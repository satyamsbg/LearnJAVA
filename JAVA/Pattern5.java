import java.util.Scanner;
public class Pattern5 {   
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
         
        for(int i=1; i<=n;i++){
            System.out.print('*'+" ");
        }
        System.out.println();
        if(n>1){
            for(int j=1;j<=n-1;j++){
                for(int k=1; k<=j+j;k++){
                    System.out.print("  ");
                }
                for(int l=j; l<=n-1;l++){
                    System.out.print('*'+" ");
                }
                System.out.println();
            }
        }
        else
        System.out.println("");

        sc.close();


    }
}