package hashmapImplementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMapTest {
    @Test
    public void testStudent()
    {
        StudentMap map = new StudentMap();
        Student student = map.getStudent("chicky");
        assertEquals("chicky", student.firstName);
        assertEquals("Gari", student.lastName);
        assertEquals(9.5, student.gpa);

    }
    @Test
    public void testInvalidStudent() {
        StudentMap map = new StudentMap();
        Student student = map.getStudent("invalid");
        assertNull(student);
    }

}
