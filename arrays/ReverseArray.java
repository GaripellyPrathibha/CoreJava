package arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args)
    {
        int n,i,temp,j;
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        for(i=0;i<n/2;i++)
        {
            temp=a[i];
            j=n-i-1;
            a[i]=a[j];
            a[j]=temp;

        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
