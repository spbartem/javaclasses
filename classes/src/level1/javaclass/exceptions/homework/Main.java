package level1.javaclass.exceptions.homework;

public class Main {
    private String accHolder = "accHolderName";
    private int balanceAmount = 10000;

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        try {
//            m1.withdrawCash("accHolderName", 5000);
//            m1.withdrawCash("accHolderName", 11000);
            m1.withdrawCash("noAccHolderName", 5000);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }

    }

    public void withdrawCash(String nameAcc, int amount) throws InsufficientFundsException {
        if (balanceAmount < amount) {
            throw new InsufficientFundsException("No enough money in the account");
        }
        if (getAccHolder() != nameAcc) {
            throw new AccessDeniedException("You don't have access to this account");
        }

        setBalanceAmount(getBalanceAmount() - amount);
        System.out.println("All OK. The balance of funds on your account is " + (getBalanceAmount()));
    }

}
