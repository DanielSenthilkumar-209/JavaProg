import java.util.Scanner;
public class StringReplace{

public static void main(String[] args){

System.out.println("To Replace a given Name in the String:-");
Scanner sc = new Scanner(System.in);
System.out.println("Enter A Name:");
String name = sc.nextLine();
System.out.println(name+" is printed.");
System.out.println("Enter Another Name:");
name = sc.nextLine();
System.out.println(name+" is replaced.");
}
}
