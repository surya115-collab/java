public class SumOfSquares {
    public static void main(String[] args) {
        int n=123;
        while(n!=1){
            int sum=0,temp=n;
                while(temp>0){
                int rem=temp%10;
                sum+=(int)Math.pow(rem,2);
                temp/=10;
            }
            if(sum==89){
                System.out.println("no");
                break;
            }
            else{
            n=sum;
            }
        }
        System.out.println(n==1);
}
    
}
