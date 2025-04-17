
import java.util.Scanner;

public class SnakeInMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j=0;
        String[] s={"DOWN","RIGHT","UP","DOWN"};
        for(String k:s){
            if(k.equals("UP")){
                i--;

            }
            else if(k.equals("DOWN")){
                i++;

            }
            else if(k.equals("RIGHT")){
                j++;
            }
            else{
                j--;
            }
        }
        System.out.println((i*n)+j);
    }
    
}
