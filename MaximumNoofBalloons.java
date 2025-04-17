import java.util.*;

public class MaximumNoofBalloons {
    public static void balloon(String s){
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i), 0)+1);
        }
        Set<Integer> set = new HashSet<>(m.values());
        System.out.println(set.size()==1);
    }
    public static void main(String[] args) {
        String s="nlabolko";
        balloon(s);
    }
    
}
