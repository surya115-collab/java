import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numer: ");
        int n=sc.nextInt();
        int sum=1;
        for(int i=n;i>0;i--){
            sum*=i;
            sc.close();

        }
        System.out.println(sum);


    }
    
}
