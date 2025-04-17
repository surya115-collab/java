@FunctionalInterface
interface StringMerge{
    String mergealternatively(String s1,String s2);
}

public class MergeStringsAlternately {
    public static void main(String[] args) {
       
        StringMerge obj= (s1,s2) -> {
            int i=0,j=0;
            StringBuilder s=new StringBuilder();
            while(i<s1.length() && j<s2.length()){
                s.append(s1.charAt(i));
                s.append(s2.charAt(j));
                i++;
                j++;
            }
            while(i<s1.length()){
                s.append(s1.charAt(i));
                i++;
            }
            while(j<s2.length())
            {
                s.append(s2.charAt(j));
                j++;
            }      
            return s.toString();   
        } ;
        String s1="surya";
        String s2="alladi";
        String res=obj.mergealternatively(s1,s2);
        System.out.println(res);
    }
}
