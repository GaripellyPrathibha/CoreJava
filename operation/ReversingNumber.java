package operation;

public class ReversingNumber {
    public static void main(String[] args)
    {
        int number=12345;
        int revNumber=0,rem;
        while(number>0)
        {
            rem=number%10;
            revNumber=(revNumber*10)+rem;
            number=number/10;
        }
        System.out.println(revNumber);

    }

}
