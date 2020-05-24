package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class bankaccountapp {
    public static void main(String[] args) {
        List<account> account = new LinkedList<account>();

        String file = "C:\\Users\\admin\\Desktop\\WIN2020\\Java\\bankaccountapp\\newbankaccounts.csv";
        // Read a csv file crate new accounts based on the data.

        List<String[]> newaccountholder = utilities.CSV.read(file);
        for (String[] accountholder : newaccountholder) {
            String name = accountholder[0];
            String ssn = accountholder[1];
            String accounttype = accountholder[2];
            double initdeposit = Double.parseDouble(accountholder[3]);
            // System.out.println(name + " " + ssn + " " + accounttype + " " + initdeposit);
            if (accounttype.equals("Savings")) {
                // System.out.println("OPEN A SAVINGS ACCOUNT");
                account.add(new savings(name, ssn, initdeposit));
            } else if (accounttype.equals("Checking")) {
                // System.out.println("OPEN A CHECKING ACCOUNT");
                account.add(new checking(name, ssn, initdeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (account acc : account) {
            System.out.println("*******************************");
            acc.showinfo();
        }
        // account.get(5).showinfo();

        // checking chkacc1 = new checking("Tom Wilson", "123456789", 1500);
        // savings savacc1 = new savings("Rich Lowe", "435343567", 2500);

        // chkacc1.showinfo();
        // System.out.println("*********************************");
        // savacc1.showinfo();

        // savacc1.deposit(5000);
        // savacc1.withdraw(200);
        // savacc1.transfer("Brokerage", 3000);
        // savacc1.compound();

        // Read a csv file crate new accounts based on the data.

    }
}