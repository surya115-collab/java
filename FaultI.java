
import java.util.*;
public class FaultI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer s1=new StringBuffer();
        for (char c:s.toCharArray()){
            if(c=='i'){
                s1.reverse();
            }                
            s1.append(c);
            sc.close();
        }
        System.out.println(s1);
    }
    
}
