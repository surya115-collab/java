public class RotatingArrayRightOfKSteps {
    public static void rotateArrayToRight(int[] a,int length,int k){
        if(k>length){
            k%=length;
        }
        for(int i=0;i<length;i++){
            if(i<k){
                System.out.print(a[length+i-k]+" ");
            }
            else{
                System.out.print(a[i-k]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int n=arr.length;
        int k=3;
        rotateArrayToRight(arr,n,k);
    }
    
}
