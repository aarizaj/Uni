import java.util.Scanner;
public class BankAcc{
  private int Pin;
  private int balance;
  private static int nrofacc;
  public showBalance(){
    System.out.println("Balance: "+balance);
  }
  public void wishdraw(int money){
    balance=balance-money;
    showBalance();
  }
  public void deposit(int money){
    balance=balance+money;
    showBalance();
  }
  public changePin(int balance,int Pin){
    this.balance=balance; //this. specifies which is the balance inside and which outside of function
    this.Pin=Pin;
    /* CHANGE PIN
    System.out.println("Please enter the old PIN: ");
    Scanner input=new Scanner(System.in);
    Pin=input.nextInt();
    */
  }
  public class Ushtrim{
    public static void main(String args[]){
      BankAcc NAME=new BankAcc(990,1234);
    }
  }
}
