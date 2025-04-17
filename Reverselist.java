import java.util.*;
public class Reverselist{
    public static void main(String[] args){
        LinkedList<String> lt=new LinkedList<>();
        // lt.add("hi");
        // lt.add("ni");
        // lt.add("ji");
        Collections.addAll(lt,"hi","ni","ki");
        Iterator<String> lt2=lt.descendingIterator();
        while(lt2.hasNext()){
            System.out.println(lt2.next());
        }
        System.out.println(lt.get(2));
    }
}