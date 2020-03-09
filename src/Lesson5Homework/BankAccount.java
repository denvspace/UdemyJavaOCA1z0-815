package Lesson5Homework;

public class BankAccount {
    int id;
    double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void popolnenieScheta (double amount){
        balance+=amount;
    }

    public void snyatieSoScheta(double amount){
        balance-=amount;
    }
}
