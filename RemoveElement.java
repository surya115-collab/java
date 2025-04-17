
import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a={3,2,2,3};
        int k=3;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]!=k){
                arr.add(a[i]);
            }
            else{

            }
        }
        System.out.println(arr);
        System.out.println(arr.size());
    }
    
}
