import java.util.*;
class Cave{
    public String members(int count){
        if(count==7){
            return "Surya nandu jassu farooq sai smart";
        }
        return "invalid number";

    }

}
public class NestedClassobjCall {
    public static void main(String[] args) {
        Cave obj=new Cave();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of members in cave");
        int n=sc.nextInt();
        String str=obj.members(n);
        System.out.println(str); 
    }
    
}
