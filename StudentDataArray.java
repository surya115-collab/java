
import java.util.Scanner;

class Student{
    String name;
    int marks; 
}
public class StudentDataArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Student s1=new Student();
            System.out.println("Enter name of s1 :");
            s1.name=sc.next();
            System.out.println("Enter marks of s1 :");
            s1.marks=sc.nextInt();

            Student s2=new Student();
            System.out.println("Enter name of s2 :");
            s2.name=sc.next();
            System.out.println("Enter marks of s2 :");
            s2.marks=sc.nextInt();

            Student s3=new Student();
            System.out.println("Enter name of s3 :");
            s3.name=sc.next();
            System.out.println("Enter marks of s3 :");
            s3.marks=sc.nextInt();

            Student studentArray[]=new Student[3];
            studentArray[0]=s1;
            studentArray[1]=s2;
            studentArray[2]=s3;

            System.out.println("The names and their marks are : ");
            for(Student i : studentArray){
                System.out.println(i.name+" : "+i.marks);
            }
        }
    }
    
}
