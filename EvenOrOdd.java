public class EvenOrOdd {
    public static void solve(int l,int r){
        int rem=0,num=0,even=0,odd=0,count=0;
        for(int i=l;i<=r;i++){
            num=i;
            while(num>0){
                rem=num%10;
                if(rem%2==0 || rem==0){
                    even++;
                }
                else if(rem==1 || rem%2!=0){
                    odd++;
                }
                num/=10;
            }
            if((even%2!=0 || even==1 )&& (odd==0 || odd%2==0)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int l=1;
        int r=9;
        solve(l,r);
    }
    
}
