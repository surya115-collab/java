public class MakeStringDuplicates {
    public static String DuplicatedString(String s){
        int i=0;
        StringBuilder str=new StringBuilder();
        while(i<s.length()){
            for(int j=0;j<2;j++){
                str.append(s.charAt(i));
            }
            i++;
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String str="6787";
        String res=DuplicatedString(str);
        System.out.println(res);
    }
    
}
