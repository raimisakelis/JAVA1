package lt.bt.task;

import java.util.Arrays;

public class Client extends Person implements Payment {


    public Client(String accountOwner, String bankAccount, double[] amount) {
        super(accountOwner, bankAccount, amount);
    }

    @Override
    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public String getAccountOwner() {
        return accountOwner;
    }

    @Override
    public double[] getAmount() {
        return amount;
    }

    @Override
    public String toString(){
        return getAccountOwner() + "\n" + getBankAccount() + "\n" +  Arrays.toString(getAmount());
    }

}
