import java.util.*;
public class FindThePeaks {
    public static void main(String[] args) {
        int[] a={1,4,3,8,5};
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=1;i<a.length-1;i++){
            if(a[i]>a[i+1] && a[i]>a[i-1]){
                ar.add(i);
            }
        }
        System.out.println(ar);
    }
    
}
