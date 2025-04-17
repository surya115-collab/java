
public class FindDiffStrig {
    public static void main(String[] args) {
        
        String s1="123";
        String s2="3214";
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)!=s2.charAt(j)){
                sb.append(s2.charAt(j));
            }
            i++;
            j++;
        }
        if(j<s2.length()){
            sb.append(s2.charAt(j));
            j++;
        }
        System.out.println(sb.toString());
    }
    
}
