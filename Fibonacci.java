import java.util.Scanner;

class Fibonacci{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println("To Print The Nth Fibonacci Series");
System.out.println("Enter The Nth Number:");
int N = scan.nextInt();
int firstnum = 0; int secondnum = 1; int result  = 0;
System.out.println("\nThe Fibonacci Series Is As Follows:-");
if(N == 1)
   System.out.println('0');
if(N == 2)
   System.out.println('1');
System.out.println('0');
System.out.println('1');
for(int num = 0; num < N-2; num++){
   result = firstnum + secondnum;
   firstnum = secondnum;
   secondnum = result;
System.out.println(result);
}
}
}