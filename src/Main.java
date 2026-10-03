public class Main {
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
        if (amount > 0 && amount <= balance){
            this.balance -= amount;
        }
    }
}

