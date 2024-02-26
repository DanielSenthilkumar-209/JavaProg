import java.util.Scanner;

class ReverseNumber{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println("To Reverse A Given Number:");
System.out.println("Enter A  Number:");
int num = scan.nextInt();
int reverse = 0;
for(; num != 0; num = num/10){
   int remain = num % 10;
   reverse = reverse*10 + remain;
}
System.out.println("The Reverse of the given number is: "+reverse);
}
}
