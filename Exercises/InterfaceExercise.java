package Exercises;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

interface Account{
    public void deposit(double money);
    public void withdraw(double money);

    public void displayBalance();

    public void calculateInterest();

}

class SavingsAccount implements Account{
    private int  accNo;
    private String accHolder;
    private final LocalTime time = LocalTime.now();
    private double balance = 0;

    SavingsAccount(int no,String name,double bal){
        this.accNo = no;
        this.accHolder = name;
        this.balance = bal;
    }
    public LocalTime getTime(){
        return time;
    }
    public void deposit(double money){
        balance = balance + money;
        displayBalance();
    }
    public void withdraw(double money) {
        if (money < balance) {
            balance = balance - money;
        } else {
            System.out.println("Money is less Please deposit money or enter less money than " + (balance - 500));

        }
    }
    public void calculateInterest(){
        System.out.println("Balance Before Adding Interest "+balance);
        balance = balance + (balance *(2.30/100));
        System.out.println("Balance After Adding Interest "+balance);

    }

    public void displayBalance(){
        System.out.println("Current balance is "+ balance);
    }


}

class CurrentAccount implements Account {
    private int accNo;
    private String accHolder;
    private final LocalTime time = LocalTime.now();
    private double balance = 0;

    CurrentAccount(int no, String name, double bal) {
        this.accNo = no;
        this.accHolder = name;
        this.balance = bal;
    }
    public LocalTime getTime(){
        return time;
    }

    public void deposit(double money) {
        balance = balance + money;
        displayBalance();
    }

    public void withdraw(double money) {
        if ((balance - money) > 5000 ) {
            balance = balance - money;
        } else {
            System.out.println("Money is less Please deposit money or enter less money than " + (balance - 5000));

        }
    }

    public void calculateInterest() {
        System.out.println("Balance Before Adding Interest " + balance);
        balance = balance + (balance * (5 / 100));
        System.out.println("Balance After Adding Interest " + balance);

    }

    public void displayBalance() {
        System.out.println("Current balance is " + balance);
    }

}

class Bank{
    private List<Account> l;

    Bank(){
        l = new ArrayList<>();
    }

    public void addAccount(Account a){
        l.add(a);
    }
    public void removeAccount(Account a){
        l.remove(a);
    }

    public void deposit(Account a, double money){
        a.deposit(money);
    }
    public void withdraw(Account a,double money){
        a.withdraw(money);
    }
    public void ShowInterest(Account a){
        a.calculateInterest();
    }
    public void display(Account a){
        a.displayBalance();
    }

}

public class InterfaceExercise {

    public static void main(String args[]) throws InterruptedException {
        Bank b = new Bank();
        Account savingsAcc = new SavingsAccount(1,"Sumanth",5000);
        Thread.sleep(1000);
        Account currentAcc = new CurrentAccount(2,"Sumanth",10000);
        Thread.sleep(1000);
        Account currentAcc1 = new CurrentAccount(2,"Virinchi",10000);
        Thread.sleep(1000);
        b.addAccount(savingsAcc);
        b.addAccount(currentAcc);

        b.display(savingsAcc);
        b.display(currentAcc);
        b.display(currentAcc1);

        b.deposit(currentAcc,2000);
        b.withdraw(currentAcc1,9000);
        System.out.println(((SavingsAccount) savingsAcc).getTime());
        System.out.println(((CurrentAccount) currentAcc).getTime());
        System.out.println(((CurrentAccount) currentAcc1).getTime());

    }
}
