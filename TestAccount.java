// File: TestAccount.java
public class TestAccount {
    public static void main(String[] args) {
        System.out.println("==============");
        System.out.println("GLOBAL DIGITAL BANK");
        System.out.println("ACCOUNT TEST");
        System.out.println("==============");
        
        System.out.println(">>> 1. Creating Account");
        Account acc1 = new Account(1001, "John Doe", 25, 1000.0, "Savings");
        System.out.println("Account created!");
        System.out.printf("Account #%d | %s (%d yrs) | %s | %.1f | %s\n",
            acc1.getAccountNumber(), acc1.getName(), acc1.getAge(), acc1.getAccountType(), acc1.getBalance(), acc1.getStatus());
        
        System.out.println(">>> 2. Deposit Money");
        boolean dep1 = acc1.deposit(500.0);
        if (dep1 == true) {
            System.out.println("Depositing 500.0: SUCCESS");
        } else {
            System.out.println("Depositing 500.0: FAILED");
        }
        System.out.println("New balance: ₹" + acc1.getBalance());
        
        boolean dep2 = acc1.deposit(-100.0);
        if (dep2 == true) {
            System.out.println("Depositing -100.0: SUCCESS");
        } else {
            System.out.println("Depositing -100.0: FAILED (Invalid amount)");
        }
        
        System.out.println(">>> 3. Withdraw Money");
        boolean with1 = acc1.withdraw(200.0);
        if (with1 == true) {
            System.out.println("Withdrawing 200.0: SUCCESS");
        } else {
            System.out.println("Withdrawing 200.0: FAILED");
        }
        System.out.println("New balance: ₹" + acc1.getBalance());
        
        boolean with2 = acc1.withdraw(2000.0);
        if (with2 == true) {
            System.out.println("Withdrawing 2000.0: SUCCESS");
        } else {
            System.out.println("Withdrawing 2000.0: FAILED (Insufficient balance)");
        }
        System.out.println("Current balance: ₹" + acc1.getBalance());
        
        System.out.println(">>> 4. Creating Another Account");
        Account acc2 = new Account(1002, "Jane Smith", 30, 2000.0, "Current");
        System.out.printf("Account #%d | %s (%d yrs) | %s | %.1f | %s\n",
            acc2.getAccountNumber(), acc2.getName(), acc2.getAge(), acc2.getAccountType(), acc2.getBalance(), acc2.getStatus());
        
        System.out.println(">>> 5. All Accounts");
        System.out.printf("Account #%d | %s (%d yrs) | %s | %.1f | %s\n",
            acc1.getAccountNumber(), acc1.getName(), acc1.getAge(), acc1.getAccountType(), acc1.getBalance(), acc1.getStatus());
        System.out.printf("Account #%d | %s (%d yrs) | %s | %.1f | %s\n",
            acc2.getAccountNumber(), acc2.getName(), acc2.getAge(), acc2.getAccountType(), acc2.getBalance(), acc2.getStatus());
        
        System.out.println("==============");
        System.out.println("TEST COMPLETED!");
        System.out.println("==============");
    }
}