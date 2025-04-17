
import java.util.Arrays;

public class KthMaxElementInMatrix {

    public static void main(String[] args) {
        int[] arr={11,12,11,500,450};
        int k=2;
        Arrays.sort(arr);
        int[] res=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            res[j]=arr[i];
            j++;
        }
        System.out.println(res[k-1]);
    }
    
}
