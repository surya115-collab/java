public class PatternX {
    public static void main(String[] args) {
        String s="hello";
        int len=s.length();
        for(int i=0;i<len;i++){
            for(int k=0;k<len;k++){
                if(k==i || k==len-1-i){
                    System.out.print(s.charAt(k));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
