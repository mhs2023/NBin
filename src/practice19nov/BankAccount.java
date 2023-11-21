package practice19nov;

public class BankAccount {

    double balance = 1000.35;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount ;
    }
    
}
