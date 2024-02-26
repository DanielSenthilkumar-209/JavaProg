import java.util.Scanner;

class GreatestAmongThree{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println(" To Find Greatest Among Three Numners:");
System.out.println("Enter 1st Number:");
int N1 = scan.nextInt();
System.out.println("Enter 2nd Number:");
int N2 = scan.nextInt();
System.out.println("Enter the 3rd Number:");
int N3 = scan.nextInt();

if(N1 > N2){
   if(N1 > N3)
      System.out.println(N1+" is the greatest number.");
   else
      System.out.println(N3+ " is the greatest number.");
}
else{
   if(N2 > N3)
      System.out.println(N2+" is the greatest number.");
   else
      System.out.println(N3+" is the greatest number.");
}
}
}