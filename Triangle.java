

public class Triangle {
    public static void main(String[] args) {
        int n=3;                            //Normal Traingle
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i*2-1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
    

