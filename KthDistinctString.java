import java.util.ArrayList;
public class KthDistinctString {
    public static String finddistinct(String[] arr,int k){
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(a.contains(arr[i])){
                a.remove(arr[i]);
            }
            else{
                a.add(arr[i]);
            }

        }
        String str=a.get(k-1);
        return str;

    }
    public static void main(String[] args) {
        String[] arr={"e","b","c","c","d"};
        int k=3;
        String s=finddistinct(arr,k);
        System.out.println(s);
    }
    
}
