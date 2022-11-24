public class StopWatch{
  private long startTime;
  private long endTime;
  public StopWatch(){
    startTime=System.currentTimeMIllis();
  }
  public long getstartTime(){
    return startTime;
  }
  public long getendTime(){
    return endTime;
  }
  public void start(){
    startTime=System.currentTimeMIllis();
    System.out.println(startTime);
  }
  public void stop(){
    endTime=System.currentTimeMIllis();
    System.out.println(endTime);
  }
  public long getelapsedTime(){
    return endTime-startTime;
  }
  
}
