/* 
 * DO NOT TOUCH THIS !
 */

public class Account {

    private double balance;
    private String owner;
    
    public static void main(String[] args) {
       
    System.out.println("nigga");
    
    Account myAccount = new Account("My Account", 100.00);
    
    myAccount.deposit(20.0); 
    
    System.out.println(myAccount.saldo());
        
        System.out.println("nigga");
    
    }
    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }

    public double saldo() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
