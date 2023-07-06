package Bank;

public class Savings extends Current {

    public float WithdrawlS(float amount) {
        if (amount > 20000) {
            return 0;
        } else {
            return WithdrawlC(amount);
        }
    }

    public float DepositS(float amount) {
        return DepositC(amount);
    }
