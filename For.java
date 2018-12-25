class A {

	public int percentage = 65 ;
	public void f1(){

		if(percentage>=80 && percentage<=100) {
			System.out.println("Dist");
			
		}
			else {
				System.out.println("No");
			}
		
		
	}
}

public class For {

	public static void main(String[] args) {
		A obj = new A();
		obj.f1();

	}
}