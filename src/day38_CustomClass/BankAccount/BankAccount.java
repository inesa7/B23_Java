package day38_CustomClass.BankAccount;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        if(amount<=0 ){
            System.out.println("Depositing amount cannot be negative or zero");
            return;
        }

        System.out.println("Deposit $"+ amount+ " to " + accountHolder+"'s account");
        balance+=amount;
    }

    public void withdraw(double amount){

        if(amount<=0){
            System.out.println("Withdraw amount can not be negative");
            return;
        }

        if(balance<=0){
            System.out.println("Insufficient balance");
            return; // user should not be able to withdraw money
        }

        if(amount>balance){
            balance-=35; // 35$ penalty charge will be added
        }

    }

    public void checkBalance(){
        System.out.println(accountHolder+"'s available balance is $"+balance);
    }







}
/*
BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions:
            1. CheckBalance,   2. deposit,  3. withdraw

        requirements:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance
 */