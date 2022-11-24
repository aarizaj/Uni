import java.util.Scanner;
public class EulerAmardaArizaj{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    double e=1,cnt,fact;
    System.out.println("Enter i: ");
    double i=input.nextDouble();
    for(cnt=1;cnt<=i;cnt++){
      int a=1;
      for(fact=1;fact<cnt;fact++){
        a*=fact;
      }
      e+=1/(cnt*a);
    }
    System.out.println("e = "+e);
  }
}
