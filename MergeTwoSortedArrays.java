
import java.util.ArrayList;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a1={1,2,4};
        int[] a2={1,3,4};
        int i=0,j=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<a1.length && j<a2.length){
            if(a1[i]<=a2[j]){
                arr.add(a1[i]);
                i++;
            }
            else{
                arr.add(a2[j]);
                j++;
            }
        }
        if(i<a1.length){
            arr.add(a1[i]);
            i++;
        }
        if(j<a2.length){
            arr.add(a2[j]);
            j++;
        }
        System.out.println(arr);
    }
    
}
