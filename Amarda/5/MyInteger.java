public class MyInteger{
  int value;

  public MyInteger(int value){
    this.value=value;
  }
  public int getvalue(){
    return value;
  }



  public boolean isEven(){
    int value=8;
    boolean even=false;
    if(value%2==0)
    return true;
  }
  public static boolean isOdd(){
    int value=8;
    boolean even=false;
    if(value%2!=0)
    return true;
  }
  public static boolean isPrime(){
    int value=8;
    boolean even=false;
    if(value%value==0 && value%1==0)
    return true;
  }



  public static boolean isEven(int value){
    boolean even=false;
    if(value%2==0)
    return true;
  }
  public static boolean isOdd(int value){
    boolean even=false;
    if(value%2!=0)
    return true;
  }
  public static boolean isPrime(int value){
    boolean even=false;
    if(value%value==0 && value%1==0)
    return true;
  }



  public static boolean isEven(MyInteger value){
    return value.isEven();
  }
  public static boolean isOdd(MyInteger value){
    return value.isOdd();
  }
  public static boolean isPrime(MyInteger value){
    return value.isPrime();
  }




  public static int parseInt(char[] a){
    int result=0;
    for(char i : a)
    result+=Character.getNumericValue(i);
    return result;
  }


  public static int parseInt(String b){
    return Integer.parseInt(b);
  }
  }
