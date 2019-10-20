package app;

import java.util.LinkedList;
import java.util.List;

import app.utilities.CsvFile;

public class BankAccountApp {
    public static void main(String[] args) throws Exception {

        final String file = "C:\\Users\\crypt\\Desktop\\MyJava\\Projects\\Udemy Projects\\BankAccount\\NewBankAccounts.csv";

        List<String[]> customersAccounts = CsvFile.readCsvFile(file);

        List<Account> accounts = new LinkedList<Account>();

        // inside Csv file
        for (String[] customerAcc : customersAccounts) {

            String name = customerAcc[0];
            String securityNumber = customerAcc[1];
            String accountType = customerAcc[2];

            double balance = Double.parseDouble(customerAcc[3]);

            // savings account
            if (accountType.equals("Savings")) {

                accounts.add(new Savings(name, securityNumber, balance));

            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, securityNumber, balance));

            } else {

                System.out.println("Cant' create an account for the moment.. \n Please try again later");
            }

        }
        // print all customers info
        for (Account account : accounts) {

            System.out.println("************************************\n");
            account.showInfo();

        }
        // some examples on how the methos works
        System.out.println("************************************\n");

        accounts.get(0).withdraw(200);

        System.out.println("************************************\n ");

        accounts.get(1).transfer("to my Paypal account", 24);

        System.out.println("************************************\n");

        accounts.get(2).deposit(1000);

        System.out.println("************************************\n");

        accounts.get(3).showBalance();

        System.out.println("************************************\n");

        System.out.println("Bye");
    }
}