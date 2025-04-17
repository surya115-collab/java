class LongestString{
    public static void longestStr(String s){
        String[] ar=s.split("\\s+");
        String max="";
        for(String word:ar){
            if(word.length()>max.length()){
                max=word;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        String str="i am surya srinivas";
        longestStr(str);
    }
}
// import java.util.Scanner;

// public class LongestString {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input: Ask the user to enter a sentence
//         System.out.print("Enter a sentence: ");
//         String sentence = scanner.nextLine();

//         // Split the sentence into words
//         String[] words = sentence.split("\\s+");

//         // Initialize the longest word variable
//         String longestWord = "";

//         // Iterate over the words to find the longest one
//         for (String word : words) {
//             if (word.length() > longestWord.length()) {
//                 longestWord = word;
//             }
//         }

//         // Output the longest word
//         System.out.println("The longest word is: " + longestWord);
//     }
// }
