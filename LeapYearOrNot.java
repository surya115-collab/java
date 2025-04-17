import java.util.Scanner;

class LeapOrNot{
    public boolean findyear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
            }
            else{
                return true;
            }
        }
        return false;
    }
}
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year:");
        int year=sc.nextInt();
        LeapOrNot obj=new LeapOrNot();
        boolean res=obj.findyear(year);
        System.out.println(res);
    }
    
}
