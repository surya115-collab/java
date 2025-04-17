
import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            int n1=n%2;
            sb.append(n1);
            n/=2;

        }

         int c=0;
         String binary=sb.reverse().toString();
        // int num=Integer.parseInt(sb.toString());
         System.out.println(binary);

        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                c++;
            }

        }
        System.out.println(c);
    }
    }
    
}
