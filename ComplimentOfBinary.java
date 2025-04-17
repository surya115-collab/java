

public class ComplimentOfBinary {
    public static int binaryToInt(int n){
        int temp=n;
        int dec=0;
        int base=1;
        while(temp>0){
            int rem=temp%10;
            temp/=10;
            dec+=rem*base;
            base=base*2;
        }
        return dec;

    }
    public static void main(String[] args) {
        int bin=101010;
       int res=binaryToInt(bin);
       System.out.println(res);
       int c=0;
       while(res>=1){
        if(res%2==0){
            res/=2;
            c++;
        }
        else{
            res+=1;
            c++;
        }
       }
       System.out.println(c);
    }
    
}

