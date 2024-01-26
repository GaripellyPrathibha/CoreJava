package hashmapImplementation;

import java.util.HashMap;

public class StudentMap{
    HashMap<String, Student> studentMap = new HashMap<>();

    public StudentMap() {
        studentMap = new HashMap<>();
        initializeStudents();
    }
    private void initializeStudents() {
        studentMap.put("chicky", new Student("chicky", "Gari", 9.5));
        studentMap.put("Pravalika", new Student("Pravalika", "Dandu", 9.8));
        studentMap.put("Manu", new Student("Manu", "Sdc", 7.9));
        studentMap.put("Sweety", new Student("Sweety", "Jfdv", 8.2));
        studentMap.put("Anu", new Student("Anu", "Wfv", 7.7));
        studentMap.put("Sara", new Student("Sara", "Tfd", 8.0));
        studentMap.put("Munna", new Student("Munna", "Wfve", 6.5));
        studentMap.put("vinni", new Student("vinni", "Derv", 7.9));
    }

    public Student getStudent(String firstName) {
        return studentMap.get(firstName);
    }

}
