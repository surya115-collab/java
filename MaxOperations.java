
import java.util.Arrays;

public class MaxOperations {
    public static int operations(int[] ar,int k){
        int count=0;
        int i=0;
        int j=ar.length-1;
        Arrays.sort(ar);
        while(i<j){
            if(ar[i]+ar[j]==k){
                count++;
                i++;j--;
            }
            if (ar[i]+ar[j]>k) {
                j--;   
            }
            else{
                i++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int target=5;
        int result=operations(arr,target);
        System.out.println(result);
    }
    
}
