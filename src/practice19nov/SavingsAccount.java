/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice19nov;

public class SavingsAccount extends BankAccount {

    double balance = 1000.35;

    
    @Override
    public void deposit(int amount) {
    balance +=amount;
    }
    
    
    @Override
    public void withdraw(int amount) {
        
        if (this.balance - amount > 100) {
            System.out.println("Withdraw is Successful");
        } else {
            System.out.println("Do not have sufficient balance to Withdraw");
        }
    }

}
