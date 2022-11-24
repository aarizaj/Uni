import java.util.Scanner;

public class AreaTriangleAmardaArizaj{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int x1,x2,x3,y1,y2,y3;
double a,b,c,m1,n1,m2,n2,m3,n3,s;
double total;
System.out.println("Enter x1:");
x1=input.nextInt();
System.out.println("Enter y1:");
y1=input.nextInt();
System.out.println("Enter x2:");
x2=input.nextInt();
System.out.println("Enter y2:");
y2=input.nextInt();
System.out.println("Enter x3:");
x3=input.nextInt();
System.out.println("Enter y3:");
y3=input.nextInt();

m1=x2-x1;
n1=y2-y1;
a=Math.sqrt((Math.pow(m1,2)+Math.pow(n1,2)));


m2=x3-x2;
n2=y3-y2;
b=Math.sqrt((Math.pow(m2,2)+Math.pow(n2,2)));


m3=x1-x3;
n3=y1-y3;
c=Math.sqrt((Math.pow(m3,2)+ Math.pow(n3,2)));

s=(a+b+c)/2;

total=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.printf("Area of the triangle: %.2f",total);
}
}
