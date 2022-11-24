import java.util.Scanner;
public class TestLinAlgAmardaArizaj{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double[][] m1 = new double[3][3];
    double[][] m2 = new double[3][3];

      System.out.print("Enter matrix1: ");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          m1[i][j]= input.nextDouble();
        }
      }
      System.out.print("Enter matrix2: ");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          m2[i][j]= input.nextDouble();
        }
      }
      double[][] multi = new double[3][3];
      multi = LinAlgAmardaArizaj.multiplyMatrix(m1,m2);

      System.out.println("The multiplication of the matrices is: ");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          System.out.print(m1[i][j]+"   ");
        }
        if(i==1)
        System.out.print("   *   ");
        else
        System.out.print("       ");

        for(int j=0;j<3;j++){
          System.out.print(m2[i][j]+"   ");
        }
        if(i==1)
        System.out.print("    =    ");
        else
        System.out.print("         ");

        for(int j=0;j<3;j++){
          System.out.print((double)Math.round(multi[i][j]*100)/100+" ");
        }
        System.out.println();
      }
    }
  }
