
import java.util.Scanner;


public class MultiDimensionalArray {  //Transpose of Matrix

    public static void printMatrix(int[][] array,int rows,int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }        
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int row=sc.nextInt();
        System.out.println("Enter number of columns :");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        //sc.close();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
        }
        System.out.println("The entered matrix is :");
        printMatrix(arr,row,col);
        
        int[][] arr2=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                arr2[i][j]=arr[j][i];
            }
        }

        System.out.println("Transpose of the given matrix is :");
        printMatrix(arr2, col,row);
    }
}
