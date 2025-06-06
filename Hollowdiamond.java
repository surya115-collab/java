
import java.util.Scanner;

public class Hollowdiamond {
    public static void printHollowDiamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j==1 || j==i*2-1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=(n-i)*2-1;j>=1;j--){
                if(j==(n-i)*2-1 || j==1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows in pattern:");
            int n=sc.nextInt();
            printHollowDiamond(n);

        }
    }
    
}
