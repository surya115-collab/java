public class CircularSentance {
    public static boolean circular(String str){
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        int k=str.indexOf(" ");
        if(k==-1){
            return true;
        }
        while(k==-1){
            if(str.charAt(k-1)!=str.charAt(k+1)){
                return false;
            }
            k=str.indexOf(" ", k+1);
        }
        return true;
    }
    public static void main(String[] args) {
        String str="leetcode";
       boolean res=circular(str);
       System.out.println(res);
    }
}
