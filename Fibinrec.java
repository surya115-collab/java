import java.util.*;

public class Fibinrec {
    public static void main(String[] args){
    //     int n=6;
    //     System.out.println(fibanocci(n));
    // }
    // static Integer fibanocci(int n){
    //     if (n==0 || n==1){
    //         return n;
    //     }
    //     int result=fibanocci(n-1)+fibanocci(n-2);
    //     return result;
    


    Scanner sc=new Scanner(System.in);
    System.out.println("enter number:");
    int n=sc.nextInt();
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(0);
    arr.add(1);
    int a=0,b=1,sum;
    for(int i=2;i<=n;i++){
        sum=a+b;
        a=b;
        b=sum;
        if(sum>=n){
            arr.add(sum);
            break;

        }
        arr.add(sum);
    }
    System.out.println(arr);
    }
    
}
