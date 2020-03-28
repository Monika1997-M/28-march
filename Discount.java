import java.util.Scanner;
public class Discount{
    public static void main(String[] args){
          System.out.println("Enter hours in railway time format:");
          Scanner sc=new Scanner(System.in);
          int t=0;
          int h=sc.nextInt();
          
          System.out.println(h);
          System.out.println("Enter minutes in b/w 1to 59 minutes:");
          int m=sc.nextInt();
          String format="AM";
          if (h >= 12) {
           t= h- 12;
           format= "PM";
      }
      else{
          t=h;
         format="AM";
      }
      System.out.println(t+":"+m+format);
      
         if(h==10  && m>00 && m<60 && format==format) {
             System.out.println("discount is 50% off");
         }
        else if(h==11 && m>00 && m<60 && format==format) {
             System.out.println("discount is 40% off");
         }
         
     else if(t>=0 && t<4 && m>00 && m<60 && format==format) {
            System.out.println("discount is 30% off");
         }
         else if( t>=4 && t<6 && m>00 && m<60 && format==format) {
            System.out.println("discount is 25% off");
         }
         
         
          else{
              System.out.println("shop opens from 10am to 6pm");
          }
         
      
      }
}