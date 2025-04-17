import java.util.Scanner;

public class SumOfDigits {
    public static int addDigits(int n){
        while(n>10){
            int temp=n,sum=0;
            while(temp!=0){
            int rem=temp%10;
            sum+=rem;
            temp/=10;
            }
            n=sum;
        
        }
        return n;
    
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the digits to be added:");
            int n=sc.nextInt();
            int res=addDigits(n);
            System.out.println(res);
        }
    }
}
