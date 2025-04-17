import java.util.*;
public class SelectionSort {
    public static void sortSelection(int[] arr,int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Elements after sorted array are: ");
        for(int i:arr){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        sc.close();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortSelection(arr, n);


    }
    
}
