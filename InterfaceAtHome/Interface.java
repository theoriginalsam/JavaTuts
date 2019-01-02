interface I1{
    int x=3;   //default public and static and also f
    void fun1();     //default public 

}
interface I2{
    int z=5;
    void f2();

}

class A implements I1,I2{                       //two interfaces can be implemented 
    public void fun1(){
        System.out.println("I left her");

    }
    public void forZ(){
        int z=4;
System.out.println("Z is "+ z);
    }

    public void f2(){
        System.out.println("she left me");
    }
}

class Interface{
    public static void main(String[] args) {

     // I2 obj = new A();
   
    //   obj.fun1();
    //   obj.f2();
    //   obj.forZ();
//I2.z=44;   //error because the static value cannot ve changed
System.out.println("z is "+I2.z);
     
    }
}
