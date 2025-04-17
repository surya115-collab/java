
class String1 extends Thread{
    String str="surya";
   public void run(){
    try{
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            sleep(5000);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
   }
}
class String2 extends Thread{
    String str="surya";
    public void run(){
        try{
            for(int i=0;i<str.length();i++){
                System.out.println(str.charAt(i));
                sleep(5000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
        String1 str=new String1();
        str.start();
        String2 str2=new String2();
        str2.start();
    }
}
