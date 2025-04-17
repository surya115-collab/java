import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s="pwwkew";
        int i=0,j=0,max=0;
        HashSet<Character> set=new HashSet<>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }

        }
        System.out.println(max);
    }
    
}
