package day38_CustomClass.BankAccount;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Inesa", 123456789);
        account1.checkBalance();
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(999);
        account1.checkBalance();
        account1.withdraw(25);
        account1.checkBalance();
        account1.withdraw(10);
        account1.checkBalance();

        BankAccount account2 = new BankAccount();
        account2.setInfo("Nicole", 876543214);
        account2.deposit(1000);
        account2.checkBalance();
        account2.withdraw(500);
        account2.checkBalance();

    }
}
