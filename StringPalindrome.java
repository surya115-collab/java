public class StringPalindrome {
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="madam";
        boolean res=isPalindrome(str);
        System.out.println(res);
    }
    
}
