
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] a={2,2,1};
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
        m.put(i,m.getOrDefault(i, 0)+1);
        }
    }
    
}
