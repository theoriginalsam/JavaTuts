class Example {

	public Example(){
		System.out.println("1");
	}

}
class Example1 extends Example {

	public Example1(){
		

		System.out.println("2");
	}
	public Example1(int k){
		

		System.out.println("3");

	}

	
}

public class Const2{

	public static void main(String[] args) {
		Example1 obj = new Example1(5);

	}
}