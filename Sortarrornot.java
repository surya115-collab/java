public class Sortarrornot {
    public static void main(String[] args) {
        int arr1[]={1,2,6,8,3};
        int idx=0;
        System.out.println(sort(arr1,idx));
    }
    static boolean sort(int[] arr,int idx){
        if(idx>=arr.length-1){
            return true;
        }
        if (arr[idx]>arr[idx+1]){
            return false;
        }
        return sort(arr,idx+1);


    }
    
}
