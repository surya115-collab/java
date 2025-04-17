import java.util.HashMap;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] a={3,2,3};
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
        m.put(a[i],m.getOrDefault(a[i], 0)+1);
        }
        // ArrayList<Integer> ar=new ArrayList<>(m.values());
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=0;i<ar.size();i++){
        //     if(ar.get(i)>(a.length/3)){
        //         set.add(m.get(ar.get(i)));
        //     }
        //}
        System.out.println(m.get(2));
    }
    
}
