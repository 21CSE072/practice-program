
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

class SavingsAccount implements Account {
    private double balance;

   
    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double checkBalance() {
        System.out.println("Savings Account Balance: " + balance);
        return balance;
    }
}


class CheckingAccount implements Account {
    private double balance;


    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double checkBalance() {
        System.out.println("Checking Account Balance: " + balance);
        return balance;
    }
}

class LoanAccount implements Account {
    private double balance;

   
    public LoanAccount(double loanAmount) {
        this.balance = -loanAmount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Paid towards Loan: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from Loan Account");
    }

    @Override
    public double checkBalance() {
        System.out.println("Loan Account Balance: " + balance);
        return balance;
    }
}


public class Main {
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount(1000.0);
        CheckingAccount checkingAccount = new CheckingAccount(1500.0);
        LoanAccount loanAccount = new LoanAccount(5000.0);

       
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.checkBalance();

        checkingAccount.deposit(1000.0);
        checkingAccount.withdraw(800.0);
        checkingAccount.checkBalance();

        loanAccount.deposit(1000.0);
        loanAccount.checkBalance();
    }
}
