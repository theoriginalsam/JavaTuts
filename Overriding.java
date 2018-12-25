class A{


	public void f1(int x){

		System.out.println("Class A");


	}
}

class B extends A{
		public void f1(int x){

		System.out.println("Class B");


	}

}

public class Overriding{

	public static void main(String[] args) {
		B o=new B();
		A o1=new A();

		
		o.f1(5);
		o1.f1(3);
	}
}