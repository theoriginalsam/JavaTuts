import java.util.* ;

public class InputAdd{



	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
			System.out.println("Enter the number");
		int x= o.nextInt();
		int num=0;
		int rem;
		

		while(x!=0){

			 rem=x%10;

			num=num+rem;

			x=x/10;
			

		}

		
System.out.println("The sum is " + num);

			
	}
	}