

import java.util.*;
public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //int[] arr={1,2,3,3,1,1,1,3,2};
        int currentcount=0;
        int maxcount=0;
        for(int nums:arr){
            if(nums==1){
                currentcount++;
                maxcount=Math.max(maxcount,currentcount);
            }
            else{
                currentcount=0;
            }
            sc.close();

            
        }
        System.out.println("maximum number of conseutive 1's are:"+ maxcount);


    }
   
    
}
