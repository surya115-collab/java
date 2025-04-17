public class AcronymString {
    public static void main(String[] args) {
        String[] arr={"apple","banana"};
        String s="ab";
        StringBuilder sb=new StringBuilder();
        for(String i:arr){
            sb.append(i.charAt(0));
        }
        String s1=sb.toString();
        if(s1.equals(s)){
            System.out.println("true");
        }
        else{
        System.out.println("false");
    }
}
    
}
