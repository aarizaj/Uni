public class TestAccount(){
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int id;
    double balance;
    double annualInterestRate;
    System.out.println("enter id: ");
    id=input.nextInt();
    balance=20000;
    annualInterestRate=4.5;
    input.close();

    Account user1=new Account(id,balance,annualInterestRate);
    user1=withdraw(2500);
    user1=deposit(3000);

    System.out.println("Balance: "+user1.getBalance());
    System.out.println("Monthly interest:"+user1.getMonthlyInterest());
    System.out.println("Date created: "+user1.getdateCreated());
  }
}
