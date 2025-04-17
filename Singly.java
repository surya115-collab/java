import java.util.*;
class Node{
    public int data;
    public Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class Singly{
    public Node head;
    public boolean isEmpty(){
        return (head==null);
    }
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void delete(int key){
        Node temp=head,prev=null;
        if(temp!=null && temp.data==key){
            head=temp.next;
            return;
        }
        while(temp!=null && temp.data!=key){
            prev=temp;
            temp=temp.next;
            if(temp==null)return;
            prev.next=temp.next;
        }
    }
    public void displaylist(){
        if(isEmpty()){
            System.out.println("Nothimg to display");   
        }
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.err.println();
    }

    public static void main(String[] args) {
        Singly list = new Singly();
        Scanner sc=new Scanner(System.in);
        int op;
        while(true){
            System.out.println("1.Insert \n 2. Delete \n 3.Display \n 4.Exit");
            System.out.println("Enter your option");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter value: ");
                    int a=sc.nextInt();
                    list.insert(a);
                    break;
                case 2:
                    System.out.println("Enter value : ");
                    int c=sc.nextInt();
                    list.delete(c);
                    System.out.println("After Deletion: ");
                    list.displaylist();
                    break;
                case 3:
                    list.displaylist();
                    break;
                case 4:
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid option.please truy again");
                    break;
            }
        }
}
}