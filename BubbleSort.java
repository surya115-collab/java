import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j] < array[i]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            }
            System.out.println("The elements of the array in Sorted order are : ");
            for(int k=0;k<array.length;k++){
                System.out.print(+array[k]+" ");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of the array");
            int n=sc.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter array elements :");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            bubbleSort(arr);
        }
    }
    
}
