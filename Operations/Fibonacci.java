package operations;

public class Fibonacci {
    public static void main(String[] args)
    {
        int N=10,i=0,j=1,k=0,c;
        for (c=0;c<N;c++)
        {
            System.out.println(i);
            k=i+j;
            i=j;
            j=k;
        }

    }
}
