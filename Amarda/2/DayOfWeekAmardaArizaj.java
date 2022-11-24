import java.util.Scanner;
public class DayOfWeekAmardaArizaj{
  public static void main(String args[]){

Scanner input=new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year=input.nextInt();
    System.out.print("Enter month: ");
    int m=input.nextInt();

    if(m==1){
    m=13; year=year-1;
  }
    if(m==2){
    m=14; year=year-1;
}
    int j,k;

    j=year/100;
    k=year%100;



    System.out.print("Enter day of the month: ");
    int q=input.nextInt();



    int h;
    h=(q+((26*(m+1))/10)+k+(k/4)+(j/4)+(5*j))%7;

    switch(h){
      case 0:System.out.println("Saturday"); break;
      case 1:System.out.println("Sunday"); break;
      case 2:System.out.println("Monday"); break;
      case 3:System.out.println("Tuesday"); break;
      case 4:System.out.println("Wednesday"); break;
      case 5:System.out.println("Thursday"); break;
      case 6:System.out.println("Friday");
    }
  }
}
