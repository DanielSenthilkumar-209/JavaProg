import java.util.Scanner;

class Factorial{

public static void main(String[] args){

Scanner scan = new Scanner (System.in);
System.out.println("To Find The Factorial Of  A Given Number:");
System.out.println("Enter The Number:");
int num = scan.nextInt();
int fact = 1;
for(int N = 1; N <= num; N++){
   fact = fact*N;
}
System.out.println("The Factorial of "+num+" is "+fact);
}
}


