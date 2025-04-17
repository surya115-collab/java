import java.util.*;
public class MergeSort {
    public static void merge(int[] arr,int l,int mid,int r){

        int n1=mid - l + 1;
        int n2=r - mid;

        int[] larr=new int[n1];
        int[] rarr=new int[n2];
        
        for(int i=0;i<n1;i++){
            larr[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            rarr[j]=arr[mid+1+j];

        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(larr[i]<rarr[j]){
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
    public static void divide(int[] arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            divide(arr,l,mid);
            divide(arr,mid+1,r);
            

            merge(arr,l,mid,r);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter size of the array: ");
        int n=sc.nextInt();      
        int[] arr=new int[n];
        System.out.println("Enter array elements to be sorted: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        divide(arr,0,arr.length-1);
        System.out.println("Array after sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
