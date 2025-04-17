public class BinaryReverse {
    public static int reverse(int n){
        return Integer.reverse(n);
    }
    public static void main(String[] args) {
        int n=000000101;
        int res=reverse(n);
        System.out.println(Integer.toBinaryString(res));
    }
    
}
