package exceptionhandling;

public class Conversion {
    public static int convertStringToInt(String str)
    {
        try
        {
            return Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid input");
            return 0;

        }

    }


}
