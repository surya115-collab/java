
import java.util.Scanner;

public class AddString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First String:");
            String s1=sc.nextLine();
            System.out.println("Enter second String:");
            String s2=sc.nextLine();
            int i=s1.length()-1;
            int j=s2.length()-1;
            int carry=0;
            StringBuilder str=new StringBuilder();
            while(i>=0 || j>=0 || carry>0){
                int sum=carry;
                if(i>=0){
                    sum+=s1.charAt(i)-'0';
                    i--;
                }
                if(j>=0){
                    sum+=s2.charAt(j)-'0';
                    j--;
                }
                carry=sum/10;
                str.append(sum%10);
            }
            System.out.println("The sum of two string is:");
            System.out.println(str.reverse());
        }
    }
    
}
