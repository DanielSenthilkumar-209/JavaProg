import java.util.Scanner;
class ReverseByIndex{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("To Reverse A Name:");
String name = sc.nextLine();
char[] array1 = name.toCharArray();
char[] reverse = new char[array1.length];
int j = 0;
for(int i = array1.length - 1; i >-1;i--){
   reverse[j] = array1[i];
   j++;
}
System.out.println(reverse);
}
}
