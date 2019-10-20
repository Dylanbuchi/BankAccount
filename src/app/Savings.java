package app;

/**
 * Savings
 */
public class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    /**
     * @param name
     * @param securityNumber
     * @param balance
     */
    public Savings(String name, String securityNumber, double balance) {
        super(name, securityNumber, balance);

        accountNumber = "2" + accountNumber;

        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        this.safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));

    }

    @Override
    public void showInfo() {

        System.out.println("Account Type: Saving Account" + "\n");
        super.showInfo();
        System.out.println("Your safety deposit key: " + this.safetyDepositBoxKey + "\n");
        System.out.println("Your safety deposit ID: " + this.safetyDepositBoxID + "\n");
    }

    @Override
    public void setBaseRate() {
        rate = getBaseRate() - .25;

    }

}