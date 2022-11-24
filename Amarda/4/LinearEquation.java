public class LinearEquation{
  private  int a,b,c,d,e,f;

  public LinearEquation(){
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;
    this.e=e;
    this.f=f;
  }
  public int geta(){
    return a;
  }
  public int getb(){
    return b;
  }
  public int getc(){
    return c;
  }
  public int getd(){
    return d;
  }
  public int getf(){
    return f;
  }
  public int gete(){
    return e;
  }
  public static boolean isSolvable(int a,int b,int c,int d){
    boolean solve=false;
    if((a*d)-(b*c)!=0)
    solve=true;
    return bruh;
  }
  public static double getX(int a,int b,int c,int d,int e,int f){
    int x=((e*d)-(b*f))/((a*d)-(b*c));
    return x;
  }
  public static double getY(int a,int b,int c,int d,int e,int f){
    int y=((a*f)-(e*c))/((a*d)-(b*c));
    return y;
  }
}
