

public class CountingChairs {
    public static int countChair(String s){
        int count=0,res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                count++;
            }
            else if(s.charAt(i)=='L'){
                count--;
            }
            res=Math.max(count,res);
        }
        return res;

    }
    public static void main(String[] args) {
    String str="LELELEEE";
    int ans=countChair(str);
    System.out.println(ans);
    }
    
}
