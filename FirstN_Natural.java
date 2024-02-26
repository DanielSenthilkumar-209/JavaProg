import java.util.Scanner;

class FirstN_Natural{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println("To Print First N Natural Numbers:");
System.out.println("Enter The Value Of N:");
int Num = scan.nextInt();
System.out.println("First "+Num+" Natural Numbers are:");
for(int n = 1; n <= Num; n++){
   System.out.println(n);
}
}
}