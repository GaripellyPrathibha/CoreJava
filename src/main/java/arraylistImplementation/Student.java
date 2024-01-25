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

    }

    static double calculateAverage(ArrayList<Student> students) {
        double total=0.0;
        for( Student student:students)
        {
            total+=student.gpa;
        }
        total=total/ students.size();
        return total;
    }

    static void removeStudents(ArrayList<Student> students, double averageGpa) {

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.gpa < averageGpa) {
                iterator.remove(); // Safe removal using the iterator
            }
        }
    }
}
