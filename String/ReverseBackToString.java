import java.util.Scanner;
class ReverseBackToString{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("To Reverse A Name:");
String name = sc.nextLine();
char[] array1 = name.toCharArray();
System.out.println(array1);
char[] reverse = new char[array1.length];
int j = 0;
for(int i = array1.length - 1; i >-1;i--){
   reverse[j] = array1[i];
   j++;
}
System.out.println(reverse);
String str = "";
char s;
for(int a=0; a <=name.length();a++){
str += s.charAt(a);
}
System.out.println(str);
if(name == str)
   System.out.println("This is a palindrome.");
else
   System.out.println("This is noit a palindrome.");
}
}
