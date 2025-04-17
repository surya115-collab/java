import java.util.*;

public class RemoveDupliatesFromSortedArray {
    public static void main(String[] args) {
        int[] a={1,1,2};
        Set<Integer> set=new TreeSet<>();
        for(int i:a){
            set.add(i);
        }
        System.out.println(set.size());
    }
    
}
