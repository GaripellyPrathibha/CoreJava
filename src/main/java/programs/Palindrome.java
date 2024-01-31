package programs;

public class Palindrome {
    static boolean checkPalindrome(int num)
    {
        int n=num;
        int reverse=0;
        while(num>0)
        {
            int rem=num%10;
            reverse=reverse*10+rem ;
            num=num/10;

        }
        return n==reverse;

    }

}
