abstract class A {
int x;
public void f1(){
    System.out.println("SOME");
}

A(){
    System.out.println("I am Constructor");
}
}

class B extends A{
public void f2(){
    System.out.println("More");
}
}

class Abs {

    public static void main(String[] args) {
     
        B obj =new B();
        //obj.f2();
        obj.f1();
    }
}