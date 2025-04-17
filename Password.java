public class Password{
    public static void main(String[] args) {
        String s = "aA1_67";
        System.out.println(isValid(s));
    }
    static int isValid(String s){
        if(s.length()<4) return 0;
        if(!(Character.isDigit(s.charAt(0)))){
            if(!((s.contains(" ")) || (s.contains("/")))){
                if(!s.equals(s.toLowerCase())){
                    if(s.matches(".*\\d.*")) return 1;
                    return 0;
                }
            }
            return 0;
        }
        return 0;
    }
}