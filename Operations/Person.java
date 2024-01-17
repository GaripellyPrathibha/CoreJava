package Operations;

import java.util.Scanner;

public class Person {

    public static String findAge(int age)
    {
        if(age<13)
        {
            return "kid";
        }
        else if(age>=13 &&age<=19)
        {
            return "teen";
        }

        return "adult";


    }
    public static void main(String[] args)
    {
        int age;
        Scanner sc= new Scanner(System.in);
        age=sc.nextInt();
        System.out.println("The person is "+Person.findAge(age));

    }


}
