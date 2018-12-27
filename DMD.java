class DMD{
    void callMe(){
        System.out.println("Inside A");
    }
}
class B extends A{
    void callMe(){
        System.out.println("Inside B");
    }
}

class c extends A {

    void callMe(){
        System.out.println("Inside B");
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