public class ServerRequestCount {
    public static int countOfServer1(int[] a){
        int serverOne=0,serverTwo=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                serverOne+=a[i];
            }
            else{
                serverTwo+=a[i];
            }
        }
        return serverOne;
    }
    public static void main(String[] args) {
        // int n=6;
        int[] arr={1000000 ,-999999 ,999999 ,-1000000 ,1234567 ,-1234567, 987654 ,-987654};
        int res=countOfServer1(arr);
        System.out.println(res);
    }
    
}
