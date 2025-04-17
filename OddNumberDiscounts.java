public class OddNumberDiscounts {
    public static int getDiscount(int n){
        int sum=0;
        if(n>0){
        while(n!=0){
            int digit=n%10;
            if((digit)%2!=0){
                sum+=n%10;
            }
            n=n/10;
        }
    }
    return sum;
    }
    public static void main(String[] args) {
        int i=4682;
        int res=getDiscount(i);
        System.out.println(res>0?res:"no discount for you");
    }
    
}
