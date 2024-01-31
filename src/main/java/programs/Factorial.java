package programs;

public class Factorial {
    static int checkFactorial(int num)
    {
        int total=1;
        for(int i=1;i<=num;i++)
        {
            total=total*i;
        }
        return total;
    }
}
