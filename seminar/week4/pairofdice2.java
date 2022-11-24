public class pairofdice2{
  private int dice=3;
  private int dice2=4;

  public int pair(int a,int b){
    dice=a;
    dice2=b;
  }
  public void roll(){
    dice=(int)(Math.random()*6)+1;
    dice2=(int)(Math.random()*6)+1;
  }
  public int getDice(){
    return dice;
  }
  public int getDice2(){
    return dice2;
  }
  public static void main(String args[]){
    Int pair=new Int();
    pair dice;
    dice=new pair(1,1);
    System.out.println(" "+dice);
    pair dice2;
    dice2=new pair(2,2);
    System.out.println(" "+dice2);
  }
}
