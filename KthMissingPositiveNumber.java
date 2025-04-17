import java.util.ArrayList;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int k=2;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<=(a.length+k);i++){
            if(list.contains(i)){

            }
            else{
                res.add(i);
            }
        }
        System.out.println(res.get(k-1));
        System.out.println(res);

    }
    
}
