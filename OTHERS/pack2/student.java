package pack2;
import pack1.importing ;

public class student{


	public static void main(String[] args) {
			importing imp = new importing();
			imp.setRoll(24);
			imp.setName("HAri");
		System.out.println("Roll is "+ imp.getRoll());
		System.out.println("Name is "+ imp.getName());
	}
}