import java.util.Scanner;

public class ClosestNDivisibleByM {
    public static int closestnAndM(int n,int m){
        int close=0,MinDif=Integer.MAX_VALUE;
        for(int i=n-Math.abs(m);i<=n+Math.abs(m);i++){
            if(i%m==0){
                int Dif=n=Math.abs(n-i);
                if(( Dif < MinDif) || (Dif==MinDif&& Math.abs(i)>Math.abs(close)) ){
                    close=i;
                    MinDif=Dif;
                }
            }

        }
        return close;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter m:");
        int m=sc.nextInt();
        int res=closestnAndM(n,m);
        System.out.println(res);
    }
}
