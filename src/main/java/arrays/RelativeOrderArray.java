package arrays;

import java.util.Scanner;

public class RelativeOrderArray {
    public static void main(String[] args) {
        int n, i, temp, j;
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int z = 0;
        for ( i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp = a[i];
                a[i] = a[z];
                a[z] = temp;
                z++;
            }
        }
       /* for(i=n-1;i>0;i--)
        {
            if(a[i]>a[i-1]&&a[i-1]==0)
            {
                temp=a[i];
                a[i]=a[i-1];
                a[i-1]=temp;
            }
        }*/
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
