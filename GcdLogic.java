public class GcdLogic {
    public static void main(String[] args) {
        int a=15,b=5,max=0;
        for(int i=1;i<=Math.min(a, b);i++){
            if(a%i ==0 && b%i==0){
                max=i;
            }
        }
        System.out.println(max);
    }
    
}
