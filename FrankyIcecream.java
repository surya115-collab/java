import java.util.ArrayList;
import java.util.Collections;

public class FrankyIcecream {
    public static void main(String[] args) {
        int ice=4,coins=9;
        int[] cones={1,2,3,4};
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<cones.length;i++){
            if(cones[i]<=coins){
                arr.add(cones[i]);
            }
        }
        arr.remove(Collections.min(arr));
        System.out.println(arr.size());
    }
    
}
