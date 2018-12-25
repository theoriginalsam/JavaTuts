class A{
public void f1(){




	System.out.println("Parent class");


}	

public void f2(){
	int z;
}

}


class B extends A {

public void f1(){



	super.f1();



System.out.println("Sub class");


}
public void f2(){
		int z;
	z=2;

	this.z=5;
	super.z=8;
System.out.println("Sub class"+z);

}


}
class Super{
public static void main(String[] args) {
	

	B obj = new B();

	obj.f1();
	obj.f2();




}
}