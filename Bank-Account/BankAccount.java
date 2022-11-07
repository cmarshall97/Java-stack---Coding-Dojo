public class BankAccount {
    //class attributes/member variables
    private double checkingBalance;
    private double savingsBalance;
    //Static class members
    public static int numOfAccounts = 0;
    public static double totalMoney = 0;

//getter and setter method help make the private attributes accessible outside of the class

//setter method
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

//getter method
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

//setter method
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

//getter method
    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public static int getNumOfAccounts(){
        return numOfAccounts;
    }

//constructor is the function that builds the application (no data type)
//BankAccount constructor that takes in each parameter for account2
    public BankAccount (double checkingBalance, double savingsBalance, int numOfAccounts , double totalMoney){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++; //anytime constructor is run it increases by one
    }

//constructor that takes in no parameters for account1 (zero argument constructor)
    public BankAccount(){
        numOfAccounts++; //anytime constructor is run it increases by one
    }

//method to allow a user to deposit in savings or checkings and track the total money
    public double makeDeposit(double checkingBalance, double savingsBalance){
        double totalMoney = setCheckingBalance + setSavingsBalance;
        return totalMoney;
    }

//method to withdraw money and make sure there are sufficient funds
    public double withdrawMoney(double withdraw){
        if double withdraw <=0
    }
    

//method to see the total money from checking and savings
    public double reviewTotal (double checkingBalance, double savingsBalance){
        double totalMoney = checkingBalance + savingsBalance;
        return totalMoney;
    }
}
