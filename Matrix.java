import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows=sc.nextInt();
        System.out.println("enter no of columns");
        int col=sc.nextInt();
        int[][] matrix=new int[rows][col];
    
        //System.out.println("enter elements in matrix");

        for(int i=0;i<rows;i++){
            System.out.println("Enter row 1:");
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        //printing matrix
        System.out.println("The matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
