
public class LeetCodePalindrome {
        public static boolean isPalindrome(int x) {
            String str1=Integer.toString(x);
            System.out.println(str1);
            int n1=Integer.parseInt(str1);
            if(x<0){
                return false;
            }
            int rem=0;
            StringBuilder s=new StringBuilder();
            while(x!=0){
                rem=x%10;
                s.append(rem);
                x/=10;
            }
            String str2=s.toString();
            int n2=Integer.parseInt(str2);
            return n1==n2;            
        }
    public static void main(String[] args) {
        int x=121;
        boolean res=isPalindrome(x);
        System.out.println(res);
    }
}
    

