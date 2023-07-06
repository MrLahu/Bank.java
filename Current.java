package Bank;

public class Current {
    private float balance;

    public Current() {
        balance = 1000000;
    }

    public float getBalance() {
        return balance;
    }

    public void withdrawal(float amount) {
        balance -= amount;
    }

    public void deposit(float amount) {
        balance += amount;
    }
}
