class TestBankAccount {
    public static void main (String[] args){
        //below we are running a new constructor
        BankAccount account1 = new BankAccount();
        // System.out.println(account.getCheckingBalance());
        // System.out.println(account.getSavingsBalance());
        BankAccount account2 = new BankAccount(500.00, 1000.00, 2, 1500);
        // System.out.println("Checkings: " + account2.getCheckingBalance());
        // System.out.println("Savings: " + account2.getSavingsBalance());
        // System.out.println("Number of accounts: " + BankAccount.getNumOfAccounts());
        // System.out.println("Total Balance: " + account2.makeDeposit(100.00,50.00));
        BankAccount account3 = new BankAccount();
        account3.makeDeposit(2,"checking");
        account3.makeDeposit(200,"savings");
        System.out.println(account3.getCheckingBalance());
        System.out.println(account3.getSavingsBalance());

        account3.withdrawMoney(5,"checking");
        account3.withdrawMoney(500,"savings");
        System.out.println(account3.getCheckingBalance());
        System.out.println(account3.getSavingsBalance());
    }
}