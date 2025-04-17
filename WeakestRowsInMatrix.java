
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class WeakestRowsInMatrix {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter noof rows:");
        int r=sc.nextInt();
        System.out.println("enter noof cols:");
        int c=sc.nextInt();
        int[][] m=new int[r][c];
        int[] arr=new int[r];
        int count=0;
        Map<Integer,Integer> tp=new TreeMap<>();
        System.out.println("enter matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
                if(m[i][j]==1){
                    count++;
                }
            }
            arr[i]=count;
            tp.put(count,i);
            count=0;

        }
        for(int i=0;i<tp.size();i++){
            System.out.println(tp.getOrDefault(i, count));
        }
    }
    }
    
}
