public class TestStopWatch{
  public static void main(String args[]){
    int[] arr=new int[100000];
    for(int i=0;i<arr.length;i++){
      arr[i]=(int)(Math.random()*9)+1;
    }
    StopWatch watch=new StopWatch();
    watch.start();
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;;i++){
        if(arr[j]==arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    watch.stop();
    long fullTime=watch.getelapsedTime();
    System.out.println(fullTime);
  }
}
