package bankaccountapp;

public class savings extends account {
    // List properties specific to savings account.
    private int safetydepositboxid;
    private int safetyboxdepositkey;

    // Constructor to initialize savings account properties.
    public savings(String name, String ssn, double initdeposit) {
        super(name, ssn, initdeposit);
        accountnumber = "1" + accountnumber;
        setsafetydepositbox();
    }

    @Override
    public void setrate() {
        rate = getbaserate() - .25;
    };

    private void setsafetydepositbox() {
        safetydepositboxid = (int) (Math.random() * Math.pow(10, 3));
        safetyboxdepositkey = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to savings account.

    public void showinfo() {
        System.out.println("ACCOUNT TYPE: SAVINGS");
        super.showinfo();
        System.out.println("Your Savings Account Features" + "\nSafety Deposit Box ID is: " + safetydepositboxid
                + "\nSafety Deposit Box Key is: " + safetyboxdepositkey);
    }

}