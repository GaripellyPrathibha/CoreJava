package arrays;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        int n, i, j,s;
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search:");
        s=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==s)
            {
                System.out.println(" Found "+s+" at "+(i+1));
            }
        }
    }
}

