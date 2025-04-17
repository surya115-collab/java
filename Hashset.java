import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        Set<Integer> a= new HashSet<>();
        a.addAll(Arrays.asList(new Integer[] {1,2,3,4,4,5,58,6}));
        Set <Integer> b=new HashSet<>();
        b.addAll(Arrays.asList(new Integer[] {4,3,5,6,4,7,6,8}));
        Set<Integer> union=new HashSet<>(a);
        union.addAll(b);
        System.out.println("union of a,b is :"+union);
        Set<Integer> intersection=new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("intersetion of a,b is:"+intersection);
        Set<Integer> diff=new HashSet<>(a);
        diff.removeAll(b);
        System.out.println("diff of a,b is:"+diff);


        
    
    
    
    
    
    }




    
    
}
