public class FindMaxProductOfTwoElements {
    public static void main(String[] args) {
        String[] s={"pay","attention","practise","attend"};
        String pre="at";
        int c=0;
        for(String s1:s){
            if(s1.startsWith(pre)){
                c++;
            }
        }
        System.out.println(c);
    }
    
}
