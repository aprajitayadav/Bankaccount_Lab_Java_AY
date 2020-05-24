package bankaccountapp;

public interface ibaserate {
    // Write a methods that returns base rate.
    default double getbaserate() {
        return 2.5;
    }
}