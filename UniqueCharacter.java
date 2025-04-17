
import java.util.*;

public class UniqueCharacter {
    public static int uniqueChar(String s){
        char[] arr=s.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="huhujklo";
        int res=uniqueChar(s);
        System.out.println("first unique character index of the String is:"+res);
    }
    
}
