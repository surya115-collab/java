
import java.util.*;
public class StringExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            
            String str[]=new String[n];
            
            for(int i=0;i<str.length;i++){
                str[i]=sc.next();
            }
            for(int i=n-1;i>=0;i--){
                System.out.println(str[i]);
                
            }
            
            for(int i=n-1;i>=0;i--){
                System.out.print(str[i]);
                
            }
            
            
            char arr[]= {'s','u','r','y','a'};
            // Charset cs=Charset.defaultCharset();
            String str2=new String(arr,1,4);
            System.out.println(str2);
            
            String str1="surya";
            System.out.println(str1);
            System.out.println(str1.length());
            System.out.println(str1.charAt(2));
            System.out.println(str1.substring(0));
            System.out.println(str1.substring(0,3 ));
        }
    }
    
}
