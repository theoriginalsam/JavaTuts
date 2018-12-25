public class ClassObj{

private static int len,breadth,height;

public void get(int x,int y,int z){
	len=x;
	breadth=y;
	height=z;

}

public void display(){

	System.out.println("Length is "+len);
		System.out.println("Length is "+breadth);
			System.out.println("Length is "+height);
}

}

class Example{
public static void main(String[] args) {
	int i=0;
	ClassObj ob1=new ClassObj();
	ob1.get(5+Integer.parseInt(args[i]),5+Integer.parseInt(args[i+1]),6+Integer.parseInt(args[i+2]));
	ob1.display();
	
	

			
 

		
	
}

}