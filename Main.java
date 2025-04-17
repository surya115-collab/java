class A extends Thread{
    public void run(){
        for (int i=0;i<=56;i++){
            System.out.println("in A");
            try{
            Thread.sleep(50);
            }catch(InterruptedException e){
                
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=67;i++){
            System.out.println("in B");
            try{
                Thread.sleep(20);
                }catch(InterruptedException e){
                    
                }
        }
    }
}
public class Main{
    public static void main(String[] args) {
        // LinkedList<Integer> list=new LinkedList<>();
        // Collections.addAll(list, 1,2,3,4,5);
        // Iterator<Integer> iter=list.iterator();
        // while(iter.hasNext()){
        //     Object element=iter.next();
        //     System.out.println(element);
        // }
        A o1=new A();
        B o2=new B();
        o1.setPriority(Thread.MIN_PRIORITY);

        o1.run();
        try{
            Thread.sleep(20);
            }catch(InterruptedException e){ 
            }
        o2.run();
    }

}