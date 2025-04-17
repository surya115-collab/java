public class LongetsPalindromicSubSTring {
    public static boolean isPalindrome(String s1){
        int l=0;
        int r=s1.length()-1;
        while(l<r){
        if(s1.charAt(l)!=s1.charAt(r)){
            return false;
        }
        l++;r--;
    }
    return true;
        
    }
    public static String palindrome(String s){
        if(s.length()<=1){
            return s;
        }
        int maxLen=1;
        String maxStr=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(j-i>maxLen && isPalindrome(s.substring(i,j))){
                    maxLen=j-i;
                    maxStr=s.substring(i,j);
                }
            }
        }
        return maxStr;
    }
  
    public static void main(String[] args) {
        String str="bbgufdrmadam";
        String result=palindrome(str);
        System.out.println(result);
    }
    
}
