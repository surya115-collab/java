import java.util.Scanner;

public class GeometricSeries {
    public static double  Series(float  a,float r,int n){
        double res = 0;
        for(int i=0;i<n;i++){
            res=res+a;
            a=a*r;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        float a=sc.nextFloat();
        System.out.println("enter r");
        float r=sc.nextFloat();
        System.out.println("enter n");
        int n=sc.nextInt();
        double res=Series(a,r,n);
        System.out.println(res);
    }
}
