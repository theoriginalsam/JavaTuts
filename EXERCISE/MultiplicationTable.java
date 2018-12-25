import java.util.*;
public class MultiplicationTable{

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
			System.out.println("Enter the number");
		int x= o.nextInt();
		for (int i=1;i<11 ;i++ ) {
			int mul=x*i;
			
				System.out.println(x + "*" + i + "=" + mul);
			
		}

	}
}