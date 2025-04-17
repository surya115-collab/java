

import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result1=++n;
        int result2=n++;
        System.out.println(result1);
        System.out.println(result2);


    }
    
}
