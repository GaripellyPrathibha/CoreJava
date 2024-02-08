package exceptionhandling;

import java.util.Scanner;

public class ImplementBankAccount  {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(5000.0);
            System.out.println("Enter withdrawal amount");
            Scanner sc=new Scanner(System.in);
            double amount=sc.nextDouble();
            account.withdraw(amount);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.out.println(e.getMessage());
        }
    }

}
