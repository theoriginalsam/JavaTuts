

class Example{

	private int l,b,h ;
	public void fun(int l,int b, int h){
		this.l=l; this.b=b; this.h=h;

	}

	public int getL(){
		return l;
	}
	public int getB(){
		return b;
	}
	public int getH(){
		return h;
	}




}

public class This{
	public static void main(String[] args) {
		Example e1=new Example();

		e1.fun(3,4,5);
 System.out.println("L "+e1.getL());
  System.out.println("H "+e1.getH());
   System.out.println("B "+e1.getB());


	}
}