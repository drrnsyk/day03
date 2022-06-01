package workshop.core;

public class Main {
    public static void main(String[] args) {
        // instantiate a car
        BankAccount myAccount = new BankAccount("Darren Sim");
        
        myAccount.getAccountName();
        myAccount.getAccountNumber();
        myAccount.getAccountBalance();
        
        myAccount.deposit(100);
        myAccount.deposit(400);

        myAccount.getAccountBalance();
        myAccount.getTransactions();

        myAccount.withdraw(200);

        myAccount.getAccountBalance();
        myAccount.getTransactions();
        //myAccount.printAccount();
        //myAccount.printBal();
    }

}

