class BankAccount {
    int accountId;
    String name;
    double balance;
    public BankAccount(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }
    public void transferTo(BankAccount receiver, double amount) {
        if (balance >= amount) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient funds for the transfer.");
        }
    }
    public void printReceipt() {
        System.out.println("Account id: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Account Balance: Rs." + balance);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount(12344, "XXXX", 5000);
        BankAccount accountB = new BankAccount(56789, "YYYY", 2500);
        accountA.transferTo(accountB, 1500);
        accountA.printReceipt();
        accountB.printReceipt();
        accountB.transferTo(accountA, 3000);
        accountA.printReceipt();
        accountB.printReceipt();
    }
}
