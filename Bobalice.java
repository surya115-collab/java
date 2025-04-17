import java.util.*;

public class Bobalice {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        Collections.addAll(nums,5,4,2,3);
        ArrayList<Integer> arr=new ArrayList<>();
        while (!nums.isEmpty()) {
            int min1=Collections.min(nums);
            nums.remove(Collections.min(nums));
            int min2=Collections.min(nums);
            nums.remove(Collections.min(nums));
            arr.add(min2);
            arr.add(min1);
            

            
        }
        System.out.println(arr);


    }
}
    

