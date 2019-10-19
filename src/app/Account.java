package app;

/**
 * Account
 */
public abstract class Account implements IBaseRate {
    // unique number
    static int uniqueDigitNumbers = 73450;

    String name;
    String securityNumber;
    String accountNumber;

    double rate;
    double balance;

    /**
     * constructor
     */
    public Account(String name, String securityNumber, double balance) {
        // unique number +1 for every new account;
        uniqueDigitNumbers++;

        this.name = name;
        this.securityNumber = securityNumber;
        this.balance = balance;
        this.accountNumber = setAccountNumber();

        setBaseRate();

    }

    public void compound() {

        double interest = this.balance * (this.rate / 100);

        this.balance += interest;

        System.out.println("Accrued Interest : $" + interest);

    }

    // Accounts methods
    public void deposit(double amount) {

        this.balance += amount;

        System.out.println("Depositing $" + amount + "\n");

        showBalance();

    }

    public void showBalance() {

        System.out.println("Your Total balance is $" + this.balance + "\n");

    }

    public void withdraw(double amount) {

        this.balance -= amount;

        if (this.balance <= 0) {

            System.out.println("Sorry can't withdraw, You have $0 in your account" + "\n");

            this.balance = 0;

            showBalance();

        } else {

            System.out.println("Withdrawing $" + amount + "\n");

            showBalance();
        }
    }

    public void transfer(String location, double amount) {

        this.balance -= amount;

        System.out.println("Transfering $" + amount + " to " + location + "\n");

        showBalance();

    }

    // set rate for both childs
    public abstract void setBaseRate();

    // set digital account number
    private String setAccountNumber() {

        String last2SecurityNumbers = this.securityNumber.substring(this.securityNumber.length() - 2,
                this.securityNumber.length());

        int random3Numbers = (int) (Math.random() * Math.pow(10, 3));

        return last2SecurityNumbers + uniqueDigitNumbers + random3Numbers;

    }

    // method to print info about account

    public void showInfo() {
        System.out.println("Account Name: " + this.name + "\n");
        System.out.println("Account Number: " + this.accountNumber + "\n");
        System.out.println("Balance: $" + this.balance + "\n");
        System.out.println("Rate: " + rate + "%" + "\n");
    }

}