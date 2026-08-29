// File: Account.java
public class Account {
    // Private variables (fields) hide the data so it can't be changed directly from outside
    private int accountNumber;
    private String name;
    private int age;
    private double balance;
    private String accountType;
    private String status;

    // The Constructor: This runs once when you create a new Account using 'new Account(...)'
    public Account(int accountNumber, String name, int age, double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.age = age;
        this.balance = initialBalance;
        this.accountType = accountType;
        this.status = "Active"; // Default status as requested
    }

    public boolean deposit(double amount) {
        // Stop invalid deposits
        if (amount <= 0) {
            return false; 
        }
        
        // Add money to balance
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        // Check if amount is invalid OR if trying to withdraw more than the balance
        if (amount <= 0 || this.balance < amount) {
            return false;
        }
        
        // Subtract money
        this.balance -= amount;
        return true;
    }

    // --- Getters (Read the data) ---
    public int getAccountNumber() { return accountNumber; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    public String getStatus() { return status; }
    
    // --- Setters (Update the data) ---
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
}