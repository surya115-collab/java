public class MaxProdInArray {
    public static int maxProduct(int[] a){
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]*a[j]>=max){
                    max=a[i]*a[j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,45,6,2,7};
        int res=maxProduct(arr);
        System.out.println(res);
    }
    
}
