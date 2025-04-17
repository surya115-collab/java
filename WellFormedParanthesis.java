import java.util.*;
public class WellFormedParanthesis {
    public int maxCount(String s,int max){
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    max=Math.max(max,i-(st.peek()));
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the string to checked:");
        String s=sc.nextLine();
        int max=Integer.MIN_VALUE;
        WellFormedParanthesis obj=new WellFormedParanthesis();
        int res=obj.maxCount(s, max);
        // int res=maxCount(s,max);
        System.out.println(res);
        }
    }

}
