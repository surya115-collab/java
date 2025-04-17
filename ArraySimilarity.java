import java.util.HashSet;
import java.util.Set;

public class ArraySimilarity {
    public static int similarity(int[] a1,int[] a2){
        Set<Integer> set=new HashSet<>();
        int diff=0;
        for(int i=0;i<a1.length;i++){
            if(a1[i]==a2[i]){
                continue;
            }
            else{
                diff=Math.abs(a1[i]-a2[i]);
                System.out.println(diff);
                set.add(diff);
            }
        }
        if(set.size()==1){
            return diff;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int[] a1={4,7,4,-6,9};
        int[] a2={6,7,4,-4,9};
        int res=similarity(a1,a2);
        System.out.println(res!=0?"YES "+res:"NO "+res);
    }
    
}
