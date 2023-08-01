package Exercises.Inheritance;

class BankAccount{
    private int accNo;
    private float balance ;

    public BankAccount(int acc, float balance){
        this.accNo = acc;
        this.balance = balance;
    }

    public void withdraw(float amt){
        if(balance > amt){
            System.out.println("Withdraw the amount and Current balance "+ (balance - amt));
            balance = balance - amt;

        }
        else{
            System.out.println("Balance is less");
        }

    }
    public void setBalance(float amt){
        balance = amt;
    }
    public float getBalance(){
        return balance;
    }
    public void showBalance(){
        System.out.println("Balance is "+balance);
    }

}

class SavingsAccount extends BankAccount{

    SavingsAccount(int acc, float money){

        super(acc,money);
    }
    public void withdraw(int amt){
        if(getBalance() - amt < 100){
            System.out.println("Minimum balance should be maintained");
        }
        else{
            setBalance(getBalance()-amt);
        }
    }
    public void showType(){
        System.out.println("This is a savings account");
    }

}


public class InheritanceExerciseClass2 {
    public static void main(String args[]){

        SavingsAccount s = new SavingsAccount(123,900.00f);
        s.withdraw(100);
        s.showBalance();
        s.showType();
        s.withdraw(900);



    }

}
