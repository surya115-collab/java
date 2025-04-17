import java.util.*;
public class NamesHeights {
    public static void main(String[] args) {
        // String[] names={"mary","john","emma"};
        // int[] heights={180,165,170};
        Map<String,Integer> unsortedmap=new HashMap<>();
        unsortedmap.put("mary",180);
        unsortedmap.put("john", 165);
        unsortedmap.put("emma",170);
        List<Map.Entry<String,Integer>> list=new ArrayList<>(unsortedmap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String,Integer> sortedmap=new HashMap<>();
        for(Map.Entry<String,Integer> elements:list){
            sortedmap.put(elements.getKey(),elements.getValue());
        }
        // for(Map.Entry<String,Integer> i:sortedmap.entrySet()){
        //     System.out.println(i.getKey() +":"+i.getValue());

        // }
        for(String names: sortedmap.keySet()){
            System.out.println(names+":"+sortedmap.get(names));
        }



    }
    
}
