
import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> que=new PriorityQueue<>();
        Collections.addAll(que,2,3,4,5,6,7);
        que.add(1);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.addAll(que);        
        Collections.sort(arr);
        //System.out.println(arr);
        // Iterator iter=arr.iterator();
        // while(iter.hasNext()){
        //     System.out.println(iter.next());
        // }
        que.offer(7666);
        //Splite
        Spliterator<Integer> spli=que.spliterator();
        spli.forEachRemaining((n)-> System.out.println(n));
      
        que.poll();
        // Object[] arr=que.toArray();
        // for (int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        System.out.println(que.element());
        


    }
    
}
