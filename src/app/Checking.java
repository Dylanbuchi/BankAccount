package app;

/**
 * Checking
 */
public class Checking extends Account {

    int debitCardNumber;
    int debitCardPin;

    /**
     * @param name
     * @param securityNumber
     * @param balance
     */
    public Checking(String name, String securityNumber, double balance) {
        super(name, securityNumber, balance);
    }

}