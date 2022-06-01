package workshop.core;

public class FixedDepositAccount extends BankAccount {

    // members
    private float interest;
    private int duration;

    // constructors
    public FixedDepositAccount(String name, Float balance) {
    }

    public FixedDepositAccount(String name, Float balance, Float interest) {
    }

    public FixedDepositAccount(String name, Float balance, Float interest, Integer duration) {
    }

    // alternative way to write constructors if parent default constructor not specific
    // public FixedDepositAccount(String name, float initialBal) {
    //     // call the parent's class default constructor
    //     super(name, initialBal);
    // }
    // public FixedDepositAccount(String name, float initialBal, float interest) {
    //     super(name, initialBal); // ..
    //     this.interest = interest;
    // }
    // public FixedDepositAccount(String name, float initialBal, float interest, int duration) {
    //     this(name, initialBal, initialBal); // .
    //     this.duration = duration;
    // }

    // getter and setter
    @Override
    public float getAccountBalance() {
       return super.getAccountBalance() * .1f; 
    }

    // behaviour
    public void deposit(float deposit) {
        
    }

    public void withdraw(float withdraw) {

    }

    
    
}
