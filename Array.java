import java.util.*;
public class Array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter size of array: ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter elements in the array: ");
            for(int i=0;i<n;i++){
                //arr[i]=(int)(Math.random()*10);
                arr[i]=sc.nextInt();
            }
            System.out.println("the elements in the array are: ");
            for(int i=0;i<n;i++){
                System.out.print(+arr[i]+" ");
            }
        }


        
    }
    
}
