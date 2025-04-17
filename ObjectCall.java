class Calculation{
    public Integer operations(int n1,int n2){
        //int result=n1+n2;
        int result2=n1*n2;
        //return result;
        return result2;

    }
}
public class ObjectCall {
    public static void main(String[] args) {
        int num1=6;
        int num2=7;
        Calculation obj=new Calculation();
        int res=obj.operations(num1,num2);
        System.out.println(res);


    }
    
}
