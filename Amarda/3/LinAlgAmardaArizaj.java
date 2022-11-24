public class LinAlgAmardaArizaj{
  public LinAlgAmardaArizaj(){}
    public static double [][] multiplyMatrix(double m1[][], double m2[][]) {
      int n = m1[0].length;
      int a = m1.length;
      int b = m2[0].length;
      double [][]multi =  new double[a][b];
      for(int i = 0;i < a;i++){
        for(int j = 0;j < b;j++){
          for(int z = 0;z < n;z++){
            multi[i][j] += a[i][z] * b[z][j];
          }}}
        return multi;
      }
    }
