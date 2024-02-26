import java.util.Scanner;

class Palindrome{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println("To Check Whether The Given Number Is Palindrome Or Not:");
System.out.println("Enter A Number: ");
int num = scan.nextInt();
int reversedNum = 0;
int originalNum = num;
for(; num != 0; num = num/10){
   int remain = num % 10;
   reversedNum  = reversedNum * 10 + remain;
}
if(originalNum == reversedNum)
   System.out.println(originalNum+" is a palindrome number.");
else
   System.out.println(originalNum+ " is not a palindrome number.");
}
}

 
