
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingByStringLength {
    public static void main(String[] args) {
        Comparator<String> com=(i, j) -> i.length()>j.length()?1:-1;
        ArrayList<String> arr=new ArrayList<>();
        Collections.addAll(arr,"surya","nandu","jaswanth","sai");
        Collections.sort(arr,com);
        System.out.println(arr);
    }
    
}
