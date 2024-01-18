package arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args)
    {
        int n,i,temp,j,x;
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number of left position to move the array ");
        x=sc.nextInt();
        x=x%n;
        for (i = 0; i < x; i++) {
            temp = a[0];
            for (j = 0; j < n - 1; j++) {
                a[j] = a[j + 1];
            }
            a[n - 1] = temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

    }
}
