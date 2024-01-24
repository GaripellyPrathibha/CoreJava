package arraylistImplementation;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    double gpa;


    public Student(String firstName,String lastName,double gpa) {
        this.firstName=firstName;
        this.lastName = lastName;
        this.gpa=gpa;
    }

    public static void main(String[] args)
    {

        ArrayList<Student> students=new ArrayList<>();
        double averageGpa;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter first name or exit to finish");
            String firstName = sc.nextLine();
            if (firstName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter last name: ");
            String lastName = sc.nextLine();
            System.out.print("Enter GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();
            students.add(new Student(firstName,lastName,gpa));

        }

        averageGpa = calculateAverage(students);
        removeStudents(students,averageGpa);
        for(Student student:students)
        {
            System.out.println("first name="+student.firstName);
            System.out.println("last name="+student.lastName);
            System.out.println("gpa="+student.gpa);
        }


    }

    private static double calculateAverage(ArrayList<Student> students) {
        double total=0.0;
        for( Student student:students)
        {
            total+=student.gpa;
        }
        total=total/ students.size();
        return total;
    }

    private static void removeStudents(ArrayList<Student> students, double averageGpa) {

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.gpa < averageGpa) {
                iterator.remove(); // Safe removal using the iterator
            }
        }
            /*for(Student student:students)
        {
            if(student.gpa<averageGpa)
            {
                students.remove(student);
            }
        }*/
    }
}
