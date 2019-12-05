/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


/**
 *
 * @author Daragh
 */
public class accounts {
    
    private String accNumber;
    private String accholder;
    private double balance;
    
    public accounts(String accNumber,String accHolder, double accBalance){
        this.accNumber = accNumber;
        this.accholder = accHolder;
        this.balance = accBalance;
        
    }
    
    public void withdraw(double m) { /// m = money
     this.balance = this.balance -m; ///how the program will withdraw money
     
}
    public void deposit(double amount) {
        this.balance = this.balance +amount; ///how the program will deposit the money 
    }
    public void transfer(Accounts a, double amount){
      this.withdraw(amount);
      a.deposit(amount);
    }
    public String getAccountHolder() {
        return this.accholder;
    }
    public double getBalance(){
        return this.balance;
    }
    
    @Override
    public String toString() {
        return this.accNumber;
    }
}