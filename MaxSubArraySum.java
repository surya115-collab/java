
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr={5,4,-1,7,8};
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            max=(sum>max?sum:max);

        }
        System.out.println(max);
    }
    
}
