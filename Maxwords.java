public class Maxwords {
    public static void main(String[] args) {
        String[] s={"alice and bob loves leetcode","i think so too","this is great thanks very much"};
        int count=0;
        for (int i=0;i<s.length;i++){
            String[] s1=s[i].split(" ");
            if(count<s1.length){
                count=s1.length;
            }
        }
        System.out.println(count);
    }

    
}
