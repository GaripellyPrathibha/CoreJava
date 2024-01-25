package arraylistImplementation;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testRemoveStudents()
    {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Prathibha","Garipelly",9.8));
        students.add(new Student("Pravalika","Garipelly",9.8));
        double averageGpa=Student.calculateAverage(students);
        Student.removeStudents(students,averageGpa);
        assertEquals(2,students.size());


    }
    @Test
    public void testRemoveStudentsWithEmptyArray()
    {
        ArrayList<Student> students=new ArrayList<>();
        double averageGpa=Student.calculateAverage(students);
        Student.removeStudents(students,averageGpa);
        assertEquals(0,students.size());

    }
    @Test
    public void testRemoveStudentswithAllBelowAverage()
    {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Prathibha","Garipelly",6.5));
        students.add(new Student("Pravalika","Garipelly",5.0));
        double averageGpa=Student.calculateAverage(students);
        Student.removeStudents(students,averageGpa);
        assertEquals(1,students.size());


    }

}
