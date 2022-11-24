import java.util.Scanner;

public class ex2{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);

    System.out.println("Please write the year.");
    int year=input.nextInt();

    if(year%4==0 || (year%4==0 && year%100==0 && year%400==0))
    System.out.println("Yes. It is a leap year.");
    else
    System.out.println("Sorry. It is not a leap year.");

  }
}
