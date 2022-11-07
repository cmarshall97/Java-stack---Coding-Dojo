class TestBankAccount {
    public static void main (String[] args){
        //below we are running a new constructor
        BankAccount account1 = new BankAccount();
        // System.out.println(account.getCheckingBalance());
        // System.out.println(account.getSavingsBalance());
        BankAccount account2 = new BankAccount(500.00, 1000.00, 2, 1500);
        System.out.println("Checkings: " + account2.getCheckingBalance());
        System.out.println("Savings: " + account2.getSavingsBalance());
        System.out.println("Number of accounts: " + BankAccount.getNumOfAccounts());
    }
}