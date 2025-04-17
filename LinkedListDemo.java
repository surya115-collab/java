public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(4);
        list.add(3);
        list.add(6);
        list.addFirst(8);
        list.add(9);
        list.delete(6);
        list.printValues();
    }
    
}
