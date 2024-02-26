import java.util.Scanner;

class OddorEven{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println("To Check The Given Number Is ODD or EVEN:");
System.out.println("Enter A Number:");
int num = scan.nextInt();
if(num%2 == 0)
   System.out.println(num+" is an even number.");
else
   System.out.println(num+" is an odd number.");
}
}
