package app;

public class BankAccountApp {
    public static void main(String[] args) throws Exception {

        Checking checkAcc01 = new Checking("Jon will", "123456789", 1200);

        Savings saveAcc01 = new Savings("James Lowl", "234567890", 300);
        // Read CVS file and create new accounts based on the file data

        // checkAcc01.showInfo();

        // System.out.println("****************************" + "\n");

        // saveAcc01.showInfo();

        saveAcc01.compound();

    }
}