import java.util.*;
public class ThirdMaxElement {
    public static int maxThird(int[] a){
        Arrays.sort(a);
        Set<Integer> set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i:set){
            ar.add(i);
        }
        if(ar.size()==3){
            return ar.get(0);
        }
        if(ar.size()<3){
            return ar.get(ar.size()-1);
        }
        else{
            return ar.get(ar.size()-3);
        }
    }
    public static void main(String[] args) {
        int[] arr={1};
        int res=maxThird(arr);
        System.out.println("Third max element is:"+res);
    }
    
}
