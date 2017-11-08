package java중간고사;

public class BankAccout {
    private int accountNumber=0;;
    private int balance=0;;
    // Constructor
    
    public boolean deposit(int amount) {
        if (amount > 0) {
            return true;
        } else if (amount < 0) {
            return false;
        }
        return false;
        
    }
    
    public boolean withdraw (int amount){
        if(balance>amount){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean transfer(int amount){
        if(balance>amount){
            return true;
        }
        else {
            return false;
        }
    }
    // getter & setter
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    // toString
    
    @Override
    public String toString() {
        return "BankAccout [accountNumber=" + accountNumber + ", balance="
                + balance + "]";
    }
    
    // Constructor
    public BankAccout() {
        super();
    }
    
    public BankAccout(int accountNumber, int balance) {
        super();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
}
