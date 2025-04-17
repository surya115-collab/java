
public class NumberOfOnes {
    public static void main(String[] args) {
        int n=13,c=0;
        StringBuilder s=new StringBuilder();
        for(int i=0;i<=n;i++){
            s.append(i);
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        System.out.println(c);
    }
    
}
