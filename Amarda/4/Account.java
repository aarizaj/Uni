public class Account{
  private int id;
  private double balance;
  private double annualInterestRate=0;
  private Date dateCreated;

  public Account(){
    id=0;
    balance=0;
  }
  publiv Account(int id,double balance){
    this.id=id;
    this.balance=balance;
    this.annualInterestRate=annualInterestRate;
  }
  public int getid(){
    return id;
  }
  public double getbalance(){
    return balance;
  }
  public double getannualInterestRate(){
    return annualInterestRate;
  }
  public Date getdateCreated(){
    dateCreated=new Date();
    return dateCreated.from(Instant.now());
    }
    public void setid(int id){
    this.id=id;
  }
  public void setbalance(double balance){
    this.balance=balance;
  }
  public void setannualInterestRate(double annualInterestRate){
    this.annualInterestRate=annualInterestRate;
  }
  public double getMonthlyInterestRate(){
    double MonthlyInterestRate;
    MonthlyInterestRate=annualInterestRate/12;
    return MonthlyInterestRate;
  }
  public double getMonthlyInterest(){
    double MonthlyInterest;
    MonthlyInterest=balance*getMonthlyInterestRate;
    return MonthlyInterest;
  }
  public void withdraw(double m){
    balance=balance-m;
  }
  public void deposit(double m){
    balance=balance-m;
  }
}
