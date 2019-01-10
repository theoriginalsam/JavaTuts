 class SingleInh
{
	public int num1,num2;

	void getdata(int x,int y)
	{
         num1 = x;
         num2 = y;
	}

	int add()
	{
		System.out.println("this is base class");
		int sum = num1+num2;
		return sum;
	}
}

class D extends SingleInh
{
int mult()
	{
		System.out.println("this is derived class");
		int product = num1*num2;
		return product;

	}
}

publlic class SingleDemo{
	public static void main(String[] args) {
		D obj = new D();
		obj.getdata(100,589);
	    obj.add();
		obj.mult();
		System.out.println("the addition is" + " " + obj.add());
		System.out.println("the multiplication is" + " " + obj.mult());
	}
}