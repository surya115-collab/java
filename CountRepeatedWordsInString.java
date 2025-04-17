public class CountRepeatedWordsInString {
    public static int countWord(String s,String word){
        int count=0;
        String[] str=s.split(" ");
        for(String i:str){
            if(i.equals(word)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="I am thinking the I can write the code";
        String word="I";
        int res=countWord(str,word);
        System.out.println(res);
    }    
}
