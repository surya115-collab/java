import java.util.*;
public class UniqueNumberOccurances {
    public static boolean uniqueCount(int[] arr){
        Map<Integer,Integer> a=new HashMap<>();
        for(int i:arr){
            a.put(i,a.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> arr1=new ArrayList<>(a.values());
        Collections.sort(arr1);
        Set<Integer> set=new HashSet<>();
            for(int i:arr1){
                set.add(i);
            }
            ArrayList<Integer> arr2=new ArrayList<>();
            arr2.addAll(set);
            Collections.sort(arr2);
            return arr1.equals(arr2);
        }
    
    public static void main(String[] args) {
       try(Scanner sc=new Scanner(System.in)){
        System.out.println("enter array Size:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter array elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    
        boolean res=uniqueCount(arr);
        System.out.println(res);
    }
    }
}
