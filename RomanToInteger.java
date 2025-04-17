import java.util.*;


public class RomanToInteger {
    public static int romanInteger(String s){
        Map<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int total=0;
        int prevValue=0;
        for(int i=s.length()-1;i>=0;i--){
            char currentString=s.charAt(i);
            int currentValue=map.get(currentString);

            if(currentValue < prevValue){
                total-=currentValue;
            }
            else{
                total+=currentValue;
            }
            prevValue=currentValue;
        }
        return total;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Roman Number : ");
        String str = sc.nextLine();
        if(str.contains("IIII")){
            System.out.println("Inavlid roman number ");

        }else{
        int result = romanInteger(str);
        System.out.println("The integer value for "+ str +" is : "+result);
        sc.close();
    }
}
    
}
