import java.util.Scanner;
public class testint{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);

    int value=input.nextInt();
    MyInteger lol=new MyInteger(value);

    System.out.println("is %d odd? ",lol.getvalue());
  }
}
