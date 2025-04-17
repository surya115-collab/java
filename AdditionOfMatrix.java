import java.util.*;
public class AdditionOfMatrix {
    public static int[][] readMatrix(Scanner sc){
        System.out.println("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns: ");
        int col=sc.nextInt();
        int[][] matrix=new int[rows][col];
        System.out.println("Enter "+col+"numbers seperated by spaces ");
        for(int i=0;i<rows;i++){
            System.out.print("Enter row "+(i+1)+" : ");
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        return matrix;


    }
    public  int[][] add(int[][] m1,int[][] m2){
        int[][] result=new int[m1.length][m2.length];
        if(m1.length!=m2.length){
            return null;
        }
        System.out.println("Sum of given martrices is: ");
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m2.length;j++){
                if(m1[i][j]!=m2[i][j]){
                result[i][j]=m1[i][j]+m2[i][j];
                }
                else{
                    return null;
                }
            }
            
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AdditionOfMatrix obj=new AdditionOfMatrix();
        System.out.println("Matrix 1: ");
        int [][] m1=readMatrix(sc);
        System.out.println("Matrix 2: ");
        int[][] m2=readMatrix(sc);

        int[][] res=obj.add(m1,m2);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
        System.out.println();
        }
    }
    
}
