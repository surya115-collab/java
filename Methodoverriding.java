import java.util.*;
class Operation{
    public Integer oper(int num1,int num2){
        int res=num1+num2;
        return res;


    }
    public Float oper(float  num1,int num2){
        float result=num1*num2;
        return result;

    }

}
public class Methodoverriding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: " );
        int n1=sc.nextInt();
        System.out.println("Enter second number: ");
        int n2=sc.nextInt();
        Operation obj=new Operation();
        float res=obj.oper(n1,n2);
        System.out.println(res);
        

        
    }
    
}
