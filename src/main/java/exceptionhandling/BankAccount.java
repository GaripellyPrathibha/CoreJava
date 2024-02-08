package exceptionhandling;

class BankAccount {
    public double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {

        if (amount > balance) {
            throw new InsufficientFundsException(" Attempting to withdraw more money than the account balance.");
        } else if (amount < 0) {
            throw new InvalidWithdrawalException(" Attempting to withdraw a negative amount.");
        }
        balance=balance - amount;
        System.out.println("Successful withdrawal and new balance is "+balance);

    }
}

