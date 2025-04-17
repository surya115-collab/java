import java.util.Scanner;
public class Palindrome {
    public static int palindromeOrNot(int n1){
        int reversed_n=0;
        while(n1>0){     
            reversed_n= reversed_n * 10 + n1 % 10;
            n1=n1/10;

        }
        return reversed_n;


        }
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int result=palindromeOrNot(num);
        if(num == result){
            System.out.println("The given "+num+" is a Palindrome");

        }
        else{
            System.out.println("The given "+num+" is not a Palindrome");
        }
    }
    
}
