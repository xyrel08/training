public class OOPBankAccount_Genio {
    private String accountNumber;
    private double balance;

    public OOPBankAccount_Genio(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: P" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: P" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public void setBalance(double balance) {
        this.balance=balance;
    }
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
 class SavingsAccount extends OOPBankAccount_Genio {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}

// CheckingAccount class (subclass of BankAccount)
 class CheckingAccount extends OOPBankAccount_Genio {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: P" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
