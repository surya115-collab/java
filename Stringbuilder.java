
import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String s1=sc.next();
            StringBuilder str=new StringBuilder(s1);
            if(str.charAt(str.length()-1)=='a'){
                str.reverse();
                System.out.println(str.toString());
            }
            else{
                System.out.println("Invalid String");
            }
        }

    }
}
