public class Example{


	public static void main(String[] args) {
		Student e= new Student();

		e.setName("Samir");
		e.setAge(18);
		e.setGrade(4);
		e.setRoll(30);
		e.setAddress("Pokhara");
		System.out.println("Name: "+e.getName());
		System.out.println("Age "+e.getAge());
		System.out.println("Grade: "+e.getGrade());
		System.out.println("ROll: "+e.getRoll());
		System.out.println("Address: "+e.getAddress());

	}
}