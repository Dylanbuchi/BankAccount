package app;

/**
 * Account
 */
public class Account implements IBaseRate {

    String name;
    String securityNumber;
    String accountNumber;

    double rate;
    double balance;

    /**
     * 
     */
    public Account(String name, String securityNumber, double balance) {
        this.name = name;
        this.securityNumber = securityNumber;
        this.balance = balance;

        System.out.println(name + " " + securityNumber + " " + "$" + balance);
    }

}