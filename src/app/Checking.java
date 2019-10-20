package app;

/**
 * Checking
 */
public class Checking extends Account {

    private int debitCardNumber;
    private int debitCardPin;

    /**
     * @param name
     * @param securityNumber
     * @param balance
     */
    public Checking(String name, String securityNumber, double balance) {

        super(name, securityNumber, balance);

        accountNumber = "1" + accountNumber;

        setDebitCard();
    }

    private void setDebitCard() {

        this.debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        this.debitCardPin = (int) (Math.random() * Math.pow(10, 4));

    }

    @Override
    public void showInfo() {
        System.out.println("Account Type: Cheking Account" + "\n");
        super.showInfo();
        System.out.println("Your debit card number: " + debitCardNumber + "\n");
        System.out.println("Your debit card number: " + debitCardPin + "\n");

    }

    @Override
    public void setBaseRate() {
        rate = getBaseRate() * .15;

    }

}