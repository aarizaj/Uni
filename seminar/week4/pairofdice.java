public class pairofdice{
  public int dice=3;
  public int dice2=4;

  public void roll(){
    //roll the dice by setting them to be a random number between 1 and 6
    dice=(int)(Math.random()*6)+1;
    dice2=(int)(Math.random()*6)+1;
  }
}
