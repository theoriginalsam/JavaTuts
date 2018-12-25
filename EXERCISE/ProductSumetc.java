import java.util.* ;


public class ProductSumetc{
public static void main(String[] args) {
	
	Scanner o=new Scanner(System.in);
	System.out.println("Enter the first number");
	int x=o.nextInt();
	System.out.println("Enter the Second number");
	int y=o.nextInt();
	int sum=x+y;
	int multi=x*y;
	double div=(double)x/(double)y;
	int sub=x-y;
		System.out.println("The Sum is "+sum);
		System.out.println("The Product is "+multi);
		System.out.println("The Division is "+div);
		System.out.println("The Difference is "+sub);


	
}

}