package bankaccountapp;

public abstract class account implements ibaserate {
    // List common properties for savings and checking accounts.
    private String name;
    private String ssn;
    private double balance;

    static int index = 10000;
    protected String accountnumber;
    protected double rate;

    // Constructor to set base properties and initialize the account.
    public account(String name, String ssn, double initdeposit) {
        this.name = name;
        this.ssn = ssn;
        this.balance = initdeposit;

        // Set account number.
        index++;
        this.accountnumber = setaccountnumber();
        setrate();
    }

    public abstract void setrate();

    private String setaccountnumber() {
        String lasttwossn = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueid = index;
        int randomnumber = (int) (Math.random() * Math.pow(10, 3));
        return lasttwossn + uniqueid + randomnumber;
    }

    public void compound() {
        double accruedinterest = balance * (rate / 100);
        balance = balance + accruedinterest;
        System.out.println("Accrued Interest: $" + accruedinterest);
        printbalance();
    }

    // Common Methods. (Deposit/Withdraw/etc.)

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printbalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printbalance();
    }

    public void printbalance() {
        System.out.println("Your balance is now: " + balance);
    }

    public void transfer(String towhere, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " to " + towhere);
        printbalance();
    }

    public void showinfo() {
        System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountnumber + "\nBALANCE: " + balance + "\nRATE: "
                + rate + "%");
    }
}