import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public static boolean isvalid(String s){
        Stack<Character> stack=new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='{'){
                stack.add('}');
            }
            else if(i=='['){
                stack.add(']');
            }
            else if(i=='('){
                stack.add(')');
            }
            else if(stack.isEmpty() || stack.pop()!=i){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the paranthesis string to be checked : ");
        String s=sc.next();
        boolean res=isvalid(s);
        System.out.println(res);
        }
    }
    
}
