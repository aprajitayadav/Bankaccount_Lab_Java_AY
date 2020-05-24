package bankaccountapp;

public class checking extends account {

    // List properties specific to checking account.
    private int debitcardnumber;
    private int debitcardpin;

    // Constructor to initialize chekcing account properties.
    public checking(String name, String ssn, double initdeposit) {
        super(name, ssn, initdeposit);
        accountnumber = "2" + accountnumber;
        setdebitcardfunction();
    }

    @Override
    public void setrate() {
        rate = getbaserate() * .15;
    };

    private void setdebitcardfunction() {
        debitcardnumber = (int) (Math.random() * Math.pow(10, 12));
        debitcardpin = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to checking account.

    public void showinfo() {
        System.out.println("ACCOUNT TYPE: CHECKING");
        super.showinfo();
        System.out.println("Your Checking Account Features" + "\nDebit Card Number is: " + debitcardnumber
                + "\nDebit Card PIN is: " + debitcardpin);
    }
}