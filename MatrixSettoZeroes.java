import java.util.Scanner;
public class MatrixSettoZeroes {
    static void modifyRowAndCol(int[][] m,int i,int j){
        int c=0;
        while(true){
            if(c<m[i].length){
                m[i][c++]=0;

            }
            else{
            break;
            }
        }
        c=0;
        while(true){
            if(c<m.length){
                m[c++][j]=0;
                
            }
            else{
                break;
            }
        }
        System.out.println("Modified matrix is:");
        for(int[] k:m){
            for(int l:k){
                System.out.print(l+" ");
            }
            System.out.println();
        }

    }
    public static void setZeroes(int[][] m){
        boolean[][] b=new boolean[m.length][m[0].length];
        for(int i=0;i<m.length;i++){ 
            for(int j=0;j<m[0].length;j++){
                b[i][j]=m[i][j]==0;
            }
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(b[i][j]==true){
                    modifyRowAndCol(m,i,j);
                 }
                }
            }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no.of cols");
        int cols=sc.nextInt();
        int[][] m1=new int[rows][cols];
        System.out.println("Enter array elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        setZeroes(m1);
    }
    
}
