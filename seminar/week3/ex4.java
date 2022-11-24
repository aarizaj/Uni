import java.util.Scanner;
public class ex4{
  public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   int a=3,b=5,c=9;
   System.out.println(notmain(a,b,c));
 }
 public static void notmain(int a,int b,int c){

   if(a<b){
     if(a<c)
     System.out.println(a);
   else if(b<a){
     if(b<c)
     System.out.println(b);
   }
   else
   System.out.println(c);
 }
}
}
