import java.util.*;
public class InsertionSort {
    public static void insertionSorting(int[] array){
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && key < array[j]){
                array[j+1]=array[j];
                --j;
            }
            array[j+1]=key;
        }
        System.out.println("The array elements after sorted :");
        for(int k : array){
            System.out.print(k+" ");
        }

    }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter size of the array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements to be sorted :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionSorting(arr);
    }
    }
    
}
