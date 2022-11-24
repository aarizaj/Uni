import java.util.Scanner;
import java.util.Arrays;
public class LinAlgNameSurname{
  public static void main(String args[]){

    double x[][]=new double[3][3];
    double y[][]=new double[3][3];
    Print(x); Print1(y);
    double[][] c=multiplyMatrix(x,y);
    for(int i=0;i<3;i++){
      for(int j=0;j<3;i++){
        System.out.println(c[i][j]);
      }
    }
  }
  public static void Print(double[][] m1){
    int a=3;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter matrix1: ");
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
      m1[i][j]=input.nextDouble();
    }
  }
  }
  public static void Print1(double[][] m2){
    int a=3;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter matrix2: ");
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
      m2[i][j]=input.nextDouble();
    }
  }
  }
  public static double[][] multiplyMatrix(double[][] m1, double[][] m2){
    double[][] c=new double[3][3];
    double a=m1[0].length;
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++)
      c[i][j]+=(m1[i][j]*m2[i][j]);
    }
    return c;
  }
}
