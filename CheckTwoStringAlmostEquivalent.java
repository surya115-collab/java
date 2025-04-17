

import java.util.*;
public class CheckTwoStringAlmostEquivalent {
    public static void main(String[] args) {
        String s1="aaaa";
        String s2="bccb";
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        for(int i=0;i<26;i++){
            m1.put((char)('a'+i),0);
            m2.put((char)('a'+i),0);
        }     
        for(int i=0;i<s1.length()||i<s2.length();i++){
            m1.put(s1.charAt(i),m1.get(s1.charAt(i))+1);
            m2.put(s2.charAt(i),m2.get(s2.charAt(i))+1);
        }
        for(int i=0;i<26;i++){
            if((Math.abs(m1.get((char)('a'+i)))-(m2.get((char)('a'+1))))>3){
                System.out.println("false");
            }
        }
        System.out.println(true);

    }
    
}
