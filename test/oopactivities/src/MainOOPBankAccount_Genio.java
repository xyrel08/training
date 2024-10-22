public class MainOOPBankAccount_Genio {
    public static void main(String[] args) {

        OOPBankAccount_Genio bankAccount = new OOPBankAccount_Genio("123456789", 10560.23);
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: P" + bankAccount.getBalance());
        bankAccount.deposit(500);
        System.out.println("Balance: P" + bankAccount.getBalance());
        bankAccount.withdraw(200);
        System.out.println("Balance: P" + bankAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount("987654321", 20586.87, 0.05);
        System.out.println("\nAccount Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: P" + savingsAccount.getBalance());
        savingsAccount.deposit(1000);
        System.out.println("Balance: P" + savingsAccount.getBalance());
        savingsAccount.withdraw(500);
        System.out.println("Balance: P" + savingsAccount.getBalance());
        double interest = savingsAccount.calculateInterest();
        System.out.println("Interest: P" + interest);
        System.out.println("Balance: P" + (savingsAccount.getBalance()+interest));

        CheckingAccount checkingAccount = new CheckingAccount("543216789", 32605.75, 500);
        System.out.println("\nAccount Number: " + checkingAccount.getAccountNumber());
        System.out.println("Balance: P" + checkingAccount.getBalance());
        checkingAccount.deposit(1500);
        System.out.println("Balance: P" + checkingAccount.getBalance());
        checkingAccount.withdraw(4000);
        System.out.println("Balance: P" + checkingAccount.getBalance());
        System.out.println("Overdraft Limit: P" + checkingAccount.getOverdraftLimit());
    }
}
