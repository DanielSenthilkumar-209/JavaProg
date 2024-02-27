import java.util.Scanner;

public class StringUpper{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("To Capitalise A Given Name:");
System.out.println("Enter A Name:");
String name = sc.nextLine();
System.out.println(name.toUpperCase());
}
}
