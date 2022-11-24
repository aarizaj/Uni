import java.util.Scanner;
public class TestLinearEquation{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);

    double x,y;
    System.out.print("Enter a: ");
    int a=input.nextInt();
    System.out.print("Enter b: ");
    int b=input.nextInt();
    System.out.print("Enter c: ");
    int c=input.nextInt();
    System.out.print("Enter d: ");
    int d=input.nextInt();
    System.out.print("Enter e: ");
    int e=input.nextInt();
    System.out.print("Enter f: ");
    int f=input.nextInt();

    boolean bruh=LinearEquation.isSolvable(a,b,c,d);
    if(solve==false){
    System.out.println("The equation has no solution.");
  }
else{
  x=LinearEquation.getX(a,b,c,d,e,f);
  y=LinearEquation.getY(a,b,c,d,e,f);
    System.out.println("x = "+x);
    System.out.print("y = "+y);
  }
}
}
