import java.util.*;
public class StudentMarksSortingMatrix {
    public static int[][] sortcolumn(int[][] m,int k){
        int len=m.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(m[i][k]<m[j][k]){
                    int[] temp=m[i];
                    m[i]=m[j];
                    m[j]=temp;
                }
            }
        }
        return m;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter rows");

            int rows=sc.nextInt();
            System.out.println("enter cols");

            int cols=sc.nextInt();
            int m[][]=new int[rows][cols];
            System.out.println("enter matrix");

            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    m[i][j]=sc.nextInt();
                }
            }
            int k=sc.nextInt();
            int[][] result=sortcolumn(m,k);
            System.out.println("result matrix is:");

            for (int[] result1 : result) {
                for (int j = 0; j<result.length; j++) {
                    System.out.print(result1[j] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
