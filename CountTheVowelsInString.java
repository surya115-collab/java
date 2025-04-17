
import java.util.Scanner;

public class CountTheVowelsInString {
    public static int countVowels(StringBuilder s,int option){
        int vowelCount=0,consonantCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowelCount++;
            }
            else{
                consonantCount++;
            }
        }
        if(option==1){
            return vowelCount;
        }
        else{
            return consonantCount;
        }

    }
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        String s="surya srinivas";
        str.append(s);
        System.out.println("1.vowelCount 2.consonantCount");
        System.out.println("enter your choice");
        int option=sc.nextInt();
        int res=countVowels(str,option);
        System.out.println("the vowels in "+str+" is : "+res);
    }
    
}
