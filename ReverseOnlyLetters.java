public class ReverseOnlyLetters {
    public static String reveString(String s){
        int l=0,r=s.length()-1;
        char[] arr=s.toCharArray();
        while(l<r){
            while(l<r && !Character.isLetter(arr[l])){
                l++;
            }
            while(r>=0 && !Character.isLetter(arr[r])){
                r--;
            }
            if(l<r){
            char temp=arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
        }
        }
        return new String(arr);

    }
    public static void main(String[] args) {
        String str="a-bC-dEf-ghIj";
        System.out.println(reveString(str));

    }
    
}
