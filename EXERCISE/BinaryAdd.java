import java.util.*;
public class BinaryAdd{

public static void main(String[] args) {
	Scanner o=new Scanner(System.in);
		    System.out.println("Enter the first binary number");
	String x= o.next();
			System.out.println("Enter the Second binary number");
	String y= o.next();

		System.out.println(x);
	    System.out.println("+"+y);


int n1=Integer.parseInt(x,2);
int n2=Integer.parseInt(y,2);
int n3=n1+n2;

String n4=Integer.toBinaryString(n3);

		System.out.println("----------");
		System.out.println(n4);




}



}