package learning.oop;

// Restored from commit 62ff2b97; adapted for a standalone lesson.
// Run this class's main() in IntelliJ IDEA.
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1456);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(500);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(300);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(5000);
        System.out.println(bankAccount.getBalance());
    }
}

class BankAccount{
    // Encapsulation: outside code cannot modify balance directly.
    private double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
    double getBalance(){
        return balance;
    }
    void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
        }
    }
    void withdraw(double amount){
        // Avoid withdrawing more than the available balance.
        if (amount > 0 && amount <= balance){
            this.balance -= amount;
        }
    }
}
