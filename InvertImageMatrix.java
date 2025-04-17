
import java.util.*;
public class InvertImageMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter noof rows:");
        int rows=sc.nextInt();
        System.out.println("Enter noof cols:");
        int cols=sc.nextInt();
        int[][] m=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=rows-1;i>0;i--){
            for(int j=cols-1;j>0;j--){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
