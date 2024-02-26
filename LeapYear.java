import java.util.Scanner;

class LeapYear{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println(" To Check Whether The Given Number Is A Leap Year Or Not:");
System.out.println("Enter The Year:");
int year = scan.nextInt();
if( year % 4 == 0){
   if( year % 100 == 0){
      if( year % 400 == 0)
         System.out.println(year+" is a leap year.");
      else
        System.out.println(year+" is not a leap year.");
   }
   else
      System.out.println(year+" is a leap year.");
}
else
  System.out.println(year+" is not a leap year.");
}
} 