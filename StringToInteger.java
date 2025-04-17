public class StringToInteger {
    public static void main(String[] args) {
        String s="1337c0d3";
        int i=0,res=0;
        while(i<s.length()){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
            res=res*10+s.charAt(i)-'0';
            i++;
            }
            else{
                i++;
            }
        }
        System.out.println(res);
    }
    
}
