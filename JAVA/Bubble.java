 import java.util.Scanner;

 public class Bubble {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of values to be sorted:");
        int n= sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp=0;
        for(int j=0;j<n-1;j++){

            boolean sorted=true;

        for(int i=0;i<n-1-j;i++){
            if(a[i]>a[i+1]){
                temp=a[i+1];
                a[i+1]=a[i];
                a[i]=temp;
                sorted = false;
            }
        }
        if(sorted) break;
        
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i] +" ");
        }
        sc.close();
    }
}