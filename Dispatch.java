class A{
    void callMe(){
        System.out.println("Inside A");
    }
}
class B extends A{
    void callMe(){
        System.out.println("Inside B");
    }
}

class C extends A {

    void callMe(){
        System.out.println("Inside C");
    }
}
class Dispatch{
    public static void main(String[] args) {
        A a =new A();
        B b =new B();
        C c =new C();
        A r;
        r=a;
        r.callMe();
        r=b;
        r.callMe();
        r=c;
        r.callMe();

        
    }
}