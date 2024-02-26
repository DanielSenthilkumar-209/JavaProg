import java.util.Scanner;

class QuotientRemainder{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println("To Find The QUOTIENT And REMAINDER For A Given Number:");
System.out.println("Enter The Dividend:");
int num1 = scan.nextInt();
System.out.println("Enter The Divisor:");
int num2 = scan.nextInt();
int Quo = num1/num2;
int Rem = num1%num2;
System.out.println(Quo+" is the Quotient.");
System.out.println(Rem+" is the Remainder.");
}
}
