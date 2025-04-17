public class SubArrays {
    public static void main(String[] args) {
        int n=5,res=0;
        int[] arr={3,4,5,6,7};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                // int[] sub=Arrays.copyOfRange(arr, i, j);
                // System.out.println(Arrays.toString(sub));
                sum+=arr[j];
            }
            
            res=Math.max(max,sum);
        }
        System.out.println(res);
    }
    
}
