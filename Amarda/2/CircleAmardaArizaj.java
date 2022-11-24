import java.util.Scanner;
public class CircleAmardaArizaj{
  public static void main(String args[]){

    Scanner input=new Scanner(System.in);
    System.out.println("Enter points:");
    int x=input.nextInt();
    int y=input.nextInt();

    int r=10;
    int center_x=0;
    int center_y=0;

    if((Math.pow((x - center_x),2)+Math.pow((y - center_y),2))<Math.pow(r,2))
    System.out.println("This is inside the circle");
    if((Math.pow((x - center_x),2)+Math.pow((y - center_y),2))==Math.pow(r,2))
    System.out.println("This on the circle");
    if((Math.pow((x - center_x),2)+Math.pow((y - center_y),2))>Math.pow(r,2))
    System.out.println("This is outside the circle");
  }
}
