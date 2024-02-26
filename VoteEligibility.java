import java.util.Scanner;

class VoteEligibility{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println("To Check Eligibility For voting:");
System.out.println("Enter The Age:");
int age = scan.nextInt();
if(age >= 18)
   System.out.println("Eligibile To Vote!");
else
   System.out.println("Not Eligible To Vote!");
}
}

