import java.util.Scanner;
public class Student{
    public String name;
    public Student(String name)
    {
        this.name=name;
    }

    public String getName() {
         return name;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String studentName=scanner.nextLine();

        Student stu= new Student(studentName);
        System.out.println("My name is: "+stu.getName());
        scanner.close();


    }


}