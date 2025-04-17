import java.math.BigInteger;

public class GCDSHORTCUT {
    public static void main(String[] args) {
        int a=18,b=6;
        BigInteger n1=new BigInteger(String.valueOf(a));
        BigInteger n2=new BigInteger(String.valueOf(b));
        BigInteger res=n1.gcd(n2);
        System.out.println(res);
    }
    
}
    
