import java.util.*;
public class FindPricesWithSpecialDiscount {
    public static void main(String[] args) {
        int[] arr={8,4,6,2,3};
        int i=0,j=1;
        ArrayList<Integer> arr1=new ArrayList<>();
        while(i<arr.length && j<arr.length){
            if(arr[i]>=arr[j]){
                arr1.add(arr[i]-arr[j]);  
                i++;
                j=i+1; 
            }
            else{
                j++;
            }
         

        }
        if(i<arr.length){
            arr1.add(i);
            i++;
        }
        System.out.println(arr1);
    }
    
}
