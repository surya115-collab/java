
import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] readMatrix(int[][] matrix,int row, int col,Scanner sc){
        System.out.println("Enter Matrix elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        return matrix;

    }
    public static void printMatrix(int[][] print,int row,int col){
        System.out.println("The elements in the Matrix after multiplication are :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(print[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] matrixMulti(int[][] matrix1,int row1,int col1,int[][] matrix2,int row2,int col2){
        int C[][]=new int[row1][col2];
        if(row1!=col2){
            return null;
        }
        else{
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        C[i][j]+=matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
            printMatrix(C, row1, col2);
            return C;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row1=sc.nextInt();
        System.out.println("Enter number of columns :");
        int col1=sc.nextInt();
        int A[][]=new int[row1][col1];

        int matrix1[][]=readMatrix(A, row1, col1,sc);
        //printMatrix(matrix1, row1, col1);
        
        System.out.println("Enter number of rows:");
        int row2=sc.nextInt();
        System.out.println("Enter number of columns :");
        int col2=sc.nextInt();
        int B[][]=new int[row2][col2];

        int matrix2[][]=readMatrix(B, row2, col2,sc);
        //printMatrix(matrix2, row2, col2);
        
        matrixMulti(matrix1, row1, col1, matrix2, row2, col2);
        //printMatrix(resultantMatrix,row1,col2);
    }
    
}
