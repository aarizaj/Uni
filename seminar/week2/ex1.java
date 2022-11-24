import java.util.Scanner;
public class ex1{
public static void main(String args[]){
Scanner input=new Scanner(System.in);

System.out.println("Please enter name: ");
String name=input.next();
if(name.equals("alex") || name.equals("emily")){
if(name.equals("alex"))
System.out.println("Hi,Alex please enter your password: ");
else
System.out.println("Hi Emily, please enter your password: ");
}
else
System.out.println("Wrong");


String password=input.next();
{
if(name.equals("alex") && password.equals("mightyducks"))
System.out.println("Welcome Alex. You are now logged in.");
else
System.out.println("The password is incorrect. Run the program again");
}
{
if(name.equals("emily") && password.equals("cat"))
System.out.println("Welcome Emily. You are now logged in.");
else
System.out.println("The password is incorrect. Run the program again");
}
}
}
