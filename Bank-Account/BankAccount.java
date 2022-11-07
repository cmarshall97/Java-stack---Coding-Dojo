public class BankAccount {
    //class attributes/member variables
    private double checkingBalance;
    private double savingsBalance;
    //Static class members
    public static int numOfAccounts = 0;
    public static int money = 0;

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
    public BankAccount (double checkingBalance, double savingsBalance, int numOfAccounts , int money){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++; //anytime cnstructor is run it increases by one
    }
//constructor that takes in no parameters for account1 (zero argument constructor)
    public BankAccount(){
        numOfAccounts++; //anytime cnstructor is run it increases by one
    }
}
