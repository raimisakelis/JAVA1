package lt.bt.task;

public abstract class Person {

    protected String accountOwner;
    protected String bankAccount;
    protected double[] amount;


    public Person(String accountOwner, String bankAccount, double[] amount) {
        this.accountOwner = accountOwner;
        this.bankAccount = bankAccount;
        this.amount = amount;
    }


}
