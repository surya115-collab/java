public class IntegerToRoman {
    private static String findRoman(int num){
        String[] s= romans();
        int[] n=numbers();
        int i=0;
        String str=new String();
        while(num>0){
            if(num>=n[i]){
                str+=s[i];
                num-=n[i];
            }
            else{
                i++;
            }
        }
        return str;
    }
    private static String[] romans(){
        return new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    }
    private static int[] numbers(){
        return new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    }
    public static void main(String[] args) {
        int num=3749;
        String res=findRoman(num);
        System.out.println(res);
    }
    
}
