public class ReverseStringWithKIndex {
    public static void main(String[] args) {
        String s="abcdefghi";
        int k=3;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<k;i++){
            str.append(s.charAt(i));
        }

        StringBuilder str1=new StringBuilder();
        str1.append(str.reverse());
        for(int i=k;i<s.length();i++){
            str1.append(s.charAt(i));
        }
        System.out.println(str1);
    }
    
}
