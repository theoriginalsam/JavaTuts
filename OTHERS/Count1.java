import java.util.Scanner;

public class Count1 {

public static void main(String[] args) {
int letter = 0;
int number = 0;
int space = 0;
int other = 0;
int index;
int unicode = 0;
String string;
Scanner in = new Scanner(System.in);

System.out.print("Input a string: ");
string = in.nextLine();

index = string.length() - 1;

while (index >= 0) {
unicode = string.codePointAt(index);

//uppercase letters
if (unicode >= 65 && unicode <= 90) {
letter++;
}else 
//lowercase letters
if (unicode >= 97 && unicode <= 122) {
letter++;
}else//space
if (unicode == 32) {
space++;
}else//numbers 
if(unicode >=48 && unicode <= 57){
number++;
}else{
other++;
}

index--;
}

System.out.println("Letter: " + letter);
System.out.println("Space: " + space);
System.out.println("Number: " + number);
System.out.println("Other: " + other);
}
}

