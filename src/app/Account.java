package app;

/**
 * Account
 */
public class Account implements IBaseRate {

    String name;
    String securityNumber;
    String accountNumber;
    static int uniqueDigitNumbers = 73450;

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

        System.out.println(name + " " + securityNumber + " " + "$" + balance);
        System.out.println("Account Number: " + this.accountNumber);
    }

    // set digital account number
    public String setAccountNumber() {

        String last2SecurityNumbers = this.securityNumber.substring(this.securityNumber.length() - 2,
                this.securityNumber.length());

        int random3Numbers = (int) (Math.random() * Math.pow(10, 3));

        return last2SecurityNumbers + uniqueDigitNumbers + random3Numbers + "0";

    }

}