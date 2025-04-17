public class Encapsulation {
    static class Addition{
        int a=9;
        int b=7;
        int c;
        public void calc(){
            int c=a+b;
            System.out.println(c);
        }

    }
    public static void main(String[] args) {
        {
            Addition add=new Addition();
            add.calc();
        }
    }
    
}
