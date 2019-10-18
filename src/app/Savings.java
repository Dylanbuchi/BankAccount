package app;

/**
 * Savings
 */
public class Savings extends Account {
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    /**
     * @param name
     * @param securityNumber
     * @param balance
     */
    public Savings(String name, String securityNumber, double balance) {
        super(name, securityNumber, balance);
    }

}