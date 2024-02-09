package threadhandling;

public class PrintNumbers {
    public static void  main(String[] args)
    {
        Thread even=new Thread(()->printEven());
        Thread odd=new Thread(()->printOdd());
        even.start();
        odd.start();
    }
    public static void printEven()
    {
        for(int i=2;i<=60;i+=2)
        {
            System.out.println(i);
        }
    }
    public static void printOdd()
    {
        for(int i=1;i<=60;i+=2)
        {
            System.out.println(i);
        }
    }

}
